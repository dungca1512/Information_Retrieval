import sbt.Keys.libraryDependencies

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.13"

lazy val root = (project in file("."))
  .settings(
    name := "Information_Retrieval"
      libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.2"

)
