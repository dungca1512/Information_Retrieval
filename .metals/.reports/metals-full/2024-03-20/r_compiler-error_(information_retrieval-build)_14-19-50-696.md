file:///D:/Information_Retrieval/build.sbt
### java.lang.NullPointerException

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.12.18
Classpath:
<WORKSPACE>\project\.bloop\information_retrieval-build\bloop-bsp-clients-classes\classes-Metals-5uzn_JJ3RnCH9fHcYQ-UmQ== [missing ], <HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.9.9\semanticdb-javac-0.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\sbt\1.9.9\sbt-1.9.9.jar [exists ], <HOME>\.sbt\boot\scala-2.12.18\lib\scala-library.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\ch\epfl\scala\sbt-bloop_2.12_1.0\1.5.15\sbt-bloop_2.12_1.0-1.5.15.jar [exists ], <HOME>\AppData\Roaming\JetBrains\IntelliJIdea2023.3\plugins\Scala\repo\org\jetbrains\scala\sbt-structure-extractor_2.12_1.3\2023.3.2\sbt-structure-extractor-2023.3.2.jar [exists ], <HOME>\AppData\Roaming\JetBrains\IntelliJIdea2023.3\plugins\Scala\repo\org\jetbrains\scala\sbt-idea-shell_2.12_1.0\2021.1.0\sbt-idea-shell-2021.1.0.jar [exists ], <HOME>\AppData\Roaming\JetBrains\IntelliJIdea2023.3\plugins\Scala\repo\org\jetbrains\scala\sbt-idea-compiler-indices_2.12_1.0\1.0.14\sbt-idea-compiler-indices-1.0.14.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\main_2.12\1.9.9\main_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\io_2.12\1.9.9\io_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\ch\epfl\scala\bloop-config_2.12\1.5.5\bloop-config_2.12-1.5.5.jar [exists ], <HOME>\AppData\Roaming\JetBrains\IntelliJIdea2023.3\plugins\Scala\repo\org\jetbrains\scala\scala-compiler-indices-protocol_2.12\1.0.14\scala-compiler-indices-protocol_2.12-1.0.14.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\logic_2.12\1.9.9\logic_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\actions_2.12\1.9.9\actions_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\main-settings_2.12\1.9.9\main-settings_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\run_2.12\1.9.9\run_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\command_2.12\1.9.9\command_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\collections_2.12\1.9.9\collections_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\scripted-plugin_2.12\1.9.9\scripted-plugin_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\zinc-lm-integration_2.12\1.9.9\zinc-lm-integration_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\util-logging_2.12\1.9.9\util-logging_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-xml_2.12\2.2.0\scala-xml_2.12-2.2.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\launcher-interface\1.4.2\launcher-interface-1.4.2.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\github\ben-manes\caffeine\caffeine\2.8.5\caffeine-2.8.5.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\io\get-coursier\lm-coursier-shaded_2.12\2.1.2\lm-coursier-shaded_2.12-2.1.2.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\apache\logging\log4j\log4j-api\2.17.1\log4j-api-2.17.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\apache\logging\log4j\log4j-core\2.17.1\log4j-core-2.17.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\apache\logging\log4j\log4j-slf4j-impl\2.17.1\log4j-slf4j-impl-2.17.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\librarymanagement-core_2.12\1.9.3\librarymanagement-core_2.12-1.9.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\librarymanagement-ivy_2.12\1.9.3\librarymanagement-ivy_2.12-1.9.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\compiler-interface\1.9.6\compiler-interface-1.9.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\zinc-compile_2.12\1.9.6\zinc-compile_2.12-1.9.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\swoval\file-tree-views\2.1.12\file-tree-views-2.1.12.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\net\java\dev\jna\jna\5.13.0\jna-5.13.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\net\java\dev\jna\jna-platform\5.13.0\jna-platform-5.13.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\github\plokhotnyuk\jsoniter-scala\jsoniter-scala-core_2.12\2.4.0\jsoniter-scala-core_2.12-2.4.0.jar [exists ], <HOME>\AppData\Roaming\JetBrains\IntelliJIdea2023.3\plugins\Scala\repo\io\spray\spray-json_2.12\1.3.6\spray-json_2.12-1.3.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\util-relation_2.12\1.9.9\util-relation_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\completion_2.12\1.9.9\completion_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\task-system_2.12\1.9.9\task-system_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\tasks_2.12\1.9.9\tasks_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\testing_2.12\1.9.9\testing_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\util-tracking_2.12\1.9.9\util-tracking_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\eed3si9n\sjson-new-scalajson_2.12\0.9.1\sjson-new-scalajson_2.12-0.9.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\jline\jline-terminal\3.24.1\jline-terminal-3.24.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\zinc-classpath_2.12\1.9.6\zinc-classpath_2.12-1.9.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\zinc-apiinfo_2.12\1.9.6\zinc-apiinfo_2.12-1.9.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\zinc_2.12\1.9.6\zinc_2.12-1.9.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\core-macros_2.12\1.9.9\core-macros_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\util-cache_2.12\1.9.9\util-cache_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\util-control_2.12\1.9.9\util-control_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\protocol_2.12\1.9.9\protocol_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\eed3si9n\sjson-new-core_2.12\0.9.1\sjson-new-core_2.12-0.9.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\template-resolver\0.1\template-resolver-0.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\util-position_2.12\1.9.9\util-position_2.12-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\zinc-compile-core_2.12\1.9.6\zinc-compile-core_2.12-1.9.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\util-interface\1.9.9\util-interface-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\jline\jline\2.14.7-sbt-9c3b6aca11c57e339441442bbf58e550cdfecb79\jline-2.14.7-sbt-9c3b6aca11c57e339441442bbf58e550cdfecb79.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\jline\jline-terminal-jna\3.24.1\jline-terminal-jna-3.24.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\jline\jline-terminal-jansi\3.24.1\jline-terminal-jansi-3.24.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\lmax\disruptor\3.4.2\disruptor-3.4.2.jar [exists ], <HOME>\.sbt\boot\scala-2.12.18\lib\scala-reflect.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\checkerframework\checker-qual\3.4.1\checker-qual-3.4.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\google\errorprone\error_prone_annotations\2.4.0\error_prone_annotations-2.4.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-collection-compat_2.12\2.10.0\scala-collection-compat_2.12-2.10.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\slf4j\slf4j-api\1.7.36\slf4j-api-1.7.36.jar [exists ], <HOME>\.sbt\boot\scala-2.12.18\lib\scala-compiler.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\jcraft\jsch\0.1.54\jsch-0.1.54.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\eed3si9n\gigahorse-apache-http_2.12\0.7.0\gigahorse-apache-http_2.12-0.7.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\ivy\ivy\2.3.0-sbt-396a783bba347016e7fe30dacc60d355be607fe2\ivy-2.3.0-sbt-396a783bba347016e7fe30dacc60d355be607fe2.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\jline\jline-reader\3.24.1\jline-reader-3.24.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\jline\jline-builtins\3.24.1\jline-builtins-3.24.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\test-agent\1.9.9\test-agent-1.9.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\test-interface\1.0\test-interface-1.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\eed3si9n\shaded-jawn-parser_2.12\0.9.1\shaded-jawn-parser_2.12-0.9.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\eed3si9n\shaded-scalajson_2.12\1.0.0-M4\shaded-scalajson_2.12-1.0.0-M4.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\jline\jline-native\3.24.1\jline-native-3.24.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\compiler-bridge_2.12\1.9.6\compiler-bridge_2.12-1.9.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\zinc-classfile_2.12\1.9.6\zinc-classfile_2.12-1.9.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\zinc-core_2.12\1.9.6\zinc-core_2.12-1.9.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\zinc-persist_2.12\1.9.6\zinc-persist_2.12-1.9.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\eed3si9n\sjson-new-murmurhash_2.12\0.9.1\sjson-new-murmurhash_2.12-0.9.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\ipcsocket\ipcsocket\1.6.2\ipcsocket-1.6.2.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-parser-combinators_2.12\1.1.2\scala-parser-combinators_2.12-1.1.2.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\net\openhft\zero-allocation-hashing\0.10.1\zero-allocation-hashing-0.10.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\fusesource\jansi\jansi\2.4.1\jansi-2.4.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\eed3si9n\gigahorse-core_2.12\0.7.0\gigahorse-core_2.12-0.7.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\eed3si9n\shaded-apache-httpasyncclient\0.7.0\shaded-apache-httpasyncclient-0.7.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\jline\jline-style\3.24.1\jline-style-3.24.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\zinc-persist-core-assembly\1.9.6\zinc-persist-core-assembly-1.9.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-sbt\sbinary_2.12\0.5.1\sbinary_2.12-0.5.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\typesafe\ssl-config-core_2.12\0.6.1\ssl-config-core_2.12-0.6.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\reactivestreams\reactive-streams\1.0.3\reactive-streams-1.0.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\typesafe\config\1.4.2\config-1.4.2.jar [exists ]
Options:
-deprecation -Wconf:cat=unused-nowarn:s -Wconf:cat=unused-nowarn:s -Xsource:3 -Yrangepos -Xplugin-require:semanticdb


