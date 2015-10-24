name := "susuru"

version := "0.3.0"

organization := "toming"

scalaVersion := "2.11.6"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

javaOptions += "-server"

libraryDependencies ++= {
  Seq(
    "org.twitter4j"     % "twitter4j-core"    % "[4.0,)",
    "org.slf4j"         % "slf4j-api"         % "1.7.12"
  )
}
