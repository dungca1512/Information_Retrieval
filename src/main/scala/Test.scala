import org.apache.spark.ml.feature.{RegexTokenizer, Word2Vec}
import org.apache.spark.sql.SparkSession
import scala.io.StdIn

object Test {

  private def findNearistToken(path: String, token: String, num: Int): Unit = {
    val spark = SparkSession.builder()
      .appName("My Spark Application")
      .master("local[*]")
      .getOrCreate()
    val df = spark.read.option("multiline", value = true).json(path)
    val regexTokenizer = new RegexTokenizer().setInputCol("content").setOutputCol("tokens").setPattern("""[\s)(,.;-?"]+""")
    val ef = regexTokenizer.transform(df)
    val word2vec = new Word2Vec().setInputCol("tokens").setOutputCol("vector").setVectorSize(5).setMinCount(2)
    val model = word2vec.fit(ef)
    model.findSynonyms(token, num).show()
    spark.stop()
  }

  def main(args: Array[String]): Unit = {
    print("Enter OS: ")
    val os = StdIn.readLine()
    var path = ""
    if (os == "windows") {
      path = "E:/IdeaProjects/Information_Retrieval/json/data.json"
    }
    else {
      path = "/home/dungca/IdeaProjects/Information_Retrieval/json/data.json"
    }
    print("Enter token: ")
    val token = StdIn.readLine()
    print("Enter num: ")
    val num = StdIn.readInt()
    findNearistToken(path, token, num)
  }
}