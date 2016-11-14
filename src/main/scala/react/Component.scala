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
import org.scalajs.dom.raw
import org.scalajs.dom.raw._

import react.jsx.{ Element => JsxElement }

// https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/react/react.d.ts

@js.native
@JSName("React.Component")
abstract class Component[P, S](props: P, context: Any) extends ComponentLifecycle[P, S] with js.Any {
  def this(props: P) = this(props, null)
  def setState(state:js.Any): Unit = js.native
  def setState(state: S, callback: java.util.function.Supplier[Any]): Unit = js.native
  def forceUpdate(callback: java.util.function.Supplier[Any]): Unit = js.native

  //def render(): ReactElement[P] = js.native
  def render(): Any = js.native // on passe la mÃƒÆ’Ã‚Â©thode en any pour faciliter l'utilisation des macros 
  //val props:  jsweet.util.union.Union[P,Props]
  //val props:   P
  var state: S = js.native
  var refs: js.Dynamic = js.native // tableau des rÃƒÆ’Ã‚Â©fÃƒÆ’Ã‚Â©rences. 


  // 

  def setState(f: (S, P) => P): Unit = js.native
 // def setState(state: S): Unit = js.native
  def forceUpdate(): Unit = js.native
  def isPrototypeOf(v: Object): Boolean = js.native

}

/** This is an automatically generated Any type (see the source definition). */
@js.native
class Refs extends js.Any {
  // def $get(key:String) : jsweet.util.union.Union[Component[_,_],Element]  ) = js.native
}
