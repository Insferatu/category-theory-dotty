val dottyVersion = "0.16.0-RC3"

lazy val `ctd-0160-rc3` = project
  .in(file("."))
  .settings(
    version := "0.1.0",

    scalaVersion := dottyVersion,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
