lazy val `sbt_dotty_script_issue` = project
  .in(file("."))
  .settings(
    name := "sbt_dotty_script_issue",
    version := "0.1.0",
    resolvers ++= Seq(
      Resolver.mavenLocal,
      "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
      "Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases"
    ),
    scalaVersion := "3.0.0",
    libraryDependencies ++= Seq(
      "org.scala-lang" %% "scala3-compiler" % scalaVersion.value
    )
  )
