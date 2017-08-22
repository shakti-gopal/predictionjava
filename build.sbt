scalaVersion := "2.11.8"

organization := "org.apache.predictionio"

libraryDependencies ++= Seq(
  "org.apache.predictionio" %% "apache-predictionio-core" % "0.10.0-incubating" % "provided",
  "org.apache.spark"        %% "spark-core"               % "2.1.0" % "provided",
  "org.apache.spark"        %% "spark-mllib"              % "2.1.0" % "provided")
