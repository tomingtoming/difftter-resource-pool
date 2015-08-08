#!/bin/bash
JARURL=https://repo.typesafe.com/typesafe/ivy-releases/org.scala-sbt/sbt-launch/0.13.8/sbt-launch.jar
JARFILE=$(dirname $0)/sbt-launch.jar

if [ ! -e "$JARFILE" ]
then
  curl -so $JARFILE $JARURL
fi

SBT_OPTS="-Xms512M -Xmx1536M -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256M"
java $SBT_OPTS -jar $JARFILE "$@"