action parameters:
offset: 1441
uri: file:///D:/Information_Retrieval/build.sbt
text:
```scala
import _root_.scala.xml.{TopScope=>$scope}
import _root_.sbt._
import _root_.sbt.Keys._
import _root_.sbt.nio.Keys._
import _root_.sbt.ScriptedPlugin.autoImport._, _root_.sbt.plugins.JUnitXmlReportPlugin.autoImport._, _root_.sbt.plugins.MiniDependencyTreePlugin.autoImport._, _root_.bloop.integrations.sbt.BloopPlugin.autoImport._, _root_.org.jetbrains.sbt.IdeaShellPlugin.autoImport._, _root_.org.jetbrains.sbt.indices.SbtIntellijIndicesPlugin.autoImport._
import _root_.sbt.plugins.IvyPlugin, _root_.sbt.plugins.JvmPlugin, _root_.sbt.plugins.CorePlugin, _root_.sbt.ScriptedPlugin, _root_.sbt.plugins.SbtPlugin, _root_.sbt.plugins.SemanticdbPlugin, _root_.sbt.plugins.JUnitXmlReportPlugin, _root_.sbt.plugins.Giter8TemplatePlugin, _root_.sbt.plugins.MiniDependencyTreePlugin, _root_.bloop.integrations.sbt.BloopPlugin, _root_.org.jetbrains.sbt.StructurePlugin, _root_.org.jetbrains.sbt.IdeaShellPlugin, _root_.org.jetbrains.sbt.indices.SbtIntellijIndicesPlugin
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.13"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Information_Retrieval",
    libraryDependencies += "de.l3s.boilerpipe" % "boilerpipe" % "1.1.0",
    libraryDependencies += "org.jsoup" % "jsoup" % "1.17.2",
    libraryDependencies += "com.typesafe.play" %% "play-json" % "2.10.4",
    libraryDependencies += "org.json4s" %% "json4s-native" % "4.1.0-M4",
    libraryDepe@@ndencies += "io.spray" %% "spray-json" % "1.3.6",
    libraryDependencies += "org.json4s" %% "json4s-native" % "4.0.7",
    libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.8.5",
    libraryDependencies += "org.apache.spark" %% "spark-core_2.11" % "3.5.1"
  )

```



