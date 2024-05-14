import org.apache.spark.ml.feature.{RegexTokenizer, Word2Vec}
import org.apache.spark.sql.SparkSession

object Test {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .appName("My Spark Application")
      .master("local[*]")
      .getOrCreate()

    val path = "json/data.json"
    val df = spark.read.option("multiline", value = true).json(path)

    val regexTokenizer = new RegexTokenizer().setInputCol("content").setOutputCol("tokens").setPattern("""[\s)(,.;-?"]+""")

    val ef = regexTokenizer.transform(df)

    val word2vec = new Word2Vec().setInputCol("tokens").setOutputCol("vector").setVectorSize(5).setMinCount(2)

    val model = word2vec.fit(ef)

    val ff = model.transform(ef)

    ff.show
  }
}