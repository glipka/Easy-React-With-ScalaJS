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
 
package com.glipka.easyReactJS.reactBootstrap

import scala.scalajs.js
import scala.scalajs.js._
import com.glipka.easyReactJS.react._
import ReactBootstrap._
import org.scalajs.dom.raw._

@js.native trait ModalProps extends HTMLProps[Modal] with js.Any {
  // Required
  var onHide: js.Function = js.native

  // Optional
  var animation: Boolean = js.native
  var backdrop: Boolean | String = js.native
  var bsSize: Sizes = js.native
  var container: Any = js.native // TODO: Add more specific type
  var dialogClassName: String = js.native
  var dialogComponent: Any = js.native // TODO: Add more specific type
  var enforceFocus: Boolean = js.native
  var keyboard: Boolean = js.native
  var onEnter: (HTMLElement) => Any = js.native
  var onEntered: (HTMLElement) => Any = js.native
  var onEntering: (HTMLElement) => Any = js.native
  var onExit: (HTMLElement) => Any = js.native
  var onExited: (HTMLElement) => Any = js.native
  var onExiting: (HTMLElement) => Any = js.native
  var show: Boolean = js.native
}
@js.native
trait ModalClass extends ClassicComponentClass[ModalProps]  with js.Any{
  var Body: ModalBody = js.native
  var Header: ModalHeader = js.native
  var Title: ModalTitle = js.native
  var Footer: ModalFooter = js.native
  var Dialog: ModalDialog = js.native
}
  