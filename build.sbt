lazy val root = (project in file(".")).aggregate(persistenceModel).dependsOn(gameModel, persistenceModel)
lazy val gameModel = (project in file("GameModel"))
lazy val persistenceModel = (project in file("PersistenceModel")).dependsOn(gameModel)

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


libraryDependencies += ("com.typesafe.akka" %% "akka-http" % "10.2.4").cross(CrossVersion.for3Use2_13)
libraryDependencies += ("com.typesafe.akka" %% "akka-stream" % "2.6.8").cross(CrossVersion.for3Use2_13)
libraryDependencies +=( "com.typesafe.akka" %% "akka-actor-typed" % "2.6.8").cross(CrossVersion.for3Use2_13)
libraryDependencies +=( "com.typesafe.akka" %% "akka-actor" % "2.6.8").cross(CrossVersion.for3Use2_13)

//libraryDependencies +=("com.typesafe.slick" %% "slick" % "3.3.3").cross(CrossVersion.for3Use2_13)
libraryDependencies +=("com.typesafe.slick" %% "slick-hikaricp" % "3.3.3").cross(CrossVersion.for3Use2_13)
libraryDependencies +=("com.github.slick.slick" % "slick_3" % "nafg~dottyquery-SNAPSHOT")

resolvers += "jitpack" at "https://jitpack.io"
libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.36"
//libraryDependencies +="org.postgresql" % "postgresql" % "9.4-1206-jdbc42"
libraryDependencies +="mysql" % "mysql-connector-java" % "8.0.24"

//scalacOptions ++= Seq("-Xignore-scala2-macros")




