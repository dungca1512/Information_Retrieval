import org.apache.spark.ml.feature.{HashingTF, IDF, Tokenizer}
import org.apache.spark.ml.linalg.SparseVector
import org.apache.spark.sql.types._
import org.apache.spark.sql.{Row, SparkSession}

object Vectorization {

  private def cosineSimilarity(vector1: SparseVector, vector2: SparseVector): Double = {
    val dotProduct = vector1.indices.zip(vector1.values)
      .flatMap { case (i, v1) =>
        vector2.indices.zip(vector2.values).collect {
          case (`i`, v2) => v1 * v2
        }
      }.sum

    val norm1 = Math.sqrt(vector1.values.map(v => v * v).sum)
    val norm2 = Math.sqrt(vector2.values.map(v => v * v).sum)

    dotProduct / (norm1 * norm2)
  }

  def main(args: Array[String]): Unit = {
    // Khởi tạo SparkSession
    val spark = SparkSession.builder()
      .appName("TF-IDFExample")
      .master("local[*]")
      .getOrCreate()

    // Tạo DataFrame với query và document
    val schema = StructType(
      StructField("id", IntegerType, nullable = false) ::
        StructField("type", StringType, nullable = false) ::
        StructField("text", StringType, nullable = false) :: Nil
    )
    val rows = Seq(
      Row(0, "query", "machine learning"),
      Row(1, "document", "This is a document about machine learning algorithms.")
    )
    val rowRDD = spark.sparkContext.parallelize(rows)
    val data = spark.createDataFrame(rowRDD, schema)

    // Tokenize text
    val tokenizer = new Tokenizer().setInputCol("text").setOutputCol("words")
    val wordsData = tokenizer.transform(data)

    // Tính hashingTF
    val hashingTF = new HashingTF()
      .setInputCol("words")
      .setOutputCol("rawFeatures")
      .setNumFeatures(20)

    val featurizedData = hashingTF.transform(wordsData)

    // Tính IDF
    val idf = new IDF().setInputCol("rawFeatures").setOutputCol("features")
    val idfModel = idf.fit(featurizedData)

    // Tính TF-IDF vectors
    val rescaledData = idfModel.transform(featurizedData)

    // Lấy TF-IDF vectors của query và document
    val queryVector = rescaledData.select("features").where("type == 'query'").head().getAs[SparseVector](0)
    val documentVector = rescaledData.select("features").where("type == 'document'").head().getAs[SparseVector](0)

    // Tính khoảng cách và độ tương đồng cosine
    val result: Double = cosineSimilarity(queryVector, documentVector)

    println(s"Cosine similarity = $result")
  }
}