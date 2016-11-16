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

@js.native trait ProgressBarProps extends HTMLProps[ProgressBar] with js.Any  {
  // Optional
  var active: Boolean = js.native
  var bsSize: Sizes = js.native
  var bsStyle: String = js.native
  var interpolatedClass: Any = js.native // TODO: Add more specific type
  var max: Int = js.native
  var min: Int = js.native
  var now: Int = js.native
  var srOnly: Boolean = js.native
  var striped: Boolean = js.native
}
@js.native
class ProgressBar(props: ProgressBarProps) extends Component[ProgressBarProps, Any](props) with js.Any {
}