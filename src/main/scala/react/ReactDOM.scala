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

// https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/react/react.d.ts
//@null
//@JSName("ReactDOM")
@js.native
object ReactDOM extends js.Any {
  var a: HTMLFactory[HTMLAnchorElement] = js.native
  var abbr: HTMLFactory[HTMLElement] = js.native
  var address: HTMLFactory[HTMLElement] = js.native
  var area: HTMLFactory[HTMLAreaElement] = js.native
  var article: HTMLFactory[HTMLElement] = js.native
  var aside: HTMLFactory[HTMLElement] = js.native
  var audio: HTMLFactory[HTMLAudioElement] = js.native
  var b: HTMLFactory[HTMLElement] = js.native
  var base: HTMLFactory[HTMLBaseElement] = js.native
  var bdi: HTMLFactory[HTMLElement] = js.native
  var bdo: HTMLFactory[HTMLElement] = js.native
  var big: HTMLFactory[HTMLElement] = js.native
  var blockquote: HTMLFactory[HTMLElement] = js.native
  var body: HTMLFactory[HTMLBodyElement] = js.native
  var br: HTMLFactory[HTMLBRElement] = js.native
  var button: HTMLFactory[HTMLButtonElement] = js.native
  var canvas: HTMLFactory[HTMLCanvasElement] = js.native
  var caption: HTMLFactory[HTMLElement] = js.native
  var cite: HTMLFactory[HTMLElement] = js.native
  var code: HTMLFactory[HTMLElement] = js.native
  var col: HTMLFactory[HTMLTableColElement] = js.native
  var colgroup: HTMLFactory[HTMLTableColElement] = js.native
  var data: HTMLFactory[HTMLElement] = js.native
  var datalist: HTMLFactory[HTMLDataListElement] = js.native
  var dd: HTMLFactory[HTMLElement] = js.native
  var details: HTMLFactory[HTMLElement] = js.native
  var del: HTMLFactory[HTMLElement] = js.native
  var dfn: HTMLFactory[HTMLElement] = js.native
  var dialog: HTMLFactory[HTMLElement] = js.native
  var div: HTMLFactory[HTMLDivElement] = js.native
  var dl: HTMLFactory[HTMLDListElement] = js.native
  var dt: HTMLFactory[HTMLElement] = js.native
  var em: HTMLFactory[HTMLElement] = js.native
  var embed: HTMLFactory[HTMLEmbedElement] = js.native
  var fieldset: HTMLFactory[HTMLFieldSetElement] = js.native
  var figcaption: HTMLFactory[HTMLElement] = js.native
  var figure: HTMLFactory[HTMLElement] = js.native
  var footer: HTMLFactory[HTMLElement] = js.native
  var form: HTMLFactory[HTMLFormElement] = js.native
  var h1: HTMLFactory[HTMLHeadingElement] = js.native
  var h2: HTMLFactory[HTMLHeadingElement] = js.native
  var h3: HTMLFactory[HTMLHeadingElement] = js.native
  var h4: HTMLFactory[HTMLHeadingElement] = js.native
  var h5: HTMLFactory[HTMLHeadingElement] = js.native
  var h6: HTMLFactory[HTMLHeadingElement] = js.native
  var head: HTMLFactory[HTMLHeadElement] = js.native
  var header: HTMLFactory[HTMLElement] = js.native
  var hgroup: HTMLFactory[HTMLElement] = js.native
  var hr: HTMLFactory[HTMLHRElement] = js.native
  var html: HTMLFactory[HTMLHtmlElement] = js.native
  var i: HTMLFactory[HTMLElement] = js.native
  var iframe: HTMLFactory[HTMLIFrameElement] = js.native
  var img: HTMLFactory[HTMLImageElement] = js.native
  var input: HTMLFactory[HTMLInputElement] = js.native
  var ins: HTMLFactory[HTMLModElement] = js.native
  var keygen: HTMLFactory[HTMLElement] = js.native
  var label: HTMLFactory[HTMLLabelElement] = js.native
  var legend: HTMLFactory[HTMLLegendElement] = js.native
  var li: HTMLFactory[HTMLLIElement] = js.native
  var link: HTMLFactory[HTMLLinkElement] = js.native
  var main: HTMLFactory[HTMLElement] = js.native
  var map: HTMLFactory[HTMLMapElement] = js.native
  var mark: HTMLFactory[HTMLElement] = js.native
  var menu: HTMLFactory[HTMLElement] = js.native
  var menuItem: HTMLFactory[HTMLElement] = js.native
  var meta: HTMLFactory[HTMLMetaElement] = js.native
  var meter: HTMLFactory[HTMLElement] = js.native
  var nav: HTMLFactory[HTMLElement] = js.native
  var noscript: HTMLFactory[HTMLElement] = js.native
  var `object`: HTMLFactory[HTMLObjectElement] = js.native
  var ol: HTMLFactory[HTMLOListElement] = js.native
  var optgroup: HTMLFactory[HTMLOptGroupElement] = js.native
  var option: HTMLFactory[HTMLOptionElement] = js.native
  var output: HTMLFactory[HTMLElement] = js.native
  var p: HTMLFactory[HTMLParagraphElement] = js.native
  var param: HTMLFactory[HTMLParamElement] = js.native
  var picture: HTMLFactory[HTMLElement] = js.native
  var pre: HTMLFactory[HTMLPreElement] = js.native
  var progress: HTMLFactory[HTMLProgressElement] = js.native
  var q: HTMLFactory[HTMLQuoteElement] = js.native
  var rp: HTMLFactory[HTMLElement] = js.native
  var rt: HTMLFactory[HTMLElement] = js.native
  var ruby: HTMLFactory[HTMLElement] = js.native
  var s: HTMLFactory[HTMLElement] = js.native
  var samp: HTMLFactory[HTMLElement] = js.native
  var script: HTMLFactory[HTMLElement] = js.native
  var section: HTMLFactory[HTMLElement] = js.native
  var select: HTMLFactory[HTMLSelectElement] = js.native
  var small: HTMLFactory[HTMLElement] = js.native
  var source: HTMLFactory[HTMLSourceElement] = js.native
  var span: HTMLFactory[HTMLSpanElement] = js.native
  var strong: HTMLFactory[HTMLElement] = js.native
  var style: HTMLFactory[HTMLStyleElement] = js.native
  var sub: HTMLFactory[HTMLElement] = js.native
  var summary: HTMLFactory[HTMLElement] = js.native
  var sup: HTMLFactory[HTMLElement] = js.native
  var table: HTMLFactory[HTMLTableElement] = js.native
  var tbody: HTMLFactory[HTMLTableSectionElement] = js.native
  var td: HTMLFactory[HTMLTableDataCellElement] = js.native
  var textarea: HTMLFactory[HTMLTextAreaElement] = js.native
  var tfoot: HTMLFactory[HTMLTableSectionElement] = js.native
  var th: HTMLFactory[HTMLTableHeaderCellElement] = js.native
  var thead: HTMLFactory[HTMLTableSectionElement] = js.native
  var time: HTMLFactory[HTMLElement] = js.native
  var title: HTMLFactory[HTMLTitleElement] = js.native
  var tr: HTMLFactory[HTMLTableRowElement] = js.native
  var track: HTMLFactory[HTMLTrackElement] = js.native
  var u: HTMLFactory[HTMLElement] = js.native
  var ul: HTMLFactory[HTMLUListElement] = js.native
  var `var`: HTMLFactory[HTMLElement] = js.native
  var video: HTMLFactory[HTMLVideoElement] = js.native
  var wbr: HTMLFactory[HTMLElement] = js.native
  var svg: SVGFactory = js.native
  var circle: SVGFactory = js.native
  var defs: SVGFactory = js.native
  var ellipse: SVGFactory = js.native
  var g: SVGFactory = js.native
  var image: SVGFactory = js.native
  var line: SVGFactory = js.native
  var lineGradient: SVGFactory = js.native
  var mask: SVGFactory = js.native
  var path: SVGFactory = js.native
  var pattern: SVGFactory = js.native
  var polugon: SVGFactory = js.native
  var polyline: SVGFactory = js.native
  var radialGradient: SVGFactory = js.native
  var rect: SVGFactory = js.native
  var stop: SVGFactory = js.native
  var symbol: SVGFactory = js.native
  var text: SVGFactory = js.native
  var tspan: SVGFactory = js.native
  var use: SVGFactory = js.native
  def findDOMNode(instance: Component[_, _]): Element = js.native
  def findDOMNode(instance: Element): Element = js.native

