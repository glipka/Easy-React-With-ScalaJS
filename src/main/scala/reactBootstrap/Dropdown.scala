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
/*# Copyright 2016 Georges Lipka
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
import reactBootstrap.ReactBootstrap._
@js.native trait DropdownBaseProps extends js.Any {
  var bsClass: String = js.native
  var componentClass: ReactType = js.native
  var disabled: Boolean = js.native
  var dropup: Boolean = js.native
  var id: String = js.native
  var onClose: js.Function = js.native
  var onSelect: SelectCallback = js.native
  var onToggle: (Boolean) => Unit = js.native
  var open: Boolean = js.native
  var pullRight: Boolean = js.native
  var role: String = js.native
}
@js.native
class Dropdown(props: DropdownProps) extends Component[DropdownProps, Any](props) with js.Any {
  var Menu: DropdownMenu = js.native
  var Toggle: DropdownToggle = js.native
}
