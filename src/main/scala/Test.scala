import WebScraping.{getUrls, saveJson}
object Test {
  def main(args: Array[String]): Unit = {
    val domain = "https://vnexpress.net/kinh-doanh"
    val links = getUrls(domain)
    saveJson(links)
  }
}
