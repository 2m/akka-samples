organization := "com.typesafe.akka.samples"
name := "akka-sample-persistence-scala"

scalaVersion := "2.12.1"
libraryDependencies ++= Seq(
  "com.typesafe.akka"          %% "akka-persistence" % "2.5.0-RC1",
  "org.iq80.leveldb"            % "leveldb"          % "0.7",
  "org.fusesource.leveldbjni"   % "leveldbjni-all"   % "1.8"
)

licenses := Seq(("CC0", url("http://creativecommons.org/publicdomain/zero/1.0")))

resolvers += "Staging Repo" at "https://oss.sonatype.org/content/repositories/comtypesafe-1767/"
