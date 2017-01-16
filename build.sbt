name := """eigenroute-publish-subscribe-minimal-scala"""

version := "0.0.1"
organization := "com.eigenroute"

scalaVersion := "2.11.7"
val opRabbitVersion = "1.6.0"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "com.spingo" %% "op-rabbit-core"        % opRabbitVersion,
  "com.spingo" %% "op-rabbit-play-json"   % opRabbitVersion,
  "com.spingo" %% "op-rabbit-akka-stream" % opRabbitVersion,
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

publishMavenStyle := true
val resolver = Resolver.ssh("Eigenroute maven repo", "mavenrepo.eigenroute.com", 7835, "/home/mavenrepo/repo") withPermissions "0644"
publishTo := Some(resolver as ("mavenrepo", Path.userHome / ".ssh" / "id_rsa"))

publishArtifact in packageSrc := false

publishArtifact in packageDoc := false


