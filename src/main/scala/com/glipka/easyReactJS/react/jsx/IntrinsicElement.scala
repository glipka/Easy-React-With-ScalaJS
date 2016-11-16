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

package com.glipka.easyReactJS.react.jsx
 import scala.scalajs.js
import scala.scalajs.js._
import org.scalajs.dom.html
import com.glipka.easyReactJS.react._
import js.{ UndefOr, Any, Function => JFn }
import js.annotation.{ JSBracketAccess, JSName }
import js.{ Any => jAny }
import org.scalajs.dom._
import org.scalajs.dom.raw.HTMLTableDataCellElement
import org.scalajs.dom.raw.HTMLAudioElement
import org.scalajs.dom.raw.HTMLTableHeaderCellElement
import org.scalajs.dom.raw.HTMLEmbedElement
import org.scalajs.dom.raw.HTMLSpanElement
import org.scalajs.dom.raw.HTMLSourceElement
import org.scalajs.dom.raw.HTMLTrackElement
import org.scalajs.dom.raw.HTMLDataListElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.HTMLProgressElement
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLMapElement
import org.scalajs.dom.raw.HTMLMetaElement
import org.scalajs.dom.raw.HTMLLabelElement
import org.scalajs.dom.raw.HTMLUListElement
import org.scalajs.dom.raw.HTMLParamElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLTableSectionElement
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLOptionElement
import org.scalajs.dom.raw.HTMLHeadingElement
import org.scalajs.dom.raw.HTMLStyleElement
import org.scalajs.dom.raw.HTMLDListElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLTableColElement
import org.scalajs.dom.raw.HTMLHtmlElement
import org.scalajs.dom.raw.HTMLBaseElement
import org.scalajs.dom.raw.HTMLLegendElement
import org.scalajs.dom.raw.HTMLPreElement
import org.scalajs.dom.raw.HTMLTitleElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLLinkElement
import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.HTMLOListElement
import org.scalajs.dom.raw.HTMLAreaElement
import org.scalajs.dom.raw.HTMLTableRowElement
import org.scalajs.dom.raw.HTMLHeadElement
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLOptGroupElement
import org.scalajs.dom.raw.HTMLIFrameElement
import org.scalajs.dom.raw.HTMLBRElement
import org.scalajs.dom.raw.HTMLParagraphElement
import org.scalajs.dom.raw.HTMLSelectElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLLIElement
import org.scalajs.dom.raw.HTMLModElement
import org.scalajs.dom.raw.HTMLTableElement
import org.scalajs.dom.raw.HTMLFieldSetElement
import org.scalajs.dom.raw.HTMLHRElement
import org.scalajs.dom.raw.HTMLBodyElement
import org.scalajs.dom.raw.HTMLQuoteElement
import org.scalajs.dom.raw.HTMLObjectElement
import com.glipka.easyReactJS.react._
// https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/react/react.d.ts

 @js.native
