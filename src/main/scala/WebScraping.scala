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
    def extractText(url: String): String = {
        val doc = Jsoup.connect(url).get()
        doc.select("p").text()
    }

    /**
     * extract date from URL of a article
     * @param url
     * @return date
     */
    def extractDate(url: String): String = {
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
    def getUrls(domain: String): Set[String] = {
        val response = Source.fromURL(domain).mkString
        val regex = """https://vnexpress\.net/[\w-]+\d+\.html""".r
        regex.findAllIn(response).toSet
    }
    /**
     * save a JSON object to json list
     * @param content
     * @param listUrl
     * @return a json list
     */
    def saveJson(links: Set[String]): Unit = {
        val jsonObjects = List.newBuilder[Map[String, String]]
        for (link <- links) {
            val jsonObject = Map(
                "url" -> link,
                "content" -> extractText(link),
                "date" -> extractDate(link)
            )
            jsonObjects += jsonObject
        }
        val json = Json.toJson(jsonObjects.result())
        val file = new File("json/data.json")
        val fileWriter = new FileWriter(file)
        fileWriter.write(json.toString())
        fileWriter.close()
    }
}

