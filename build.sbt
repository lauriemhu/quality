name := "QualityProcess"

version := "1.0"

scalaVersion := "2.10.5"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library" % "2.10.5",
  "junit" % "junit" % "4.11" % "test",
  "org.scala-lang" % "scala-compiler" % "2.10.5",
  "org.scala-lang" % "scala-reflect" % "2.10.5",
  "info.cukes" % "cucumber-scala_2.10" % "1.2.4",
  "org.scalatest" % "scalatest_2.10" % "3.0.0-M15",
  "org.apache.commons" % "commons-io" % "1.3.2",
  "org.scalaj" % "scalaj-http_2.11" % "2.3.0",
  "info.cukes" % "cucumber-junit" % "1.2.4",
  "info.cukes" % "cucumber-jvm-deps" % "1.0.5",
  "info.cukes" % "cucumber-jvm" % "1.2.4",
  "com.novocode" % "junit-interface" % "0.11" % "test"
)

Seq(cucumberSettings : _*)
