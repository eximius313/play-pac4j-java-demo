name := "play-pac4j-java-demo"

version := "3.1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.8"

val playPac4jVersion = "3.1.0"
val pac4jVersion = "2.2.0"
val playVersion = "2.5.8"

libraryDependencies ++= Seq(
  "org.pac4j" % "play-pac4j" % playPac4jVersion,
  "org.pac4j" % "pac4j-http" % pac4jVersion,
  "org.pac4j" % "pac4j-cas" % pac4jVersion,
  "org.pac4j" % "pac4j-openid" % pac4jVersion exclude("xml-apis" , "xml-apis"),
  "org.pac4j" % "pac4j-oauth" % pac4jVersion,
  "org.pac4j" % "pac4j-saml" % pac4jVersion,
  "org.pac4j" % "pac4j-oidc" % pac4jVersion exclude("commons-io" , "commons-io"),
  "org.pac4j" % "pac4j-gae" % pac4jVersion,
  "org.pac4j" % "pac4j-jwt" % pac4jVersion exclude("commons-io" , "commons-io"),
  "org.pac4j" % "pac4j-ldap" % pac4jVersion,
  "org.pac4j" % "pac4j-sql" % pac4jVersion,
  "org.pac4j" % "pac4j-mongo" % pac4jVersion,
  "org.pac4j" % "pac4j-couch" % pac4jVersion,
  "org.pac4j" % "pac4j-kerberos" % pac4jVersion,
  "com.typesafe.play" % "play-cache_2.11" % playVersion,
  "commons-io" % "commons-io" % "2.4",
  "be.objectify" %% "deadbolt-java" % "2.5.1"
)

resolvers ++= Seq(Resolver.mavenLocal, "Sonatype snapshots repository" at "https://oss.sonatype.org/content/repositories/snapshots/")

routesGenerator := InjectedRoutesGenerator
