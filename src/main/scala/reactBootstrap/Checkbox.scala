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
import react._
import org.scalajs.dom.raw._
// [Checkbox /]
@js.native
trait CheckboxProps extends HTMLProps[Checkbox] with js.Any{
  var bsClass: String = js.native
//  var disabled: Boolean = js.native
  var inline: Boolean = js.native
  var inputRef: (HTMLInputElement) => Unit = js.native
  var validationState: String = js.native
}
@js.native
class Checkbox(props: CheckboxProps) extends Component[CheckboxProps, Any](props) with js.Any {}