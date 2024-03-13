import scala.io.Source

object BooleanSearch {
  var index: Map[String, Set[String]] = Map.empty[String, Set[String]]

  /**
   * Load an inverted index from a text file.
   *
   * @param indexPath
   */
  def loadIndex(indexPath: String) = {
    // fill-in the index
    val lines = Source.fromFile(indexPath).getLines()
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
    // Tìm các tài liệu có chứa term trong file index rồi trả về Set, nếu không trả về Set rỗng
    index.getOrElse(term, Set.empty[String]).toList.sorted.toSet
  }

  /**
   * Search for documents containing both term1 and term2.
   *
   * @param term1
   * @param term2
   * @return a set of document ids.
   */
  def searchAnd(term1: String, term2: String): Set[String] = {
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
  def searchOr(term1: String, term2: String): Set[String] = {
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
  def searchNot(term: String): Set[String] = {
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
}