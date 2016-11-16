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

@js.native trait OverlayProps extends js.Any {
  // Optional
  var animation: Any = js.native // TODO: Add more specific type
  var container: Any = js.native // TODO: Add more specific type
  var containerPadding: Int = js.native // TODO: Add more specific type
  var onEnter: Function = js.native
  var onEntered: Function = js.native
  var onEntering: Function = js.native
  var onExit: Function = js.native
  var onExited: Function = js.native
  var onExiting: Function = js.native
  var onHide: Function = js.native
  var placement: String = js.native
  var rootClose: Boolean = js.native
  var show: Boolean = js.native
  var target: Function = js.native
}
@js.native
class Overlay(props: OverlayProps) extends Component[OverlayProps, Any](props) with js.Any {
} 