file:///D:/Information-Retrieval/src/main/scala/WebScraping.scala
### file%3A%2F%2F%2FD%3A%2FInformation-Retrieval%2Fsrc%2Fmain%2Fscala%2FWebScraping.scala:14: error: end of file expected but } found
}
^

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.12.18
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.12.18\scala-library-2.12.18.jar [exists ]
Options:



action parameters:
uri: file:///D:/Information-Retrieval/src/main/scala/WebScraping.scala
text:
```scala
import org.jsoup.Jsoup

object WebScraping {
  
    def main(args: Array[String]): Unit = {
    val doc = Jsoup.connect("https://www.example.com/").get()
    val title = doc.title()
    val content = doc.text()

    println(s"Title: $title")
    println(s"Content: $content")
  }
}
}

```



#### Error stacktrace:

```
scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.ScalametaParser.syntaxErrorExpected(ScalametaParser.scala:421)
	scala.meta.internal.parsers.ScalametaParser.expect(ScalametaParser.scala:423)
	scala.meta.internal.parsers.ScalametaParser.accept(ScalametaParser.scala:427)
	scala.meta.internal.parsers.ScalametaParser.parseRuleAfterBOF(ScalametaParser.scala:63)
	scala.meta.internal.parsers.ScalametaParser.parseRule(ScalametaParser.scala:54)
	scala.meta.internal.parsers.ScalametaParser.parseSource(ScalametaParser.scala:132)
	scala.meta.parsers.Parse$.$anonfun$parseSource$1(Parse.scala:29)
	scala.meta.parsers.Parse$$anon$1.apply(Parse.scala:36)
	scala.meta.parsers.Api$XtensionParseDialectInput.parse(Api.scala:25)
	scala.meta.internal.semanticdb.scalac.ParseOps$XtensionCompilationUnitSource.toSource(ParseOps.scala:17)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument.toTextDocument(TextDocumentOps.scala:206)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:54)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:384)
```
#### Short summary: 

file%3A%2F%2F%2FD%3A%2FInformation-Retrieval%2Fsrc%2Fmain%2Fscala%2FWebScraping.scala:14: error: end of file expected but } found
}
^