ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.13"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Information_Retrieval",
    libraryDependencies += "de.l3s.boilerpipe" % "boilerpipe" % "1.1.0",
    libraryDependencies += "org.jsoup" % "jsoup" % "1.17.2"
)
