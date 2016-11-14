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
 
package reduxForm
import scala.scalajs.js
import scala.scalajs.js._
import react.SyntheticEvent
import scala.scalajs.js.annotation.ScalaJSDefined

/**
 * The props under the input key are what connects your input component to Redux and are meant to be destructured into your <input/> component.
 */

@js.native
class InputProps extends js.Any {
  /**
   *     An alias for value only when value is a boolean.
   *      Provided for convenience of destructuring the whole field object into the props of a form element.
   *
   */
  var value: String = js.native
  var checked: Boolean = js.native
  /**
   * The name prop passed in.
   */

  var name: String = js.native

  /**
   * A function to call when the form field loses focus. It expects to either receive the React SyntheticEvent or the current value of the field.
   */
  val onBlur: js.Function1[js.Any, js.Any] = js.native
  

  /**
   *    A function to call when the form field is changed. It expects to either receive the React SyntheticEvent or the new value of the field.
   */
  def onChange: js.Function1[js.Any, js.Any ] = js.native

  /**
   *   A function to call when the form field receives a dragStart event.
   *   Saves the field value in the event for giving the field it is dropped into.
   */
  def onDragStart: js.Function1[js.Any, js.Any] = js.native

  /**
   *     A function to call when the form field receives a drop event.
   */
  def onDrop: js.Function1[js.Any, js.Any] = js.native

  /**
   *   A function to call when the form field receives focus.
   */
  def onFocus: js.Function  = js.native

}