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

@js.native trait NavItemProps extends HTMLProps[NavItem] with js.Any{
  var active: Boolean = js.native
  var brand: Any = js.native // TODO: Add more specific type
  var bsSize: Sizes = js.native
  var bsStyle: String = js.native
  var componentClass: ReactType = js.native
  var defaultNavExpanded: Boolean = js.native
  var eventKey: Any = js.native
  var fixedBottom: Boolean = js.native
  var fixedTop: Boolean = js.native
  var fluid: Boolean = js.native
  var inverse: Boolean = js.native
  var linkId: String = js.native
  var navExpanded: Boolean = js.native
   
  var onToggle: Function = js.native
  var staticTop: Boolean = js.native
  var toggleButton: Any = js.native // TODO: Add more specific type
  var toggleNavKey: String = js.native
}
   
 