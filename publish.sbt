ThisBuild / organizationName := "io.github.littlenag"
ThisBuild / organizationHomepage := Some(url("http://littlenag.github.io/"))

//mappings.in(Compile, packageBin) += baseDirectory.in(ThisBuild).value / "LICENSE" -> "LICENSE"

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/littlenag/scalajs-react-stripe-elements"),
    "scm:git:git@github.com:littlenag/scalajs-react-stripe-elements.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id    = "littlenag",
    name  = "Mark Kegel",
    email = "mark.kegel@gmail.com",
    url   = url("http://littlenag.github.io")
  )
)

ThisBuild / description := "scalajs-react bindings for react-stripe-elements."
ThisBuild / licenses := List("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("http://littlenag.github.io/scalajs-react-stripe-elements"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle := true
