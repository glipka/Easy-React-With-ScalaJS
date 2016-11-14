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
import react.React._
import ReduxForm._
import redux._
import scala.scalajs.js.annotation.ScalaJSDefined

@js.native
trait ReduxFormProps extends js.Any {
  /**
   * The name of the currently active (with focus) field.
   */
  var active: String = js.native

  /**
   * A function that may be called to initiate asynchronous validation if
   * asynchronous validation is enabled.
   */
  var asyncValidate: Function = js.native

  /**
   * true if the asynchronous validation function has been called but has not
   * yet returned.
   */
  var asyncValidating: Boolean = js.native

  /**
   * Destroys the form state in the Redux store. By default, this will be
   * called for you in componentWillUnmount().
   */
  def destroyForm(): Unit = js.native

  /**
   * true if the form data has changed from its initialized values. Opposite
   * of pristine.
   */
  var dirty: Boolean = js.native

  /**
   * A generic error for the entire form given by the _error key in the
   * result from the synchronous validation function, the asynchronous
   * validation, or the rejected promise from onSubmit.
   */
  var error: js.Dynamic = js.native

  /**
   * The form data, in the form { field1: <Object>, field2: <Object> }. The
   * field objects are meant to be destructured into your input component as
   * props, e.g. <input type="text" {...field.name}/>. Each field Object has
   * the following properties:
   */

  // **********************   revoir ici la dÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â©finition ÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â  la place de Any
  //var fields : {[field:String]: FieldProp} 
  var fields: js.Array[Object with Dynamic] = js.native

  /**
   * A function meant to be passed to <form onSubmit={handleSubmit}> or to
   * <button onClick={handleSubmit}>. It will run validation, both sync and
   * async, and, if the form is valid, it will call
   * this.props.onSubmit(data) with the contents of the form data.
   * Optionally, you may also pass your onSubmit function to handleSubmit
   * which will take the place of the onSubmit prop. For example: <form
   * onSubmit={handleSubmit(this.save.bind(this))}> If your onSubmit
   * function returns a promise, the submitting property will be set to true
   * until the promise has been resolved or rejected. If it is rejected with
   * an object matching { field1: 'error', field2: 'error' } then the
   * submission errors will be added to each field (to the error prop) just
   * like async validation errors are. If there is an error that is not
   * specific to any field, but applicable to the entire form, you may pass
   * that as if it were the error for a field called _error, and it will be
   * given as the error prop.
   */
  val handleSubmit: js.Function1[js.Any, js.Any] = js.native
  val reset: js.Function = js.native
  val submit: js.Function = js.native
  //val asyncValidate:js.Function = js.native 
  val getValues: js.Function = js.native
  val register: js.Function = js.native
  val unregister: js.Function = js.native
  val submitCompleted: js.Function = js.native

  /**
   * Initializes the form data to the given values. All dirty and pristine
   * state will be determined by comparing the current data with these
   * initialized values.
   * @param data
   */
  def initializeForm(data: FormData): Unit = js.native

  /**
   * true if the form has validation errors. Opposite of valid.
   */
  def invalid: Boolean = js.native

  /**
   * true if the form data is the same as its initialized values. Opposite
   * of dirty.
   */
  def pristine: Boolean = js.native

  /**
   * Resets all the values in the form to the initialized state, making it
   * pristine again.
   */
  def resetForm(): Unit = js.native

  /**
   * The same formKey prop that was passed in. See Editing Multiple Records.
   */
  var formKey: String = js.native

  /**
   * Whether or not your form is currently submitting. This prop will only
   * work if you have passed an onSubmit function that returns a promise. It
   * will be true until the promise is resolved or rejected.
   */
  var submitting: Boolean = js.native

  /**
   * Starts as false. If onSubmit is called, and fails to submit for any
   * reason, submitFailed will be set to true. A subsequent successful
   * submit will set it back to false.
   */
  var submitFailed: Boolean = js.native

  /**
   * Marks the given fields as "touched" to show errors.
   * @param field
   */
  def touch(field: Array[String]*): Unit = js.native

  /**
   * Marks all fields as "touched" to show errors. This will automatically
   * happen on form submission.
   */
  def touchAll(): Unit = js.native

  /**
   * Clears the "touched" flag for the given fields
   * @param field
   */
  def untouch(field: Array[String]*): Unit = js.native

  /**
   * Clears the "touched" flag for the all fields
   */
  def untouchAll(): Unit = js.native

  /**
   * true if the form passes validation (has no validation errors). Opposite
   * of invalid.
   */
  var valid: Boolean = js.native

  /**
   * All of your values in the form { field1: <String>, field2: <String> }.
   */
  var values: FormData = js.native

  def dispatch: js.Function1[Any, Any] = js.native
  val store: Store[_] = js.native
}
