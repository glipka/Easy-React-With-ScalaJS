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
     * An *action creator* is, quite simply, a function that creates an action. Do
     * not confuse the two terms  again, an action is a payload of information, and
     * an action creator is a factory that creates an action.
     *
     * Calling an action creator only produces an action, but does not dispatch
     * it. You need to call the storeÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢s `dispatch` function to actually cause the
     * mutation. Sometimes we say *bound action creators* to mean functions that
     * call an action creator and immediately dispatch its result to a specific
     * store instance.
     *
     * If an action creator needs to read the current state, perform an API call,
     * or cause a side effect, like a routing transition, it should return an
     * async action instead of an action.
     *
     * @template A Returned action type.
     */
@js.native
trait ActionCreator[A] extends js.Any {
   //(...args: any[]): A;
}