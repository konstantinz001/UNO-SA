lazy val root = (project in file(".")).aggregate(persistenceModel).dependsOn(gameModel, persistenceModel)
lazy val gameModel = (project in file("GameModel"))
lazy val persistenceModel = (project in file("PersistenceModel")).dependsOn(gameModel)

val AkkaVersion = "2.6.17"
val AkkaHttpVersion = "10.2.9"

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

libraryDependencies +=
  ("com.typesafe.akka" %% "akka-http" % AkkaHttpVersion)
    .cross(CrossVersion.for3Use2_13)


libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion
)
