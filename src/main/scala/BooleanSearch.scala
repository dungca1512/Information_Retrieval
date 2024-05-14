import java.util.Scanner
import scala.io.Source

object BooleanSearch {

  var index: Map[String, Set[String]] = Map.empty[String, Set[String]]

  /**
   * Load an inverted index from a text file.
   *
   * @param indexPath
   */
  def loadIndex(indexPath: String): Map[String, Set[String]] = {
    // fill-in the index
    val textSource = Source.fromFile(indexPath)
    val lines = textSource.getLines()
    index = lines.map { line =>
      val tokens = line.split("""\t""", 2)
      val term = tokens(0)
      val docList = tokens(1).split("""\s+""").toSet
      (term, docList)
    }.toMap
    index
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
  def searchQuery(query: String): Set[String] = {
    val tokens = query.split(" ").toList
    def processQuery(tokens: List[String]): Set[String] = {
      if (tokens.isEmpty) {
        Set.empty[String]
      } else if (tokens.head == "(") {
        val (innerQuery, remaining) = extractInnerQuery(tokens.tail)
        val innerResult = processQuery(innerQuery)
        if (remaining.headOption.contains("NOT")) {
          searchNot(remaining.tail.mkString(" "))
        } else {
          innerResult
        }
      } else if (tokens.head == "NOT") {
        searchNot(tokens.tail.mkString(" "))
      } else if (tokens.tail.headOption.contains("AND")) {
        searchAnd(tokens.head, processQuery(tokens.tail.tail).mkString(" "))
      } else if (tokens.tail.headOption.contains("OR")) {
        searchOr(tokens.head, processQuery(tokens.tail.tail).mkString(" "))
      } else {
        search(tokens.mkString(" "))
      }
    }
  /**
   * Extract the inner query within parentheses from a list of query tokens.
   *
   * This function is used to separate a nested query within parentheses from the main query,
   * allowing the query to be processed recursively.
   *
   * @param tokens A list of query tokens starting from the first token after the opening parenthesis.
   * @return A tuple containing two lists:
   *         - The first list is the inner query within parentheses, excluding the opening and closing parentheses.
   *         - The second list is the remaining part of the main query after the inner query.
   */
    def extractInnerQuery(tokens: List[String]): (List[String], List[String]) = {
      var innerQuery = List.empty[String]
      var remaining = List.empty[String]
      var parensCount = 0
      for (token <- tokens) {
        if (token == "(") {
          parensCount += 1
        } else if (token == ")") {
          parensCount -= 1
        }
        if (parensCount >= 1) {
          innerQuery = innerQuery :+ token
        } else {
          remaining = remaining :+ token
        }
      }
      (innerQuery.tail.init, remaining)
    }
    processQuery(tokens)
  }
  def main(args: Array[String]): Unit = {
    // Load to file index.txt
    val index_path = "index/index.txt"
    val index: Map[String, Set[String]] = loadIndex(index_path)

    // Init Scanner object
    val scanner = new Scanner(System.in)

    // Enter terms from the keyboard
    print("Enter term1: ")
    val term1 = scanner.nextLine()

    print("Enter term2: ")
    val term2 = scanner.nextLine()

    // Search for documents for keyword "oil"
    val results_1 = BooleanSearch.search(term1)
    val results_2 = BooleanSearch.search(term2)

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
    println(results_1)

    println(s"1. query: $term2")
    println(results_2)

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