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
package com.glipka.easyReactJS.reactRouter
import scala.scalajs.js
import com.glipka.easyReactJS.react._
import GlobalDefinition._

@js.native
trait HistoryContext extends js.Any {
  val action: String = js.native
  val location: Location = js.native
  val push: js.Function = js.native
  val replace: js.Function = js.native
  val go: js.Function = js.native
  val goBack: js.Function = js.native
  val goForward: js.Function = js.native
  val canGo: js.Function = js.native
  val block: js.Function = js.native
}