  def render[P <: DOMAttributes, T <: Element](element: DOMElement[P, T], container: Element, callback: Function1[T, Any]): T = js.native
  def render[P](element: SFCElement[P], container: Element, callback: java.util.function.Supplier[Any]): Unit = js.native
  def render[P, T <: Component[P, _]](element: ComponentElement[P, T], container: Element, callback: Function1[T, Any]): T = js.native
  def render[P <: DOMAttributes, T <: Element](element: DOMElement[P, T], container: Element): T = js.native
  // ajout par gl 
  def render[P](element: ReactElement[P], container: Element): Unit = js.native
  def render[P](element: SFCElement[P], container: Element): Unit = js.native
  def render[P, T <: Component[P, _]](element: ComponentElement[P, T], container: Element): T = js.native
  //  def render[P](element: ReactElement[P], container: Element): jsweet.util.union.Union[Component[P, _], Element]
  def render[P](parentComponent: Component[_, _], element: SFCElement[P], container: Element, callback: java.util.function.Supplier[Any]): Unit = js.native
  def render[P](parentComponent: Component[_, _], element: SFCElement[P], container: Element): Unit = js.native
  def render[P](element: ReactTypedConstructor[_, _], container: Element): Unit = js.native

  // def render[P](element: ReactElement[P], container: Element, callback: java.util.function.Supplier[Any]): jsweet.util.union.Union[Component[P, _], Element] = js.native
  //  def renderCallbackFunction[P](element: ReactElement[P], container: Element, callback: Function1[Element, Any]): jsweet.util.union.Union[Component[P, _], Element] = js.native

