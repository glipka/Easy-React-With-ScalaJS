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
import com.glipka.easyReactJS.react._
import scala.scalajs.js.annotation.JSName

@js.native
class Fields  extends  js.Any {
  /**
   * true if the current value is different from the initialized value, false otherwise.
   */
val forEach: js.Function1[Any,Any] = js.native

val insert: js.Function2[Integer,Any,Any] = js.native

val length : Integer = js.native 

val map: js.Function1[Any,Any] = js.native 

val move:js.Function2[Int,Int,Any] = js.native
val pop: js.Function =  js.native
val push:js.Function1[Any,Any]= js.native
val remove:js.Function1[Int,Any]=js.native
val removeAll: js.Function=js.native
val shift:js.Function=js.native 
val swap:js.Function2[Int,Int,Any]=js.native
val unshift:js.Function1[Any,Any]=js.native 



  /**
   * The name prop that you passed in.
   */
  var name: String = js.native

  /**
   *  true if the current value is the same as the initialized value, false otherwise.
   */
  var pristine: Boolean = js.native

  /**
   *  The current value of the field.
   */
  var value: Any = js.native
  /**
   *   Returns the instance of the rendered component.
   *   For this to work, you must provide a withRef prop, and your component must not be a stateless function component.
   *
   */
  def getRenderedComponent(): Any = js.native

}