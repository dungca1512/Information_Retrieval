import scala.io.Source
import scala.math.sqrt
import scala.io.StdIn

object Word2Vec {

  private case class Token(token: String, vector: List[Double])
  /**
   * Load a data file and create a set of tokens and vectors of that token
   * @param path
   * @return a set of tokens and vectors of that token
   */
  private def loadVector(path: String): List[Token] = {
    val source = Source.fromFile(path, "UTF-8")
    val lines = try source.getLines.toList finally source.close()
    lines.map(line => {
      val data = line.split(" ").toList
      val token = data.head
      val vector = data.tail.map(_.toDouble)
      Token(token, vector)
    })
  }

  /**
   * Calculate a Cosine distance between two vectors
   * @param A
   * @param B
   * @return a Cosine distance between two vectors A and B
   */
  private def cosineDistance(A: List[Double], B: List[Double]): Double = {
    val dotProduct = A.zip(B).map(pair => pair._1 * pair._2).sum
    val normA = sqrt(A.map(x => x * x).sum)
    val normB = sqrt(B.map(x => x * x).sum)
    val cosineSimilarity = dotProduct / (normA * normB)
    1 - cosineSimilarity
  }

  /**
   * Get the vector representing the token in the Data list
   * @param token
   * @param data
   * @return vector representing the token
   */
  private def getVector(token: String, data: List[Token]): List[Double] = {
  data.find(_.token == token).map(_.vector).getOrElse(List.empty)
}

  def main(args: Array[String]): Unit = {

    val path = "data/glove.6B.50d.txt"
    val data: List[Token] = loadVector(path)

    print("Token 1: ")
    val token1 = StdIn.readLine()

    print("Token 2: ")
    val token2 = StdIn.readLine()

    val vector1 = getVector(token1, data)
    val vector2 = getVector(token2, data)

    val distance = cosineDistance(vector1, vector2)
    println(s"Cosine distance between $token1 and $token2 is: $distance")
  }
}
