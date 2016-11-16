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

@js.native trait PositionProps extends TransitionCallbacks with Props[Position]  with js.Any {
  var dimension: Function = js.native
  var getDimensionValue: Function = js.native
  var in: Boolean = js.native
  var role: String = js.native
  var timeout: Int = js.native
  var transitionAppear: Boolean = js.native
  var unmountOnExit: Boolean = js.native
}
@js.native
class Position(props:PositionProps) extends Component[PositionProps, Any](props) with js.Any {
}