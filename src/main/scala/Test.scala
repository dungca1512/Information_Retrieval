import scala.io.Source

object Test {

  def loadVector(path: String): List[Map[String, List[Double]]] = {
    val source = Source.fromFile(path, "UTF-8")
    val lines = source.getLines.toList
    val result = lines.map(line => {
      val data = line.split(" ").toList
      val token = data.head
      val vector = data.tail.map(_.toDouble)
      Map(
        "vector" -> vector
      )
    })
    result
  }
  def main(args: Array[String]): Unit = {
    println("Hello World!")
  }
}