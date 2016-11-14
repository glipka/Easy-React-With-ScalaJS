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
/*# Copyright 2016 Georges Lipka
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
     * A middleware is a higher-order function that composes a dispatch function
     * to return a new dispatch function. It often turns async actions into
     * actions.
     *
     * Middleware is composable using function composition. It is useful for
     * logging actions, performing side effects like routing, or turning an
     * asynchronous API call into a series of synchronous actions.
**/
@js.native
trait Middleware[S] extends js.Any {

 // (api: MiddlewareAPI<S>): (next: Dispatch<S>) => Dispatch<S>;
  
}