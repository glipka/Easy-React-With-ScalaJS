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
 
package reactRouter
import scala.scalajs.js
import react._
import GlobalDefinition._
@js.native
object ReactRouter extends js.Any {
  val browserHistory: History = js.native
  val hashHistory: History = js.native
  def createMemoryHistory(options: js.Any): js.Any = js.native

  val Router: Router = js.native
  val Link: Link = js.native

  val IndexLink: Link = js.native
  val RouterContext: RouterContext = js.native
  val Route: Route = js.native
  val Redirect: Redirect = js.native
  val IndexRoute: IndexRoute = js.native
  val IndexRedirect: js.Any = js.native
  val History: Mixin[js.Any, js.Any] = js.native
  val Lifecycle: Mixin[js.Any, js.Any] = js.native
  val RouteContext: Mixin[js.Any, js.Any] = js.native
  def withRouter[C <: ComponentClass[js.Any]](component: C): C = js.native
  def useRoutes[T](createHistory: js.Any): js.Any = js.native
  def createRoutes(routes: RouteConfig): js.Array[PlainRoute] = js.native
  def `match`(args: MatchArgs, cb: (js.Any, js.Any, MatchState) => Unit): Unit = js.native

}