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
package react
import scala.scalajs.js
import scala.scalajs.js._
import org.scalajs.dom.html
import js.{ UndefOr, Any, Function => JFn }
import js.annotation.{ JSBracketAccess, JSName }
import js.{ Any => jAny }
import org.scalajs.dom.raw
import org.scalajs.dom.raw._

// https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/react/react.d.ts
@js.native
abstract class MouseEvent extends SyntheticEvent with js.Any {
  var altKey: Boolean = js.native
  var button: Double = js.native
  var buttons: Double = js.native
  var clientX: Double = js.native
  var clientY: Double = js.native
  var ctrlKey: Boolean = js.native
  def getModifierState(key: String): Boolean = js.native
  var metaKey: Boolean = js.native
  var pageX: Double = js.native
  var pageY: Double = js.native
  var relatedTarget: EventTarget = js.native
  var screenX: Double = js.native
  var screenY: Double = js.native
  var shiftKey: Boolean = js.native
}

