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
import  ReactBootstrap._
import com.glipka.easyReactJS.react._
@js.native
trait AccordionProps extends  HTMLProps[Accordion] with js.Any {
  var bsSize: Sizes = js.native
  var bsStyle: String = js.native
  var collapsible: Boolean = js.native
  var defaultExpanded: Boolean = js.native
  var eventKey: Any = js.native
  var expanded: Boolean = js.native
  var footer: Any = js.native // TODO: Add more specific type
  var header: Any = js.native // TODO: Add more specific type

}