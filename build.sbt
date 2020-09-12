Global / onChangedBuildSource := ReloadOnSourceChanges
ThisBuild / turbo := true
ThisBuild / scalaVersion := "2.12.11"


 updateOptions := updateOptions.value.withCachedResolution(false).withLatestSnapshots(true)
 
lazy val root = project
  .in(file("."))
  .settings(commonSettings)
  .settings(
    name := "example",
    mainClass in (Compile,run) := Some("org.eclipse.che.examples.HelloWorld"),
    libraryDependencies ++= List(
      Dependencies.console4cats,
      Dependencies.scalaTest % Test,
    ),
  )

lazy val commonSettings: List[Def.Setting[_]] = List(
  organization := "org.eclipse.che.examples",
  licenses := List("MIT" -> url("https://opensource.org/licenses/MIT")),
  developers := List(
    Developer(
      "john.doe",
      "John Doe",
      "john.doe@redhat.com",
      url("https://www.eclipse.org/che/"),
    ),
  ),
)

//addCommandAlias("ci", "; check; publishLocal")
addCommandAlias("ci", "; publishLocal")
