import org.jsoup.Jsoup
import play.api.libs.json._

import java.io.{File, FileWriter}
import scala.io.Source
object WebScraping {
    /**
     * extract text from URL of a article
     * @param url
     * @return text
     */
    private def extractText(url: String): String = {
        val doc = Jsoup.connect(url).get()
        doc.select("p").text()
    }
    /**
     * extract date from URL of a article
     * @param url
     * @return date
     */
    private def extractDate(url: String): String = {
        val html = Jsoup.connect(url).get().html()
        val pattern = """<script type="application/ld\+json">(.*?)</script>""".r
        val jsonMatches = pattern.findAllMatchIn(html).map(_.group(1))
        val datePublishedOption = jsonMatches
          .map(json => {
              try {
                  val datePublishedPattern = """"datePublished"\s*:\s*"(.*?)"""".r
                  val datePublished = datePublishedPattern.findFirstMatchIn(json).map(_.group(1))
                  datePublished
              } catch {
                  case _: Throwable => None
              }
          })
          .find(_.isDefined)
          .flatten
        datePublishedOption match {
            case Some(datePublished) => datePublished
            case None => ""
        }
    }
    /**
     * get a set of URL from a domain
     * @param domain
     * @return a set of URL
     */
    private def getUrls(domain: String): Set[String] = {
        val urlSource = Source.fromURL(domain)
        val response = urlSource.mkString
        val regex = """/[\w-]+\d+\.epi""".r
        val links = regex.findAllIn(response).toSet
        links.map(link => "https://baomoi.com" + link)
    }
    /**
     * save a JSON object to json list
     * @param links
     * @return a json list
     */
    private def saveJson(links: Set[String]): Unit = {
        val jsonObjects = links.map(link => Map(
            "url" -> link,
            "content" -> extractText(link),
            "date" -> extractDate(link)
        )).toList
        val json = Json.toJson(jsonObjects)
        val file = new File("json/data.json")
        val fileWriter = new FileWriter(file)
        fileWriter.write(json.toString())
        fileWriter.close()
    }
    def main(args: Array[String]): Unit = {
        val domain = "https://baomoi.com/cntt-vien-thong.epi"
        val links = getUrls(domain)
        saveJson(links)
    }
}

