ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.13"

lazy val root = project
  .in(file("."))
  .settings(
      name := "Information_Retrieval",
      libraryDependencies += "de.l3s.boilerpipe" % "boilerpipe" % "1.1.0",
      libraryDependencies += "org.jsoup" % "jsoup" % "1.17.2",
      libraryDependencies += "org.json4s" %% "json4s-native" % "4.0.7",
      libraryDependencies += "com.typesafe.play" %% "play-json" % "2.10.5",
      libraryDependencies -= "io.spray" %% "spray-json" % "1.3.6",
      libraryDependencies += "org.json4s" %% "json4s-jackson" % "4.1.0-M5",
      libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.8.5",
      libraryDependencies += "org.apache.spark" %% "spark-core" % "3.5.1",
      libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.5.1",
      libraryDependencies += "org.apache.spark" %% "spark-mllib" % "3.5.1" % "provided",
      libraryDependencies += "org.apache.spark" %% "spark-streaming" % "3.5.1" % "provided",
      libraryDependencies += "org.apache.spark" %% "spark-graphx" % "3.5.1",
      libraryDependencies += "edu.stanford.nlp" % "stanford-corenlp" % "4.5.7"
  )

