name := "susuru"

version := "0.0.0"

organization := "info.toming"

scalaVersion := "2.11.1"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

javaOptions += "-server"

libraryDependencies ++= {
  Seq(
    // Scala Section
    "com.typesafe.akka" %% "akka-actor"        % "2.3.11",
    "com.twitter"       %  "util-logging_2.11" % "6.24.0",
    // Java Section
    "org.twitter4j"     %  "twitter4j-core"    % "[3.0,)",
    "org.slf4j"         %  "slf4j-nop"         % "1.6.4",
    "log4j"             %  "log4j"             % "1.2.17"
  )
}
