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
/* Utils */
@js.native trait bootstrapUtilsType extends js.Any{
  // TODO: Implement functions
}

@js.native trait ValidComponentChildrenType extends js.Any {
  var map: (Any, Any, Any) => Any
  var forEach: (Any, Any, Any) => Any
  var count: (Any) => Int
  var filter: (Any, Any, Any) => Any
  var find: (Any, Any, Any) => Any
  var every: (Any, Any, Any) => Any
  var some: (Any, Any, Any) => Any
  var toArray: (Any) => Any
}
@js.native
class Utils extends js.Any {
  def createChainedFunctionType(funcs: Array[Function]*): Function=js.native
//  val createChainedFunction: createChainedFunctionType = js.native
  val ValidComponentChildren: ValidComponentChildrenType=js.native
}