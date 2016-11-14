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
import org.scalajs.dom._
import org.scalajs.dom.raw._

import scala.scalajs.js._
import org.scalajs.dom.html
import js.{ UndefOr, Any, Function => JFn }
import js.annotation.{ JSBracketAccess, JSName }
import js.{ Any => jAny }

// https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/react/react.d.ts
 @js.native
abstract class SyntheticEventData extends OptionalEventProperties  with js.Any{
  var altKey: Boolean = js.native
  val button: Double = js.native
  var buttons: Double = js.native
  var clientX: Double = js.native
  var clientY: Double =js.native
  var changedTouches: TouchList = js.native
  var charCode: Boolean = js.native
  var clipboardData: DataTransfer =js.native
  var ctrlKey: Boolean =js.native
  var deltaMode: Double = js.native
  var deltaX: Double = js.native
  var deltaY: Double =js.native
  var deltaZ: Double = js.native
  var detail: Double = js.native
  def getModifierState(key: String): Boolean = js.native
  var key: String = js.native
  var keyCode: Double = js.native
  var locale: String = js.native
  var location: Double =js.native
  var metaKey: Boolean = js.native
  var pageX: Double = js.native
  var pageY: Double = js.native
  var relatedTarget: EventTarget = js.native
  var repeat: Boolean = js.native
  var screenX: Double = js.native
  var screenY: Double =js.native
  var shiftKey: Boolean =js.native
  var targetTouches: TouchList = js.native
  var touches: TouchList = js.native
  var view: AbstractView = js.native
  var which: Double = js.native
}

