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
 package reactRedux
import scala.scalajs.js
/** 
 * If true, implements shouldComponentUpdate and shallowly compares the result of mergeProps,
 * preventing unnecessary updates, assuming that the component is a  pure  component
 * and does not rely on any input or state other than its props and the selected Redux storeÃƒÂ¢Ã¢â€šÂ¬Ã¢â€žÂ¢s state.
 * Defaults to true.
 * @default true
 */

/**
 * If true, stores a ref to the wrapped component instance and makes it available via
 * getWrappedInstance() method. Defaults to false.
 */
@js.native
trait Options extends js.Any {
  val pure: Boolean = js.native
  val withRef: Boolean = js.native
} 

 
   
   
  
