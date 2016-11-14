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

package react
import scala.scalajs.js
import scala.scalajs.js._
import org.scalajs.dom.html
import js.{ UndefOr, Any, Function => JFn }
import js.annotation.{ JSBracketAccess, JSName }
import js.{ Any => jAny }
import org.scalajs.dom._
import org.scalajs.dom.raw
import org.scalajs.dom.raw._
import scala.scalajs.js.annotation.JSName

// https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/react/react.d.ts
//@null
//@JSName("React")
@js.native
object React extends js.Any {

  type ReactEventHandler = EventHandler[SyntheticEvent]

  type ClipboardEventHandler = EventHandler[ClipboardEvent];
  type CompositionEventHandler = EventHandler[CompositionEvent];
  type DragEventHandler = EventHandler[DragEvent];
  type FocusEventHandler = EventHandler[FocusEvent];
  type FormEventHandler = EventHandler[FormEvent];
  type KeyboardEventHandler = EventHandler[KeyboardEvent];
  type MouseEventHandler = EventHandler[MouseEvent];
  type TouchEventHandler = EventHandler[TouchEvent];
  type UIEventHandler = EventHandler[UIEvent];
  type WheelEventHandler = EventHandler[WheelEvent];
  type AnimationEventHandler = EventHandler[AnimationEvent];
  type TransitionEventHandler = EventHandler[TransitionEvent]

  def createClass[P, S](spec: ComponentSpec[P, S]): ClassicComponentClass[P] = js.native
  def createFactory[P <: DOMAttributes, T <: Element](`type`: String): DOMFactory[P, T] = js.native
  def createFactory[P, T <: Component[P, _], C <: ComponentClass[P]](`type`: ClassTypeData[P]): ComponentFactory[P, T] = js.native
  def createFactory[P](`type`: ComponentClass[P]): Factory[P] = js.native
  def createFactory[P](`type`: js.Dynamic): Factory[P] = js.native

 // def createElement[P <: DOMAttributes, T <: Element](`type`: String, props: P, children: Any*): DOMElement[P, T] = js.native
 // def createElement[P, T <: Component[P, _], C <: ComponentClass[P]](`type`: ClassTypeData[P], props: P, children: Any*): ComponentElement[P, T] = js.native
//  def createElement[P](`type`: ComponentClass[P], props: js.Object, children: Any*): ReactElement[P] = js.native
  def cloneElement[P <: DOMAttributes, T <: Element](element: DOMElement[P, T], props: P, children: Any*): DOMElement[P, T] = js.native
  def cloneElement[P <: Q, Q](element: SFCElement[P], props: Q, children: Any*): SFCElement[P] = js.native
  def cloneElement[P <: Q, Q, T <: Component[P, _]](element: ComponentElement[P, T], props: Q, children: Any*): ComponentElement[P, T] = js.native
  def cloneElement[P <: Q, Q](element: ReactElement[P], props: Q, children: Any*): ReactElement[P] = js.native
  def isValidElement[P](`Any`: Any): Boolean = js.native
  var DOM: Any = js.native
  var PropTypes: ReactPropTypes = js.native
  var Children: ReactChildren = js.native
  var version: String = js.native
//  def createElement[P <: DOMAttributes, T <: Element](`type`: String): DOMElement[P, T] = js.native
//  def createElement[P](`type`: ClassTypeData[P]): ComponentElement[P, ClassicComponent[P, _]] = js.native
//  def createElement[P](`type`: ComponentClass[P], props: P, children: Any*): ReactElement[P] = js.native
  def cloneElement[P <: DOMAttributes, T <: Element](element: DOMElement[P, T]): DOMElement[P, T] = js.native
  def cloneElement[P <: Q, Q](element: SFCElement[P]): SFCElement[P] = js.native
  def cloneElement[P <: Q, Q, T <: Component[P, _]](element: ComponentElement[P, T]): ComponentElement[P, T] = js.native
  def cloneElement[P <: Q, Q](element: ReactElement[P]): ReactElement[P] = js.native
  //def createFactory[P](`type`: StatelessComponent[P]): Factory[P] = js.native.asInstanceOf[Factory[P]]
 // def createElement[P <: DOMAttributes, T <: Element](`type`: String, props: js.Object, children: Any*): ReactElement[P] = js.native
  // def createElement[P](`type`: ClassTypeData[P], props: ClassAttributesClassicComponentPAny[P], children: Any*): ComponentElement[P, ClassicComponent[P, _]] = js.native.asInstanceOf[ComponentElement[P, ClassicComponent[P, _]]]
//  def createElement[P, T <: Component[P, _], C <: ComponentClass[P]](`type`: ClassTypeData[P], props: ClassAttributesT[T], children: Any*): ComponentElement[P, T] = js.native
//  def createElement[T <: Component[_, _]](`type`: T, props: js.Object, children: Any*): ReactElement[_] = js.native
//  def createElement[P, Q, R](`type`: js.Dynamic, props: P, children: Any*): ReactElement[P] = js.native
   def createElement[P, Q, R](`type`: Any, props: P, children: Any*): ReactElement[P] = js.native
//   def createElement[P, Q, R](`type`: Any, props: js.Any, children: Any*): ReactElement[P] = js.native
  //def createElement[P, S](ctor: ReactTypedConstructor[_, _],props:js.Object,chileren:Any*)=js.native

  //def createElement[P](`type`: StatelessComponent[P], props: P, children: Any*): ReactElement[P] = js.native.asInstanceOf[ReactElement[P]]
  //def createElement[P](`type`: StatelessComponent[P], props: Attributes, children: Any*): ReactElement[P] = js.native.asInstanceOf[ReactElement[P]]
  def cloneElement[P <: DOMAttributes, T <: Element](element: DOMElement[P, T], props: ClassAttributes[T], children: Any*): DOMElement[P, T] = js.native
  def createElement[P](`type`: StatelessComponent[P]): ReactElement[P] = js.native

  /** This class was automatically generated for disambiguating erased method signatures. */
}

 
@js.native
class ClassAttributesT[T](props: ClassAttributes[T]) extends js.Any {}
@js.native
trait ReactTypedConstructor[P, S] extends js.Any {
  var contextTypes: js.UndefOr[js.Any] = js.native
  var childContextTypes: js.UndefOr[js.Any] = js.native
}
