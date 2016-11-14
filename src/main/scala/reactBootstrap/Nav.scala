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
 
package reactBootstrap

import scala.scalajs.js
import scala.scalajs.js._
import react._
import ReactBootstrap._

// TODO: This one turned into a union of two different types
@js.native trait NavProps extends HTMLProps[Nav] with js.Any  {
  // Optional
  var activeHref: String = js.native
  var activeKey: Any = js.native
  var bsSize: Sizes = js.native
  var bsStyle: String = js.native
  var collapsible: Boolean = js.native
  var eventKey: Any = js.native
  var expanded: Boolean = js.native
  var justified: Boolean = js.native
  var navbar: Boolean = js.native
  var pullRight: Boolean = js.native
  var right: Boolean = js.native
  var stacked: Boolean = js.native
  var ulClassName: String = js.native
  var ulId: String = js.native
}
@js.native
class Nav(props: NavProps) extends Component[NavProps, Any](props)  with js.Any{
}