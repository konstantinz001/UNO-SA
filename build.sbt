lazy val gamestate = project in file("Gamestate")
lazy val card = project in file("Cards")
lazy val player = project in file("Player")
lazy val stack = project in file("Stack")
lazy val fileIo = project in file("FileIO")
lazy val root = (project in file(".")).aggregate(fileIo)

name := "UNO"
version := "0.1"
scalaVersion := "3.0.0"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.11"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.11" % "test"

libraryDependencies += "org.scala-lang.modules" %% "scala-swing" % "3.0.0"

libraryDependencies += "com.google.inject" % "guice" % "5.1.0"
libraryDependencies += ("net.codingwell" %% "scala-guice" % "5.0.2").cross(CrossVersion.for3Use2_13)

libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "2.0.1"

libraryDependencies += "com.typesafe.play" %% "play-json" % "2.10.0-RC5"