abstract class IntrinsicElement extends js.Any {
  var a: HTMLProps[HTMLAnchorElement] = js.native;
    var abbr: HTMLProps[HTMLElement] = js.native;
    var address: HTMLProps[HTMLElement] = js.native;
    var area: HTMLProps[HTMLAreaElement] = js.native;
    var article: HTMLProps[HTMLElement] = js.native;
    var aside: HTMLProps[HTMLElement] = js.native;
    var audio: HTMLProps[HTMLAudioElement] = js.native;
    var b: HTMLProps[HTMLElement] = js.native;
    var base: HTMLProps[HTMLBaseElement] = js.native;
    var bdi: HTMLProps[HTMLElement] = js.native;
    var bdo: HTMLProps[HTMLElement] = js.native;
    var big: HTMLProps[HTMLElement] = js.native;
    var blockquote: HTMLProps[HTMLElement] = js.native;
    var body: HTMLProps[HTMLBodyElement] = js.native;
    var br: HTMLProps[HTMLBRElement] = js.native;
    var button: HTMLProps[HTMLButtonElement] = js.native;
    var canvas: HTMLProps[HTMLCanvasElement] = js.native;
    var caption: HTMLProps[HTMLElement] = js.native;
    var cite: HTMLProps[HTMLElement] = js.native;
    var code: HTMLProps[HTMLElement] = js.native;
    var col: HTMLProps[HTMLTableColElement] = js.native;
    var colgroup: HTMLProps[HTMLTableColElement] = js.native;
    var data: HTMLProps[HTMLElement] = js.native;
    var datalist: HTMLProps[HTMLDataListElement] = js.native;
    var dd: HTMLProps[HTMLElement] = js.native;
    var del: HTMLProps[HTMLElement] = js.native;
    var details: HTMLProps[HTMLElement] = js.native;
    var dfn: HTMLProps[HTMLElement] = js.native;
    var dialog: HTMLProps[HTMLElement] = js.native;
    var div: HTMLProps[HTMLDivElement] = js.native;
    var dl: HTMLProps[HTMLDListElement] = js.native;
    var dt: HTMLProps[HTMLElement] = js.native;
    var em: HTMLProps[HTMLElement] = js.native;
    var embed: HTMLProps[HTMLEmbedElement] = js.native;
    var fieldset: HTMLProps[HTMLFieldSetElement] = js.native;
    var figcaption: HTMLProps[HTMLElement] = js.native;
    var figure: HTMLProps[HTMLElement] = js.native;
    var footer: HTMLProps[HTMLElement] = js.native;
    var form: HTMLProps[HTMLFormElement] = js.native;
    var h1: HTMLProps[HTMLHeadingElement] = js.native;
    var h2: HTMLProps[HTMLHeadingElement] = js.native;
    var h3: HTMLProps[HTMLHeadingElement] = js.native;
    var h4: HTMLProps[HTMLHeadingElement] = js.native;
    var h5: HTMLProps[HTMLHeadingElement] = js.native;
    var h6: HTMLProps[HTMLHeadingElement] = js.native;
    var head: HTMLProps[HTMLHeadElement] = js.native;
    var header: HTMLProps[HTMLElement] = js.native;
    var hgroup: HTMLProps[HTMLElement] = js.native;
    var hr: HTMLProps[HTMLHRElement] = js.native;
    var html: HTMLProps[HTMLHtmlElement] = js.native;
    var i: HTMLProps[HTMLElement] = js.native;
    var iframe: HTMLProps[HTMLIFrameElement] = js.native;
    var img: HTMLProps[HTMLImageElement] = js.native;
    var input: HTMLProps[HTMLInputElement] = js.native;
    var ins: HTMLProps[HTMLModElement] = js.native;
    var kbd: HTMLProps[HTMLElement] = js.native;
    var keygen: HTMLProps[HTMLElement] = js.native;
    var label: HTMLProps[HTMLLabelElement] = js.native;
    var legend: HTMLProps[HTMLLegendElement] = js.native;
    var li: HTMLProps[HTMLLIElement] = js.native;
    var link: HTMLProps[HTMLLinkElement] = js.native;
    var main: HTMLProps[HTMLElement] = js.native;
    var map: HTMLProps[HTMLMapElement] = js.native;
    var mark: HTMLProps[HTMLElement] = js.native;
    var menu: HTMLProps[HTMLElement] = js.native;
    var menuitem: HTMLProps[HTMLElement] = js.native;
    var meta: HTMLProps[HTMLMetaElement] = js.native;
    var meter: HTMLProps[HTMLElement] = js.native;
    var nav: HTMLProps[HTMLElement] = js.native;
    var noscript: HTMLProps[HTMLElement] = js.native;
    var `Object`: HTMLProps[HTMLObjectElement] = js.native;
    var ol: HTMLProps[HTMLOListElement] = js.native;
    var optgroup: HTMLProps[HTMLOptGroupElement] = js.native;
    var option: HTMLProps[HTMLOptionElement] = js.native;
    var output: HTMLProps[HTMLElement] = js.native;
    var p: HTMLProps[HTMLParagraphElement] = js.native;
    var param: HTMLProps[HTMLParamElement] = js.native;
    var picture: HTMLProps[HTMLElement] = js.native;
    var pre: HTMLProps[HTMLPreElement] = js.native;
    var progress: HTMLProps[HTMLProgressElement] = js.native;
    var q: HTMLProps[HTMLQuoteElement] = js.native;
    var rp: HTMLProps[HTMLElement] = js.native;
    var rt: HTMLProps[HTMLElement] = js.native;
    var ruby: HTMLProps[HTMLElement] = js.native;
    var s: HTMLProps[HTMLElement] = js.native;
    var samp: HTMLProps[HTMLElement] = js.native;
    var script: HTMLProps[HTMLElement] = js.native;
    var section: HTMLProps[HTMLElement] = js.native;
    var select: HTMLProps[HTMLSelectElement] = js.native;
    var small: HTMLProps[HTMLElement] = js.native;
    var source: HTMLProps[HTMLSourceElement] = js.native;
    var span: HTMLProps[HTMLSpanElement] = js.native;
    var strong: HTMLProps[HTMLElement] = js.native;
    var style: HTMLProps[HTMLStyleElement] = js.native;
    var sub: HTMLProps[HTMLElement] = js.native;
    var summary: HTMLProps[HTMLElement] = js.native;
    var sup: HTMLProps[HTMLElement] = js.native;
    var table: HTMLProps[HTMLTableElement] = js.native;
    var tbody: HTMLProps[HTMLTableSectionElement] = js.native;
    var td: HTMLProps[HTMLTableDataCellElement] = js.native;
    var textarea: HTMLProps[HTMLTextAreaElement] = js.native;
    var tfoot: HTMLProps[HTMLTableSectionElement] = js.native;
    var th: HTMLProps[HTMLTableHeaderCellElement] = js.native;
    var thead: HTMLProps[HTMLTableSectionElement] = js.native;
    var time: HTMLProps[HTMLElement] = js.native;
    var title: HTMLProps[HTMLTitleElement] = js.native;
    var tr: HTMLProps[HTMLTableRowElement] = js.native;
    var track: HTMLProps[HTMLTrackElement] = js.native;
    var u: HTMLProps[HTMLElement] = js.native;
    var ul: HTMLProps[HTMLUListElement] = js.native;
    var `var`: HTMLProps[HTMLElement] = js.native;
    var video: HTMLProps[HTMLVideoElement] = js.native;
    var wbr: HTMLProps[HTMLElement] = js.native;

    // SVG
    var svg: SVGProps = js.native;

    var circle: SVGProps = js.native;
    var clipPath: SVGProps = js.native;
    var defs: SVGProps = js.native;
    var ellipse: SVGProps = js.native;
    var foreignAny: SVGProps = js.native;
    var g: SVGProps = js.native;
    var image: SVGProps = js.native;
    var line: SVGProps = js.native;
    var linearGradient: SVGProps = js.native;
    var mask: SVGProps = js.native;
    var path: SVGProps = js.native;
    var pattern: SVGProps = js.native;
    var polygon: SVGProps = js.native;
    var polyline: SVGProps = js.native;
    var radialGradient: SVGProps = js.native;
    var rect: SVGProps = js.native;
    var stop: SVGProps = js.native;
    var symbol: SVGProps = js.native;
    var text: SVGProps = js.native;
    var tspan: SVGProps = js.native;
    var use: SVGProps = js.native;

}