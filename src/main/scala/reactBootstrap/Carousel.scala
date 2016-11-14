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

@js.native trait CarouselProps extends HTMLProps[Carousel] with js.Any {
  var activeIndex: Int = js.native
  var bsSize: Sizes = js.native
  var bsStyle: String = js.native
 //var controls: Boolean = js.native
  var defaultActiveIndex: Int = js.native
  var direction: String = js.native
  var indicators: Boolean = js.native
  var interval: Int = js.native
  var nextIcon: ReactNode = js.native
  var onSlideEnd: Function = js.native
  var pauseOnHover: Boolean = js.native
  var prevIcon: ReactNode = js.native
  var slide: Boolean = js.native
  // wrap : Boolean=js.native
}
@js.native trait CarouselClass extends ClassicComponentClass[CarouselProps] with js.Any {
  var Caption: CarouselCaption = js.native
  var Item: CarouselItem = js.native
}
   