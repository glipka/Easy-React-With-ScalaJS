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

// https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/react/react.d.ts
@js.native
abstract class ReactChildren extends js.Any {

  def mapFnReactElementAnyBiFunction[T](children: Any, fn1: (ReactElement[_], Double) => T) = js.native
  def forEachFnReactElementAnyBiFunction(children: Any, fn: (ReactElement[_], Double) => Any) = js.native
  def count(children: Any): Double = js.native
  def only(children: Any): ReactElement[_] = js.native
  //  Union3[ReactElement[?],String,Double][] toArray(children:Any);
  def mapFnStringBiFunction[T](children: Any, fn: java.util.function.BiFunction[String, Double, T]) = js.native
  def mapFnBiFunction[T](children: Any, fn: java.util.function.BiFunction[Double, Double, T]) = js.native

  def forEachFnStringBiFunction(children: Any, fn: Function2[String, Double, Any]): js.Any = js.native

  def forEachFnBiFunction(children: Any, fn: Function2[Double, Double, Any]): js.Any = js.native
}

