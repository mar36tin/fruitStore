name := "fruitCheckout"

version := "1.0"

lazy val `fruitcheckout` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"


libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "2.2.6" % "test",
    "org.scalatestplus" %% "play" % "1.4.0-M3" % "test",
    "org.mockito" % "mockito-all" % "1.10.19"
  )


unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"  