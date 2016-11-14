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
package reactBootstrap
import scala.scalajs.js
import scala.scalajs.js._
import react._
import ReactBootstrap._

@js.native trait MediaProps extends Props[Media] {
  var componentClass: ReactType = js.native
}
@js.native trait MediaClass extends ClassicComponentClass[MediaProps] with js.Any{
  var Left: MediaLeft = js.native
  var Right: MediaRight = js.native
  var Heading: MediaHeading = js.native
  var Body: MediaBody = js.native
  var List: MediaList = js.native
  var ListItem: MediaListItem = js.native
}
    