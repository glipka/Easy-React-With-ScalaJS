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
import ReduxForm._
import react.SyntheticEvent
import redux._
import Dynamic.literal
@js.native
trait ReduxFormConfig extends js.Any{
  /**
   * a list of all your fields in your form. You may change these dynamically
   * at runtime.
   */
  var fields: Array[String] = js.native;

  /**
   * the name of your form and the key to where your form's state will be
   * mounted under the redux-form reducer
   */
  var form: String = js.native;

  /**
   * By default, async blur validation is only triggered if synchronous
   * validation passes, and the form is dirty or was never initialized (or if
   * submitting). Sometimes it may be desirable to trigger asynchronous
   * validation even in these cases, for example if all validation is performed
   * asynchronously and you want to display validation messages if a user does
   * not change a field, but does touch and blur it. Setting
   * alwaysAsyncValidate to true will always run asynchronous validation on
   * blur, even if the form is pristine or sync validation fails.
   */
  var alwaysAsyncValidate: Boolean = js.native;

  /**
   * field names for which onBlur should trigger a call to the asyncValidate
   * function. Defaults to [].
   *
   * See Asynchronous Blur Validation Example for more details.
   */
  var asyncBlurFields: Array[String] = js.native;

  /**
   * a function that takes all the form values, the dispatch function, and
   * the props given to your component, and returns a Promise that will
   * resolve if the validation is passed, or will reject with an object of
   * validation errors in the form { field1: <String>, field2: <String> }.
   *
   * See Asynchronous Blur Validation Example for more details.
   */
  def asyncValidate(values: FormData, dispatch: Dispatch[Any], props: Object): Promise[Any] = js.native;

  /**
   * Whether or not to automatically destroy your form's state in the Redux
   * store when your component is unmounted. Defaults to true.
   */
  var destroyOnUnmount: Boolean = js.native;

  /**
   * The key for your sub-form.
   *
   * See Multirecord Example for more details.
   */
  var formKey: String = js.native;

  /**
   * A function that takes the entire Redux state and the reduxMountPoint
   * (which defaults to "form"). It defaults to:
   * (state, reduxMountPoint) => state[reduxMountPoint].
   * The only reason you should provide this is if you are keeping your Redux
   * state as something other than plain javascript objects, e.g. an
   * Immutable.Map.
   */
  def getFormState(state: Any, reduxMountPoint: String): Any = js.native;

  /**
   * The values with which to initialize your form in componentWillMount().
   * Particularly useful when Editing Multiple Records, but can also be used
   * with single-record forms. The values should be in the form
   * { field1: 'value1', field2: 'value2' }.
   *
   */

  var initialValues: js.Array[Object with Dynamic] = js.native

  /**
   * The function to call with the form data when the handleSubmit() is fired
   * from within the form component. If you do not specify it as a prop here,
   * you must pass it as a parameter to handleSubmit() inside your form
   * component.
   */
  def onSubmit(values: FormData, dispatch: Dispatch[Any]): Any = js.native;

  /**
   * If true, the form values will be overwritten whenever the initialValues
   * prop changes. If false, the values will not be overwritten if the form has
   * previously been initialized. Defaults to true.
   */
  var overwriteOnInitialValuesChange: Boolean = js.native;

  /**
   * If specified, all the props normally passed into your decorated
   * component directly will be passed under the key specified. Useful if
   * using other decorator libraries on the same component to avoid prop
   * namespace collisions.
   */
  var propNamespace: String = js.native;

  /**
   * if true, the decorated component will not be passed Any of the onX
   * functions as props that will allow it to mutate the state. Useful for
   * decorating another component that is not your form, but that needs to
   * know about the state of your form.
   */
  var readonly: Boolean = js.native;

  /**
   * The use of this property is highly discouraged, but if you absolutely
   * need to mount your redux-form reducer at somewhere other than form in
   * your Redux state, you will need to specify the key you mounted it under
   * with this property. Defaults to 'form'.
   *
   * See Alternate Mount Point Example for more details.
   */
  var reduxMountPoint: String = js.native;

  /**
   * If set to true, a failed submit will return a rejected promise. Defaults
   * to false. Only use this if you need to detect submit failures and run
   * some code when a submit fails.
   */
  var returnRejectedSubmitPromise: Boolean = js.native;

  /**
   * marks fields as touched when the blur action is fired. Defaults to true.
   */
  var touchOnBlur: Boolean = js.native;

  /**
   * marks fields as touched when the change action is fired. Defaults to
   * false.
   */
  var touchOnChange: Boolean = js.native;

  /**
   * a synchronous validation function that takes the form values and props
   * passed into your component. If validation passes, it should return {}.
   * If validation fails, it should return the validation errors in the form
   * { field1: <String>, field2: <String> }.
   * Defaults to (values, props) => ({}).
   */
  def validate(values: FormData, props: js.Array[Object with Dynamic]): js.Object = js.native;
}
