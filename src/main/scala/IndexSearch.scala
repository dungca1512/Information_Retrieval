import scala.io.Source
import java.nio.file.Files
import java.nio.file.Paths
import java.util.stream.Collectors
import scala.collection.JavaConverters._
import java.nio.file.StandardOpenOption

object IndexSearch {

  def tokenize(path: String) = {
    val lines = Source.fromFile(path, "ISO-8859-1").getLines().toList
    lines.flatMap(line => line.toLowerCase().split("""[\s,.)(<>':";?-]+""")
        .map(_.trim))
      .distinct.toSet
  }

  def main(args: Array[String]): Unit = {
    val dir = "data/reuters/test/"
    val paths = Files.list(Paths.get(dir))
      .filter(f => !Files.isDirectory(f))
      .map(_.getFileName())
      .map(_.toString)
      .collect(Collectors.toList())
      .asScala.toList

    // key -> values (key == docId, values = list of tokens in that docId)
    val docIdx = paths.map(path => (path, tokenize(dir + path))).toMap
    val docs = docIdx.keySet
//    println(docs.size)
//    println(docIdx("16074"))

    val vocab = docIdx.flatMap(kv => kv._2).toSet
//    println("vocab Size = " + vocab.size)

    val index = vocab.map { term =>
      (
        term,
        docs.map(id => if (docIdx(id).contains(term)) id else "").filter(_.nonEmpty)
      )
    }.toMap

//    println(index("iraq"))

    // Step 6: save the index to index.txt (Java)
    val output = vocab.map { term =>
      term + "\t" + index(term).mkString(" ")
    }.toList
    Files.write(Paths.get("index/index.txt"), output.asJava, StandardOpenOption.CREATE_NEW)
    println("Done!")
  }
}