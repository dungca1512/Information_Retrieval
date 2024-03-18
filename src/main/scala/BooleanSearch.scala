import java.util.Scanner
import scala.io.Source

object BooleanSearch {
  var index: Map[String, Set[String]] = Map.empty[String, Set[String]]

  /**
   * Load an inverted index from a text file.
   *
   * @param indexPath
   */
  def loadIndex(indexPath: String): Unit = {
    // fill-in the index
    val textSource = Source.fromFile(indexPath)
    val lines = textSource.getLines()
    index = lines.map { line =>
      val tokens = line.split("""[\s]+""")
      (tokens.head, tokens.tail.toSet)
    }.toMap
  }

  /**
   * Search for documents containing a term.
   *
   * @param term
   * @return a set of document ids.
   */
  def search(term: String): Set[String] = {
    index.getOrElse(term, Set.empty[String]).toList.sorted.toSet
  }

  /**
   * Search for documents containing both term1 and term2.
   *
   * @param term1
   * @param term2
   * @return a set of document ids.
   */
  private def searchAnd(term1: String, term2: String): Set[String] = {
    val doc1 = search(term1)
    val doc2 = search(term2)
    doc1.intersect(doc2).toList.sorted.toSet
  }

  /**
   * Search for documents containing either term1 or term2.
   *
   * @param term1
   * @param term2
   * @return a set of document ids.
   */
  private def searchOr(term1: String, term2: String): Set[String] = {
    val doc1 = search(term1)
    val doc2 = search(term2)
    doc1.union(doc2).toList.sorted.toSet
  }

  /**
   * Search for documents not containing a term.
   *
   * @param term
   * @return a set of document ids.
   */
  private def searchNot(term: String): Set[String] = {
    val termDocs = search(term)
    val allDocs = index.values.flatten.toSet
    allDocs.diff(termDocs).toList.sorted.toSet
  }

  /**
   * Search for a query, for example: "tom AND (NOT jerry)"
   *
   * @param query
   * @return a set of document ids.
   */
  private def searchQuery(query: String): Set[String] = {
    val tokens = query.split(" ")
    val term1 = tokens.head
    val term2 = tokens.last

    val isAndQuery = tokens(1) == "AND"
    val isOrQuery = tokens(1) == "OR"

    val result: Set[String] = if (isAndQuery) {
      searchAnd(term1, term2)
    } else {
      searchOr(term1, term2)
    }
    result
  }
  def main(args: Array[String]): Unit = {
    // Load to file index.txt
    val index: Unit = loadIndex("index/index.txt")

    // Init Scanner object
    val scanner = new Scanner(System.in)

    // Enter terms from the keyboard
    print("Enter term1: ")
    val term1 = scanner.nextLine()

    print("Enter term2: ")
    val term2 = scanner.nextLine()

    // Search for documents for keyword "oil"
    val results = BooleanSearch.search(term1)

    // Search for documents containing "iraq" and "oil"
    val resultsAnd = BooleanSearch.searchAnd(term1, term2)

    // Search for documents containing either "iraq" and "oil"
    val resultsOr = BooleanSearch.searchOr(term1, term2)

    // Search for documents not containing a term "oil"
    val resultsNot = BooleanSearch.searchNot(term1)

    // Search for a query, for example: "tom AND (NOT jerry)"
    val resultsQuery = BooleanSearch.searchQuery(s"$term1 AND (NOT $term2)")

    // Print the results
    println(s"1. query: $term1")
    println(results)

    println(s"2. query: $term1 AND $term2")
    println(resultsAnd)

    println(s"3. query: $term1 OR $term2")
    println(resultsOr)

    println(s"4. query: NOT $term1")
    println(resultsNot)

    println(s"5. query: $term1 AND (NOT $term2)")
    println(resultsQuery)
  }
}