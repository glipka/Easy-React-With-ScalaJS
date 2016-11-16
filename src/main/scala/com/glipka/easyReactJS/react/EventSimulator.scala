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
 
package com.glipka.easyReactJS.react
import scala.scalajs.js
import scala.scalajs.js._
import org.scalajs.dom.html
import js.{ UndefOr, Any, Function => JFn }
import js.annotation.{ JSBracketAccess, JSName }
import js.{ Any => jAny }
import org.scalajs.dom._
 
// https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/react/react.d.ts

@js.native
trait EventSimulator extends js.Any  {
  def apply(element: Element, eventData: SyntheticEventData) = js.native
  def apply(element: Element) = js.native
  def apply(element: Tuple2[Component[_, _], SyntheticEventData]) = js.native
  def apply(element: Component[_, _]) =js.native
}

