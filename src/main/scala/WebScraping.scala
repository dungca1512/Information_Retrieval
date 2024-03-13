import org.jsoup.Jsoup
import de.l3s.boilerpipe.extractors.ArticleExtractor

object WebScraping {
    def main(args: Array[String]): Unit = {
        val url = "https://vov.vn/the-gioi/chu-tich-trung-quoc-tap-can-binh-co-the-tham-nga-trong-tuan-toi-post1007215.vov"
        val text = ArticleExtractor.INSTANCE.getText(url)
        println(text)
    }
}