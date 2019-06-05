name := "doobie_instance_test"

version := "0.1"

scalaVersion := "2.12.8"

scalacOptions ++= Seq(
  "-language:higherKinds"
)

libraryDependencies +=  "org.typelevel" %% "cats-effect" % "1.3.1"
libraryDependencies += "org.tpolecat" %% "doobie-core" % "0.7.0"