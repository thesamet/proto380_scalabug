scalaVersion := "2.12.8"

PB.protocVersion := "-v380"

lazy val protosProject = (project in file("protos"))
    .settings(
       PB.targets in Compile := Seq(
         PB.gens.java("3.8.0") -> (sourceManaged in Compile).value
       )
    )

lazy val user = (project in file("user")).dependsOn(protosProject)