#### Error stacktrace:

```
java.base/java.util.Arrays.sort(Arrays.java:1441)
	scala.tools.nsc.classpath.JFileDirectoryLookup.listChildren(DirectoryClassPath.scala:117)
	scala.tools.nsc.classpath.JFileDirectoryLookup.listChildren$(DirectoryClassPath.scala:101)
	scala.tools.nsc.classpath.DirectoryClassPath.listChildren(DirectoryClassPath.scala:292)
	scala.tools.nsc.classpath.DirectoryClassPath.listChildren(DirectoryClassPath.scala:292)
	scala.tools.nsc.classpath.DirectoryLookup.list(DirectoryClassPath.scala:82)
	scala.tools.nsc.classpath.DirectoryLookup.list$(DirectoryClassPath.scala:77)
	scala.tools.nsc.classpath.DirectoryClassPath.list(DirectoryClassPath.scala:292)
	scala.tools.nsc.classpath.AggregateClassPath.$anonfun$list$3(AggregateClassPath.scala:105)
	scala.collection.Iterator.foreach(Iterator.scala:943)
	scala.collection.Iterator.foreach$(Iterator.scala:943)
	scala.collection.AbstractIterator.foreach(Iterator.scala:1431)
	scala.collection.IterableLike.foreach(IterableLike.scala:74)
	scala.collection.IterableLike.foreach$(IterableLike.scala:73)
	scala.collection.AbstractIterable.foreach(Iterable.scala:56)
	scala.tools.nsc.classpath.AggregateClassPath.list(AggregateClassPath.scala:101)
	scala.tools.nsc.util.ClassPath.list(ClassPath.scala:36)
	scala.tools.nsc.util.ClassPath.list$(ClassPath.scala:36)
	scala.tools.nsc.classpath.AggregateClassPath.list(AggregateClassPath.scala:30)
	scala.tools.nsc.symtab.SymbolLoaders$PackageLoader.doComplete(SymbolLoaders.scala:298)
	scala.tools.nsc.symtab.SymbolLoaders$SymbolLoader.complete(SymbolLoaders.scala:250)
	scala.reflect.internal.Symbols$Symbol.completeInfo(Symbols.scala:1542)
	scala.reflect.internal.Symbols$Symbol.info(Symbols.scala:1514)
	scala.reflect.internal.Types$TypeRef.decls(Types.scala:2283)
	scala.tools.nsc.typechecker.Namers$Namer.enterPackage(Namers.scala:766)
	scala.tools.nsc.typechecker.Namers$Namer.dispatch$1(Namers.scala:289)
	scala.tools.nsc.typechecker.Namers$Namer.standardEnterSym(Namers.scala:302)
	scala.tools.nsc.typechecker.AnalyzerPlugins.pluginsEnterSym(AnalyzerPlugins.scala:479)
	scala.tools.nsc.typechecker.AnalyzerPlugins.pluginsEnterSym$(AnalyzerPlugins.scala:478)
	scala.meta.internal.pc.MetalsGlobal$MetalsInteractiveAnalyzer.pluginsEnterSym(MetalsGlobal.scala:68)
	scala.tools.nsc.typechecker.Namers$Namer.enterSym(Namers.scala:280)
	scala.tools.nsc.typechecker.Analyzer$namerFactory$$anon$1.apply(Analyzer.scala:48)
	scala.tools.nsc.Global$GlobalPhase.applyPhase(Global.scala:453)
	scala.tools.nsc.Global$Run.$anonfun$compileLate$3(Global.scala:1645)
	scala.tools.nsc.Global$Run.$anonfun$compileLate$2(Global.scala:1645)
	scala.tools.nsc.Global$Run.$anonfun$compileLate$2$adapted(Global.scala:1644)
	scala.collection.Iterator.foreach(Iterator.scala:943)
	scala.collection.Iterator.foreach$(Iterator.scala:943)
	scala.collection.AbstractIterator.foreach(Iterator.scala:1431)
	scala.tools.nsc.Global$Run.compileLate(Global.scala:1644)
	scala.tools.nsc.interactive.Global.parseAndEnter(Global.scala:654)
	scala.tools.nsc.interactive.Global.typeCheck(Global.scala:664)
	scala.meta.internal.pc.HoverProvider.typedHoverTreeAt(HoverProvider.scala:308)
	scala.meta.internal.pc.HoverProvider.hoverOffset(HoverProvider.scala:43)
	scala.meta.internal.pc.HoverProvider.hover(HoverProvider.scala:22)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$hover$1(ScalaPresentationCompiler.scala:341)
```
#### Short summary: 

java.lang.NullPointerException