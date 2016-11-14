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
import org.scalajs.dom._

// https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/react/react.d.ts

@js.native
abstract class DOMAttributes extends js.Any {
  var children: Any = js.native
  var dangerouslySetInnerHTML: DangerouslySetInnerHTML = js.native
  var onCopy: EventHandler[ClipboardEvent] = js.native
  var onCut: EventHandler[ClipboardEvent] = js.native
  var onPaste: EventHandler[ClipboardEvent] = js.native
  var onCompositionEnd: EventHandler[CompositionEvent] = js.native
  var onCompositionStart: EventHandler[CompositionEvent] = js.native
  var onCompositionUpdate: EventHandler[CompositionEvent] = js.native
  var onFocus: EventHandler[FocusEvent] = js.native
  var onBlur: EventHandler[FocusEvent] = js.native
  var onChange: EventHandler[FormEvent] = js.native
  var onInput: EventHandler[FormEvent] = js.native
  var onSubmit: EventHandler[FormEvent] = js.native
  var onLoad: EventHandler[SyntheticEvent] = js.native
  var onError: EventHandler[SyntheticEvent] = js.native
  var onKeyDown: EventHandler[KeyboardEvent] = js.native
  var onKeyPress: EventHandler[KeyboardEvent] = js.native
  var onKeyUp: EventHandler[KeyboardEvent] = js.native
  var onAbort: EventHandler[SyntheticEvent] = js.native
  var onCanPlay: EventHandler[SyntheticEvent] = js.native
  var onCanPlayThrough: EventHandler[SyntheticEvent] = js.native
  var onDurationChange: EventHandler[SyntheticEvent] = js.native
  var onEmptied: EventHandler[SyntheticEvent] = js.native
  var onEncrypted: EventHandler[SyntheticEvent] = js.native
  var onEnded: EventHandler[SyntheticEvent] = js.native
  var onLoadedData: EventHandler[SyntheticEvent] = js.native
  var onLoadedMetadata: EventHandler[SyntheticEvent] = js.native
  var onLoadStart: EventHandler[SyntheticEvent] = js.native
  var onPause: EventHandler[SyntheticEvent] = js.native
  var onPlay: EventHandler[SyntheticEvent] = js.native
  var onPlaying: EventHandler[SyntheticEvent] = js.native
  var onProgress: EventHandler[SyntheticEvent] = js.native
  var onRateChange: EventHandler[SyntheticEvent] = js.native
  var onSeeked: EventHandler[SyntheticEvent] = js.native
  var onSeeking: EventHandler[SyntheticEvent] = js.native
  var onStalled: EventHandler[SyntheticEvent] = js.native
  var onSuspend: EventHandler[SyntheticEvent] = js.native
  var onTimeUpdate: EventHandler[SyntheticEvent] = js.native
  var onVolumeChange: EventHandler[SyntheticEvent] = js.native
  var onWaiting: EventHandler[SyntheticEvent] = js.native
  var onClick: EventHandler[MouseEvent] = js.native
  var onContextMenu: EventHandler[MouseEvent] = js.native
  var onDoubleClick: EventHandler[MouseEvent] = js.native
  var onDrag: EventHandler[DragEvent] = js.native
  var onDragEnd: EventHandler[DragEvent] = js.native
  var onDragEnter: EventHandler[DragEvent] = js.native
  var onDragExit: EventHandler[DragEvent] = js.native
  var onDragLeave: EventHandler[DragEvent] = js.native
  var onDragOver: EventHandler[DragEvent] = js.native
  var onDragStart: EventHandler[DragEvent] = js.native
  var onDrop: EventHandler[DragEvent] = js.native
  var onMouseDown: EventHandler[MouseEvent] = js.native
  var onMouseEnter: EventHandler[MouseEvent] = js.native
  var onMouseLeave: EventHandler[MouseEvent] = js.native
  var onMouseMove: EventHandler[MouseEvent] = js.native
  var onMouseOut: EventHandler[MouseEvent] = js.native
  var onMouseOver: EventHandler[MouseEvent] = js.native
  var onMouseUp: EventHandler[MouseEvent] = js.native
  var onSelect: EventHandler[SyntheticEvent] = js.native
  var onTouchCancel: EventHandler[TouchEvent] = js.native
  var onTouchEnd: EventHandler[TouchEvent] = js.native
  var onTouchMove: EventHandler[TouchEvent] = js.native
  var onTouchStart: EventHandler[TouchEvent] = js.native
  var onScroll: EventHandler[UIEvent] = js.native
  var onWheel: EventHandler[WheelEvent] = js.native
  var onAnimationStart: EventHandler[AnimationEvent] = js.native
  var onAnimationEnd: EventHandler[AnimationEvent] = js.native
  var onAnimationIteration: EventHandler[AnimationEvent] = js.native
  var onTransitionEnd: EventHandler[TransitionEvent] = js.native

