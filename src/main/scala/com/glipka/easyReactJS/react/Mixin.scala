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

// https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/react/react.d.ts

@js.native
@JSName("React.Mixin")
abstract class Mixin[P, S] extends ComponentLifecycle[P, S] with js.Any {
  var mixins: Mixin[P, S] = js.native
  var statics: Statics = js.native
  var displayName: String = js.native
  var propTypes: ValidationMap[_] = js.native
  var contextTypes: ValidationMap[_] = js.native
  var childContextTypes: ValidationMap[_] = js.native
  def getDefaultProps(): P = js.native
  def getInitialState(): S = js.native
  /** This is an automatically generated Any type (see the source definition). */

}
@js.native
abstract class Statics extends js.Any {
  def $get(key: String): Any = js.native
}

