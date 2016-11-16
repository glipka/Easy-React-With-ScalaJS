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
 
package com.glipka.easyReactJS.reduxForm
import scala.scalajs.js
import scala.scalajs.js._
import com.glipka.easyReactJS.react.SyntheticEvent
import scala.scalajs.js.annotation.JSName

@js.native
object ReduxForm extends js.Any {
  type FieldValue = Any
  type FormData = js.Array[Object with Dynamic]

  /**
   * @param value The current value of the field.
   * @param previousValue The previous value of the field before the current
   * action was dispatched.
   * @param allValues All the values of the current form.
   * @param previousAllValues All the values of the form before the current
   * change. Useful to change one field based on a change in another.
   */
  type Normalizer = (FieldValue, FieldValue, FormData, FormData) => Any
  @JSName("reducer")
  val reducer: js.Function2[js.Any, js.Any, js.Any] = js.native

  @JSName("reduxForm")
  def reduxForm(config: js.Dynamic): js.Dynamic = js.native

  val Field: js.Any = js.native
  val FieldArray: js.Any = js.native
  @JSName("formValueSelector")
  val formValueSelector : js.Function1[String,js.Dynamic] = js.native 

}