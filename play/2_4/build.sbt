name := """play"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .disablePlugins(PlayLayoutPlugin)

scalaVersion := "2.11.6"