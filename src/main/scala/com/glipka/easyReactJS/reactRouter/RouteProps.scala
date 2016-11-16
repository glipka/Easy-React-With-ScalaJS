/*
 # Copyright 2016 Georges Lipka
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
*/
 
package com.glipka.easyReactJS.reactRouter
import scala.scalajs.js
import com.glipka.easyReactJS.react._
import GlobalDefinition._

@js.native
trait RouteProps extends Props[Route] with js.Any {
  val path: RoutePattern = js.native
  val component: RouteComponent = js.native
  val components: RouteComponents = js.native
  val getComponent: (RouterState, (js.Any, RouteComponent) => Any) => Any = js.native
  val getComponents: (RouterState, (js.Any, RouteComponents) => Any) => Unit = js.native
  def onEnter: EnterHook = js.native
  def onLeave: LeaveHook = js.native
  def onChange: ChangeHook = js.native
  val getIndexRoute: (js.Any, (js.Any, RouteConfig) => Unit) => Unit = js.native
  val getChildRoutes: (js.Any, (Any, RouteConfig) => Unit) => Unit = js.native
}