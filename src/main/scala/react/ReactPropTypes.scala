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

package react
import scala.scalajs.js
import scala.scalajs.js._
import org.scalajs.dom.html
import js.{ UndefOr, Any, Function => JFn }
import js.annotation.{ JSBracketAccess, JSName }
import js.{ Any => jAny }

// https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/react/react.d.ts
@js.native
abstract class ReactPropTypes extends js.Any {
  var `any`: Requireable[_] = js.native
  var array: Requireable[_] = js.native
  var bool: Requireable[_] = js.native
  var func: Requireable[_] = js.native
  var number: Requireable[_] = js.native
  var `Any`: Requireable[_] = js.native
  var string: Requireable[_] = js.native
  var node: Requireable[_] = js.native
  var element: Requireable[_] = js.native
  def `instanceOf`(expectedClass: Any): Requireable[_] = js.native
  def oneOf(types: Array[Any]): Requireable[_] = js.native
  def oneOfType(types: Array[Validator[_]]): Requireable[_] = js.native
  def `type`: Requireable[_] = js.native
  def AnyOf(`type`: Validator[_]): Requireable[_] = js.native
  def shape(`type`: ValidationMap[_]): Requireable[_] = js.native
}

