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
package react
import scala.scalajs.js
import scala.scalajs.js._
import org.scalajs.dom.html
import js.{ UndefOr, Any, Function => JFn }
import js.annotation.{ JSBracketAccess, JSName }
import js.{ Any => jAny }
import org.scalajs.dom.raw
import org.scalajs.dom.raw._
import org.w3c.dom.html.HTMLDocument

// https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/react/react.d.ts

@js.native
abstract class HTMLAttributes extends DOMAttributes with js.Any {
  var defaultChecked: Boolean = js.native
  //    var  defaultValue:jsweet.util.union.Union[String,Array[String]];
  var accept: String = js.native
  var acceptCharset: String = js.native
  var accessKey: String = js.native
  var action: String = js.native
  var allowFullScreen: Boolean = js.native
  var allowTransparency: Boolean = js.native
  var alt: String = js.native
  var async: Boolean = js.native
  var autoComplete: String = js.native
  var autoFocus: Boolean = js.native
  var autoPlay: Boolean = js.native
  var capture: Boolean = js.native
  //    var cellPadding:jsweet.util.union.Union[Double,String] ;
  //     var cellSpacing:jsweet.util.union.Union[Double,String] ;
  var charSet: String = js.native
  var challenge: String = js.native
  var checked: Boolean = js.native
  var classID: String = js.native
  var className: String = js.native
  var cols: Double = js.native
  var colSpan: Double = js.native
  var content: String = js.native
  var contentEditable: String = js.native
  var contextMenu: String = js.native
  var controls: String = js.native
  var coords: String = js.native
  var crossOrigin: String = js.native
  var data: String = js.native
  var dateTime: String = js.native
  var Default: Boolean = js.native
  var defer: Boolean = js.native
  var dir: String = js.native
  var disabled: Boolean = js.native
  var download: Any = js.native
  var draggable: Boolean = js.native
  var encType: String = js.native
  var form: String = js.native
  var formAction: String = js.native
  var formEncType: String = js.native
  var formMethod: String = js.native
  var formNoValidate: Boolean = js.native
  var formTarget: String = js.native
  //   var frameBorder: jsweet.util.union.Union[Double,String] ;
  var headers: String
  //   var height: jsweet.util.union.Union[Double,String] ;
  var hidden: Boolean = js.native
  var high: Double = js.native
  var href: String = js.native
  var hrefLang: String = js.native
  var htmlFor: String = js.native
  var httpEquiv: String = js.native
  var icon: String = js.native
  var id: String = js.native
  var inputMode: String = js.native
  var integrity: String = js.native
  var is: String = js.native
  var keyParams: String = js.native
  var keyType: String = js.native
  var kind: String = js.native
  var label: String = js.native
  var lang: String = js.native
  var list: String = js.native
  var loop: Boolean = js.native
  var low: Double = js.native
  var manifest: String = js.native
  var marginHeight: Double = js.native
  var marginWidth: Double = js.native
  //   var max:jsweet.util.union.Union[Double,String]  
  var maxLength: Double = js.native
  var media: String = js.native
  var mediaGroup: String = js.native
  var method: String = js.native
  //    var min: jsweet.util.union.Union[Double,String] 
  var minLength: Double = js.native
  var multiple: Boolean = js.native
  var muted: Boolean = js.native
  var name: String = js.native
  var nonce: String = js.native
  var noValidate: Boolean = js.native
  var open: Boolean = js.native
  var optimum: Double = js.native
  var pattern: String = js.native
  var placeholder: String = js.native
  var poster: String = js.native
  var preload: String = js.native
  var radioGroup: String = js.native
  var readOnly: Boolean = js.native
  var rel: String = js.native
  var required: Boolean = js.native
  var reversed: Boolean = js.native
  var role: String = js.native
  var rows: Double = js.native
  var rowSpan: Double = js.native
  var sandbox: String = js.native
  var scope: String = js.native
  var scoped: Boolean = js.native
  var scrolling: String = js.native
  var seamless: Boolean = js.native
  var selected: Boolean = js.native
  var shape: String = js.native
  var size: Double = js.native
  var sizes: String = js.native
  var span: Double = js.native
  var spellCheck: Boolean = js.native
  var src: String = js.native
  var srcDoc: String = js.native
  var srcLang: String = js.native
  var srcSet: String = js.native
  var start: Double = js.native
  //   val step:jsweet.util.union.Union[Double,String] ;
  var style: CSSProperties = js.native
  var summary: String = js.native
  var tabIndex: Double = js.native
  var target: String = js.native
  var title: String = js.native
  var `type`: String = js.native
  var useMap: String = js.native
  // var value:jsweet.util.union.Union[String,Array[String]] ;
  // var width:jsweet.util.union.Union[Double,String] ;
  var wmode: String = js.native
  var wrap: String = js.native
  var about: String = js.native
  var datatype: String = js.native
  var inlist: Any = js.native
  var prefix: String = js.native
  var property: String = js.native
  var resource: String = js.native
  var typeof: String = js.native
  var vocab: String = js.native
  var autoCapitalize: String = js.native
  var autoCorrect: String = js.native
  var autoSave: String = js.native
  var color: String = js.native
  var itemProp: String = js.native
  var itemScope: Boolean = js.native
  var itemType: String = js.native
  var itemID: String = js.native
  var itemRef: String = js.native
  var results: Double = js.native
  var security: String = js.native
  var unselectable: Boolean = js.native
  def $get(key: String): Any = js.native
  var checkedLink: ReactLink[Boolean] = js.native
  //   var valueLink : ReactLink[Union3[Boolean,String,Double]] 
}

