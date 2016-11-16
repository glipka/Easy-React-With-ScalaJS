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
 
package redux
import scala.scalajs.js
 /**
     * An *action* is a plain object that represents an intention to change the
     * state. Actions are the only way to get data into the store. Any data,
     * whether from UI events, network callbacks, or other sources such as
     * WebSockets needs to eventually be dispatched as actions.
     *
     * Actions must have a `type` field that indicates the type of action being
     * performed. Types can be defined as constants and imported from another
     * module. ItÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢s better to use strings for `type` than Symbols because strings
     * are serializable.
     *
     * Other than `type`, the structure of an action object is really up to you.
     * If youÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢re interested, check out Flux Standard Action for recommendations on
     * how actions should be constructed.
     */
@js.native
trait Action extends js.Any {
   val   `type`: Any = js.native
 
}