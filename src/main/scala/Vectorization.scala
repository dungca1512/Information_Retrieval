import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
object Vectorization {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("My Application")
      .master("local[*]")
      .getOrCreate()

    val df = spark.read
      .format("json")
      .option("multiLine", value = true)
      .option("encoding", "UTF-8")
      .load("json/data.json")

    df.show(10)
    df.printSchema()
  }
}
