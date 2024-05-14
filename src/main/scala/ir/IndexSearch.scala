package ir

import java.nio.file.{Files, Paths, StandardOpenOption}
import java.util.stream.Collectors
import scala.io.Source
import scala.jdk.CollectionConverters._

object IndexSearch {

  private def tokenize(path: String) = {
    val textSource = Source.fromFile(path, "ISO-8859-1")
    val lines = textSource.getLines().toList
    val tokens = lines.flatMap(line => line.toLowerCase().split("""[\s,.)(<>':";?-]+""")
        .map(_.trim))
      .distinct.toList
    val unigrams = tokens.toSet
    val bigrams = createBigrams(tokens)
    (unigrams, bigrams.toSet)
  }

  private def createBigrams(tokens: List[String]): List[String] = {
    tokens.sliding(2).map(pair => pair.mkString(" ")).toList
  }

  private def createIndexList(dir: String): Unit = {
    val paths = Files.list(Paths.get(dir))
      .filter(f => !Files.isDirectory(f))
      .map(_.getFileName())
      .map(_.toString)
      .collect(Collectors.toList())
      .asScala.toList

    // key -> values (key == docId, values = (unigrams, bigrams))
    val docIdx = paths.map(path => (path, tokenize(dir + path))).toMap
    val docs = docIdx.keySet

    val vocab = docIdx.flatMap(kv => kv._2._1).toSet
    val bigramVocab = docIdx.flatMap(kv => kv._2._2).toSet
    val allTerms = vocab ++ bigramVocab

    val index = allTerms.map { term =>
      (
        term,
        docs.map(id => if (docIdx(id)._1.contains(term) || docIdx(id)._2.contains(term)) id else "").filter(_.nonEmpty)
      )
    }.toMap

    // Step 6: save the index to index.txt (Java)
    val output = index.map { case (term, docs) =>
      term + "\t" + docs.mkString(" ")
    }.toList
    Files.write(Paths.get("index/index.txt"), output.asJava, StandardOpenOption.CREATE_NEW)
    println("Done!")
  }

  def main(args: Array[String]): Unit = {
    val dir = "data/reuters/test/"
    createIndexList(dir)
  }
}