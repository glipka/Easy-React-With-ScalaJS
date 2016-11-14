import de.heikoseeberger.sbtheader.HeaderPattern
lazy val root = (project in file(".")).enablePlugins(ScalaJSPlugin,SbtWeb )
JsEngineKeys.engineType := JsEngineKeys.EngineType.Node
name := "EasyReactJSWithScala"
version := "0.1-SNAPSHOT"
scalaVersion := "2.11.8"

scalaJSOutputMode := org.scalajs.core.tools.javascript.OutputMode.ECMAScript6
scalaJSUseRhino in Global := false
persistLauncher in Compile := true
skip in packageJSDependencies := false
 
persistLauncher in Test := false
val scalaXml = "org.scala-lang.modules" %% "scala-xml" % "1.0.3"
val scalaReflect = "org.scala-lang" % "scala-reflect" % "2.11.8"
val macroParadisePlugin = compilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
 


libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "0.9.1",
    "com.lihaoyi" %%% "utest" % "0.3.0" % "test",
	"org.jdom" % "jdom2" % "2.0.6",
	scalaXml,
	scalaReflect,
	 //macroParadisePlugin,
    "pl.metastack" %%% "metaweb" % "0.2.0",macroParadisePlugin
)
logLevel := Level.Info
	 
/* 
headers := headers.value ++ Map(
  "scala" -> (
    HeaderPattern.hashLineComment,
    """|/*
	   | # Copyright 2016 Georges Lipka
       |#
       |# Licensed under the Apache License, Version 2.0 (the "License");
       |# you may not use this file except in compliance with the License.
       |# You may obtain a copy of the License at
       |#
       |#     http://www.apache.org/licenses/LICENSE-2.0
       |#
       |# Unless required by applicable law or agreed to in writing, software
       |# distributed under the License is distributed on an "AS IS" BASIS,
       |# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
       |# See the License for the specific language governing permissions and
       |# limitations under the License.
       |*/
       |""".stripMargin
  ) 
  
)
*/
	 