  def onCopy(event: ClipboardEvent) = js.native
  def onCut(event: ClipboardEvent) = js.native
  def onPaste(event: ClipboardEvent) = js.native
  def onCompositionEnd(event: CompositionEvent) = js.native
  def onCompositionStart(event: CompositionEvent) = js.native
  def onCompositionUpdate(event: CompositionEvent) = js.native
  def onFocus(event: FocusEvent) = js.native
  def onBlur(event: FocusEvent) = js.native
  def onChange(event: FormEvent) = js.native
  def onInput(event: FormEvent) = js.native
  def onSubmit(event: FormEvent) = js.native
  def onLoad(event: SyntheticEvent) = js.native
  def onError(event: SyntheticEvent) = js.native
  def onKeyDown(event: KeyboardEvent) = js.native
  def onKeyPress(event: KeyboardEvent) = js.native
  def onKeyUp(event: KeyboardEvent) = js.native
  def onAbort(event: SyntheticEvent) = js.native
  def onCanPlay(event: SyntheticEvent) = js.native
  def onCanPlayThrough(event: SyntheticEvent) = js.native
  def onDurationChange(event: SyntheticEvent) = js.native
  def onEmptied(event: SyntheticEvent) = js.native
  def onEncrypted(event: SyntheticEvent) = js.native
  def onEnded(event: SyntheticEvent) = js.native
  def onLoadedData(event: SyntheticEvent) = js.native
  def onLoadedMetadata(event: SyntheticEvent) = js.native
  def onLoadStart(event: SyntheticEvent) = js.native
  def onPause(event: SyntheticEvent) = js.native
  def onPlay(event: SyntheticEvent) = js.native
  def onPlaying(event: SyntheticEvent) = js.native
  def onProgress(event: SyntheticEvent) = js.native
  def onRateChange(event: SyntheticEvent) = js.native
  def onSeeked(event: SyntheticEvent) = js.native
  def onSeeking(event: SyntheticEvent) = js.native
  def onStalled(event: SyntheticEvent) = js.native
  def onSuspend(event: SyntheticEvent) = js.native
  def onTimeUpdate(event: SyntheticEvent) = js.native
  def onVolumeChange(event: SyntheticEvent) = js.native
  def onWaiting(event: SyntheticEvent) = js.native
  def onClick(event: MouseEvent) = js.native
  def onContextMenu(event: MouseEvent) = js.native
  def onDoubleClick(event: MouseEvent) = js.native
  def onDrag(event: DragEvent) = js.native
  def onDragEnd(event: DragEvent) = js.native
  def onDragEnter(event: DragEvent) = js.native
  def onDragExit(event: DragEvent) = js.native
  def onDragLeave(event: DragEvent) = js.native
  def onDragOver(event: DragEvent) = js.native
  def onDragStart(event: DragEvent) = js.native
  def onDrop(event: DragEvent) = js.native
  def onMouseDown(event: MouseEvent) = js.native
  def onMouseEnter(event: MouseEvent) = js.native
  def onMouseLeave(event: MouseEvent) = js.native
  def onMouseMove(event: MouseEvent) = js.native
  def onMouseOut(event: MouseEvent) = js.native
  def onMouseOver(event: MouseEvent) = js.native
  def onMouseUp(event: MouseEvent) = js.native
  def onSelect(event: SyntheticEvent) = js.native
  def onTouchCancel(event: TouchEvent) = js.native
  def onTouchEnd(event: TouchEvent) = js.native
  def onTouchMove(event: TouchEvent) = js.native
  def onTouchStart(event: TouchEvent) = js.native
  def onScroll(event: UIEvent) = js.native
  def onWheel(event: WheelEvent) = js.native
  def onAnimationStart(event: AnimationEvent) = js.native
  def onAnimationEnd(event: AnimationEvent) = js.native
  def onAnimationIteration(event: AnimationEvent) = js.native
  def onTransitionEnd(event: TransitionEvent) = js.native
}
/** This is an automatically generated Any type (see the source definition). */

class DangerouslySetInnerHTML {
  val __html: String = null
}