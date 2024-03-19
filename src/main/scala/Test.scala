import scala.io.Source
import scala.util.matching.Regex

object Test {
  private def extractHref(html: String): Option[String] = {
    val hrefRegex = """<a[^>]+href=\[\w-]+$>""".r
    val matchResult = hrefRegex.findFirstMatchIn(html)
    matchResult.map(_.group(1))
  }

  def main(args: Array[String]): Unit = {
    // Đường dẫn tới file HTML của bạn
    val url = "https://vnexpress.net/"

    // Đọc nội dung của tệp HTML
    val source = Source.fromURL(url)
    val html = source.mkString

    // Trích xuất href từ thẻ <a> trong HTML
    extractHref(html) match {
      case Some(href) => println(s"Found href: $href")
      case None => println("No href found in the HTML content.")
    }
  }
}
