name := "twitter_get"

version := "1.0"

scalaVersion := "2.12.7"

resolvers +=
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.3",
  "com.danielasfregola" %% "twitter4s" % "5.5"
)
