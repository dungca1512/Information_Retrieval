import java.util.Scanner

object Main {
  def main(args: Array[String]): Unit = {
    // Load to file index.txt
    val index = BooleanSearch.loadIndex("index/index.txt")

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