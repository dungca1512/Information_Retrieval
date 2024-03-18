import scala.io.Source
import java.nio.file.{Files, Paths}
import java.util.stream.Collectors
import scala.jdk.CollectionConverters._
import java.nio.file.StandardOpenOption

object IndexSearch {

  private def tokenize(path: String) = {
    val textSource = Source.fromFile(path, "ISO-8859-1")
    val lines = textSource.getLines().toList
    lines.flatMap(line => line.toLowerCase().split("""[\s,.)(<>':";?-]+""")
        .map(_.trim))
      .distinct.toSet
  }

  private def createIndexList(dir: String): Unit = {
    val paths = Files.list(Paths.get(dir))
      .filter(f => !Files.isDirectory(f))
      .map(_.getFileName())
      .map(_.toString)
      .collect(Collectors.toList())
      .asScala.toList

    // key -> values (key == docId, values = list of tokens in that docId)
    val docIdx = paths.map(path => (path, tokenize(dir + path))).toMap
    val docs = docIdx.keySet

    val vocab = docIdx.flatMap(kv => kv._2).toSet

    val index = vocab.map { term =>
      (
        term,
        docs.map(id => if (docIdx(id).contains(term)) id else "").filter(_.nonEmpty)
      )
    }.toMap

    // Step 6: save the index to index.txt (Java)
    val output = vocab.map { term =>
      term + "\t" + index(term).mkString(" ")
    }.toList
    Files.write(Paths.get("index/index.txt"), output.asJava, StandardOpenOption.CREATE_NEW)
    println("Done!")
  }
  def main(args: Array[String]): Unit = {
    val dir = "data/reuters/test/"
    createIndexList(dir)
  }
}