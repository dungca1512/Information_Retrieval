import org.jsoup.Jsoup
import play.api.libs.json._

import java.nio.ByteBuffer
import java.nio.channels.FileChannel
import java.nio.file.{Paths, StandardOpenOption}
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
        val urlSource = Source.fromURL(domain, "UTF-8")
        val response = urlSource.mkString
        val regex = """https://vnexpress\.net/[\w-]+\d+\.html""".r
        regex.findAllIn(response).toSet
    }

    /**
     * save a JSON object to json list
     * @param links
     * @param path
     * @return a json list
     */
    private def saveJson(links: Set[String], path: String): Unit = {
        val jsonObjects = links.map(link => Map("url" -> link,
                                                "content" -> extractText(link),
                                                "date" -> extractDate(link)
                                                )).toList
        val out = FileChannel.open(Paths.get(path), StandardOpenOption.APPEND, StandardOpenOption.CREATE)
        val jsonStr = Json.prettyPrint(Json.toJson(jsonObjects))
        out.write(ByteBuffer.wrap(jsonStr.getBytes))
        out.close()
    }

    def main(args: Array[String]): Unit = {
        val domains: Set[String] = Set("https://vnexpress.net/thoi-su",
                                        "https://vnexpress.net/goc-nhin",
                                        "https://vnexpress.net/the-gioi",
                                        "https://vnexpress.net/podcast",
                                        "https://vnexpress.net/kinh-doanh",
                                        "https://vnexpress.net/bat-dong-san",
                                        "https://vnexpress.net/khoa-hoc",
                                        "https://vnexpress.net/giai-tri",
                                        "https://vnexpress.net/the-thao",
                                        "https://vnexpress.net/phap-luat",
                                        "https://vnexpress.net/giao-duc",
                                        "https://vnexpress.net/suc-khoe",
                                        "https://vnexpress.net/doi-song",
                                        "https://vnexpress.net/du-lich",
                                        "https://vnexpress.net/so-hoa",
                                        "https://vnexpress.net/oto-xe-may",
                                        "https://vnexpress.net/y-kien",
                                        "https://vnexpress.net/tam-su",
                                        "https://vnexpress.net/thu-gian")
        val path = "json/data.json"
        val mergedLinks: Set[String] = Set()
        domains.map(domain => {
            val links = getUrls(domain)
            mergedLinks.union(links)
        })
        saveJson(mergedLinks, path)
    }
}