  //  def unstable_renderSubtreeIntoContainerCallbackFunction[P](parentComponent: Component[_, _], element: ReactElement[P], container: Element, callback: Function1[Element, Any]): jsweet.util.union.Union[Component[P, _], Element] = js.native

  //  def renderCallbackComponentPAnyFunction[P](element: ReactElement[P], container: Element, callback: Function1[Component[P, _], Any]): jsweet.util.union.Union[Component[P, _], Element] = js.native

  def unmountComponentAtNode(container: Element): Boolean = js.native
  var version: String = js.native
  def unstable_batchedUpdates[A, B](callback: Function2[A, B, Any], a: A, b: B): Unit = js.native
  def unstable_batchedUpdates[A](callback: Function1[A, Any], a: A): Unit = js.native
  def unstable_batchedUpdates(callback: java.util.function.Supplier[Any]): Unit = js.native

  def unstable_renderSubtreeIntoContainer[P <: DOMAttributes, T <: Element](parentComponent: Component[_, _], element: DOMElement[P, T], container: Element, callback: Function1[T, Any]): T = js.native
  def unstable_renderSubtreeIntoContainer[P, T <: Component[P, _]](parentComponent: Component[_, _], element: ComponentElement[P, T], container: Element, callback: Function1[T, Any]): T = js.native
  // def unstable_renderSubtreeIntoContainerCallbackComponentPAnyFunction[P](parentComponent: Component[_, _], element: ReactElement[P], container: Element, callback: Function1[Component[P, _], Any]): jsweet.util.union.Union[Component[P, _], Element] = js.native
  def unstable_renderSubtreeIntoContainer[P <: DOMAttributes, T <: Element](parentComponent: Component[_, _], domElement: DOMElement[P, T], container: Element): T = js.native
  def unstable_renderSubtreeIntoContainer[P, T <: Component[P, _]](parentComponent: Component[_, _], element: ComponentElement[P, T], container: Element): T = js.native
  // def unstable_renderSubtreeIntoContainer[P](parentComponent: Component[_, _], element: ReactElement[P], container: Element): jsweet.util.union.Union[Component[P, _], Element] = js.native
  // def unstable_renderSubtreeIntoContainer[P](parentComponent: Component[_, _], element: ReactElement[P], container: Element, callback: java.util.function.Supplier[Any]): jsweet.util.union.Union[Component[P, _], Element] = js.native

}

