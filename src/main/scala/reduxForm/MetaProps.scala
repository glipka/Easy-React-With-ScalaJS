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

/**
 *   the props under the meta key are metadata about the state of this field that redux-form is tracking for you.
 */
@js.native
class MetaProps extends js.Any {

  /**
   *   true if this field currently has focus. It will only work if you are passing onFocus to your input element.
   */
  var active: Boolean = js.native

  /**
   * true if this field has been set with the AUTOFILL action and has not since been changed with a CHANGE action. This is useful to render the field in a way that the user can tell that the value was autofilled for them.
   */
  var autofilled: Boolean = js.native

  /**
   *    true if the form is currently running asynchronous validation because this field was blurred.
   */

  var asyncValidating: Boolean = js.native

  /**
   * true if the field value has changed from its initialized value. Opposite of pristine.
   */
  var dirty: Boolean = js.native

  /**
   *  The Redux dispatch function.
   */
  var dispatch: js.Function = js.native

  /**
   *   The error for this field if its value is not passing validation.
   *   Both synchronous, asynchronous, and submit validation errors will be reported here.
   */
  var error: js.Dynamic = js.native

 

  /**
   *  true if the field value fails validation (has a validation error). Opposite of valid.
   */
  var invalid: Boolean = js.native

  /**
   *  true if the field value is the same as its initialized value. Opposite of dirty.
   */
  var pristine: Boolean = js.native

  /**
   * true if the field is currently being submitted
   */
  var submitting: Boolean = js.native

  /**
   * true if the field has been touched. By default this will be set when the field is blurred.
   */
  var touched: Boolean = js.native

  /**
   *  true if the field value passes validation (has no validation errors). Opposite of invalid.
   */
  var valid: Boolean = js.native

  /**
   *  true if this field has ever had focus. It will only work if you are passing onFocus to your input element.
   */
  var visited: Boolean = js.native

}