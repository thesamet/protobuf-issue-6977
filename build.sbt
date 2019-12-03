enablePlugins(JmhPlugin)

scalaVersion := "2.13.1"

val protocVersion = sys.env("PB")

PB.protocVersion in Compile := "-v" + protocVersion

PB.targets in Compile := Seq(
  PB.gens.java(protocVersion) -> (sourceManaged in Compile).value
)
