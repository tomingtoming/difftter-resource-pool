name := "susuru"

version := "0.1.3"

organization := "toming"

scalaVersion := "2.11.6"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

javaOptions += "-server"

libraryDependencies ++= {
  Seq(
    // Scala Section
    "org.specs2"        % "specs2_2.11"       % "2.4.2" % "test",
    // Java Section
    "org.mockito"       % "mockito-all"       % "1.10.19",
    "org.twitter4j"     % "twitter4j-core"    % "[3.0,)",
    "org.slf4j"         % "slf4j-nop"         % "1.6.4",
    "log4j"             % "log4j"             % "1.2.17"
  )
}
