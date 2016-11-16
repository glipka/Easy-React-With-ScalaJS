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
 
package com.glipka.easyReactJS.react

import scala.scalajs.js
import org.scalajs.{ dom => scalaJsDom }
import js.{ Dynamic, UndefOr, Any => JAny }
import com.glipka.easyReactJS.react._
import org.scalajs.dom._

// This interface is not complete. Only properties accepting
// unitless Ints are listed here (see CSSProperty.js in React)
@js.native
trait CSSProperties extends JAny {

  /**
   * Aligns a flex container's lines within the flex container when there is extra space in the cross-axis, similar to how justify-content aligns individual items within the main-axis.
   */
  var alignContent: UndefOr[js.Any] = js.native;

  /**
   * Sets the default alignment in the cross axis for all of the flex container's items, including anonymous flex items, similarly to how justify-content aligns items along the main axis.
   */
  var alignItems: UndefOr[js.Any] = js.native;

  /**
   * Allows the default alignment to be overridden for individual flex items.
   */
  var alignSelf: UndefOr[js.Any] = js.native;

  /**
   * This property allows precise alignment of elements, such as graphics, that do not have a baseline-table or lack the desired baseline in their baseline-table. With the alignment-adjust property, the position of the baseline identified by the alignment-baseline can be explicitly determined. It also determines precisely the alignment point for each glyph within a textual element.
   */
  var alignmentAdjust: UndefOr[js.Any] = js.native;

  var alignmentBaseline: UndefOr[js.Any] = js.native;

  /**
   * Defines a length of time to elapse before an animation starts, allowing an animation to begin execution some time after it is applied.
   */
  var animationDelay: UndefOr[js.Any] = js.native;

  /**
   * Defines whether an animation should run in reverse on some or all cycles.
   */
  var animationDirection: UndefOr[js.Any] = js.native;

  /**
   * Specifies how mjs.Any times an animation cycle should play.
   */
  var animationIterationCount: UndefOr[js.Any] = js.native;

  /**
   * Defines the list of animations that apply to the element.
   */
  var animationName: UndefOr[js.Any] = js.native;

  /**
   * Defines whether an animation is running or paused.
   */
  var animationPlayState: UndefOr[js.Any] = js.native;

  /**
   * Allows changing the style of js.Any element to platform-based interface elements or vice versa.
   */
  var appearance: UndefOr[js.Any] = js.native;

  /**
   * Determines whether or not the  back  side of a transformed element is visible when facing the viewer.
   */
  var backfaceVisibility: UndefOr[js.Any] = js.native;

  /**
   * Shorthand property to set the values for one or more of:
   * background-clip, background-color, background-image,
   * background-origin, background-position, background-repeat,
   * background-size, and background-attachment.
   */
  var background: UndefOr[js.Any] = js.native;

  /**
   * If a background-image is specified, this property determines
   * whether that image's position is fixed within the viewport,
   * or scrolls along with its containing block.
   * "scroll" | "fixed" | "local" par String
   */
  var backgroundAttachment: UndefOr[String] = js.native;

  /**
   * This property describes how the element's background images should blend with each other and the element's background color.
   * The value is a list of blend modes that corresponds to each background image. Each element in the list will apply to the corresponding element of background-image. If a property doesnÃƒÆ’Ã‚Â¯Ãƒâ€šÃ‚Â¿Ãƒâ€šÃ‚Â½t have enough comma-separated values to match the Int of layers, the UA must calculate its used value by repeating the list of values until there are enough.
   */
  var backgroundBlendMode: UndefOr[js.Any] = js.native;

  /**
   * Sets the background color of an element.
   */
  var backgroundColor: UndefOr[js.Any] = js.native;

  var backgroundComposite: UndefOr[js.Any] = js.native;

  /**
   * Applies one or more background images to an element. These can be js.Any valid CSS image, including url() paths to image files or CSS gradients.
   */
  var backgroundImage: UndefOr[js.Any] = js.native;

  /**
   * Specifies what the background-position property is relative to.
   */
  var backgroundOrigin: UndefOr[js.Any] = js.native;

  /**
   * Sets the position of a background image.
   */
  var backgroundPosition: UndefOr[js.Any] = js.native;

  /**
   * Background-repeat defines if and how background images will be repeated after they have been sized and positioned
   */
  var backgroundRepeat: UndefOr[js.Any] = js.native;

  /**
   * Obsolete - spec retired, not implemented.
   */
  var baselineShift: UndefOr[js.Any] = js.native;

  /**
   * Non standard. Sets or retrieves the location of the Dynamic HTML (DHTML) behavior.
   */
  var behavior: UndefOr[js.Any] = js.native;

  /**
   * Shorthand property that defines the different properties of all four sides of an element's border in a single declaration. It can be used to set border-width, border-style and border-color, or a subset of these.
   */
  var border: UndefOr[js.Any] = js.native;

  /**
   * Shorthand that sets the values of border-bottom-color,
   * border-bottom-style, and border-bottom-width.
   */
  var borderBottom: UndefOr[js.Any] = js.native;

  /**
   * Sets the color of the bottom border of an element.
   */
  var borderBottomColor: UndefOr[js.Any] = js.native;

  /**
   * Defines the shape of the border of the bottom-left corner.
   */
  var borderBottomLeftRadius: UndefOr[js.Any] = js.native;

  /**
   * Defines the shape of the border of the bottom-right corner.
   */
  var borderBottomRightRadius: UndefOr[js.Any] = js.native;

  /**
   * Sets the line style of the bottom border of a box.
   */
  var borderBottomStyle: UndefOr[js.Any] = js.native;

  /**
   * Sets the width of an element's bottom border. To set all four borders, use the border-width shorthand property which sets the values simultaneously for border-top-width, border-right-width, border-bottom-width, and border-left-width.
   */
  var borderBottomWidth: UndefOr[js.Any] = js.native;

  /**
   * Border-collapse can be used for collapsing the borders between table cells
   */
  var borderCollapse: UndefOr[js.Any] = js.native;

  /**
   * The CSS border-color property sets the color of an element's four borders. This property can have from one to four values, made up of the elementary properties:            var border-top-color
   *            var border-right-color
   *             var border-bottom-color
   *              var border-left-color The default color is the currentColor of each of these values.
   * If you provide one value, it sets the color for the element. Two values set the horizontal and vertical values, respectively. Providing three values sets the top, vertical, and bottom values, in that order. Four values set all for sides: top, right, bottom, and left, in that order.
   */
  var borderColor: UndefOr[js.Any] = js.native;

  /**
   * Specifies different corner clipping effects, such as scoop (inner curves), bevel (straight cuts) or notch (cut-off rectangles). Works along with border-radius to specify the size of each corner effect.
   */
  var borderCornerShape: UndefOr[js.Any] = js.native;

  /**
   * The property border-image-source is used to set the image to be used instead of the border style. If this is set to none the border-style is used instead.
   */
  var borderImageSource: UndefOr[js.Any] = js.native;

  /**
   * The border-image-width CSS property defines the offset to use for dividing the border image in nine parts, the top-left corner, central top edge, top-right-corner, central right edge, bottom-right corner, central bottom edge, bottom-left corner, and central right edge. They represent inward distance from the top, right, bottom, and left edges.
   */
  var borderImageWidth: UndefOr[js.Any] = js.native;

  /**
   * Shorthand property that defines the border-width, border-style and border-color of an element's left border in a single declaration. Note that you can use the corresponding longhand properties to set specific individual properties of the left border ÃƒÆ’Ã‚Â¯Ãƒâ€šÃ‚Â¿Ãƒâ€šÃ‚Â½ border-left-width, border-left-style and border-left-color.
   */
  var borderLeft: UndefOr[js.Any] = js.native;

  /**
   * The CSS border-left-color property sets the color of an element's left border. This page explains the border-left-color value, but often you will find it more convenient to fix the border's left color as part of a shorthand set, either border-left or border-color.
   * Colors can be defined several ways. For more information, see Usage.
   */
  var borderLeftColor: UndefOr[js.Any] = js.native;

  /**
   * Sets the style of an element's left border. To set all four borders, use the shorthand property, border-style. Otherwise, you can set the borders individually with border-top-style, border-right-style, border-bottom-style, border-left-style.
   */
  var borderLeftStyle: UndefOr[js.Any] = js.native;

  /**
   * Sets the width of an element's left border. To set all four borders, use the border-width shorthand property which sets the values simultaneously for border-top-width, border-right-width, border-bottom-width, and border-left-width.
   */
  var borderLeftWidth: UndefOr[js.Any] = js.native;

  /**
   * Shorthand property that defines the border-width, border-style and border-color of an element's right border in a single declaration. Note that you can use the corresponding longhand properties to set specific individual properties of the right border ÃƒÆ’Ã‚Â¯Ãƒâ€šÃ‚Â¿Ãƒâ€šÃ‚Â½ border-right-width, border-right-style and border-right-color.
   */
  var borderRight: UndefOr[js.Any] = js.native;

  /**
   * Sets the color of an element's right border. This page explains the border-right-color value, but often you will find it more convenient to fix the border's right color as part of a shorthand set, either border-right or border-color.
   * Colors can be defined several ways. For more information, see Usage.
   */
  var borderRightColor: UndefOr[js.Any] = js.native;

  /**
   * Sets the style of an element's right border. To set all four borders, use the shorthand property, border-style. Otherwise, you can set the borders individually with border-top-style, border-right-style, border-bottom-style, border-left-style.
   */
  var borderRightStyle: UndefOr[js.Any] = js.native;

  /**
   * Sets the width of an element's right border. To set all four borders, use the border-width shorthand property which sets the values simultaneously for border-top-width, border-right-width, border-bottom-width, and border-left-width.
   */
  var borderRightWidth: UndefOr[js.Any] = js.native;

  /**
   * Specifies the distance between the borders of adjacent cells.
   */
  var borderSpacing: UndefOr[js.Any] = js.native;

  /**
   * Sets the style of an element's four borders. This property can have from one to four values. With only one value, the value will be applied to all four borders] = js.native; otherwise, this works as a shorthand property for each of border-top-style, border-right-style, border-bottom-style, border-left-style, where each border style may be assigned a separate value.
   */
  var borderStyle: UndefOr[js.Any] = js.native;

  /**
   * Shorthand property that defines the border-width, border-style and border-color of an element's top border in a single declaration. Note that you can use the corresponding longhand properties to set specific individual properties of the top border ÃƒÆ’Ã‚Â¯Ãƒâ€šÃ‚Â¿Ãƒâ€šÃ‚Â½ border-top-width, border-top-style and border-top-color.
   */
  var borderTop: UndefOr[js.Any] = js.native;

  /**
   * Sets the color of an element's top border. This page explains the border-top-color value, but often you will find it more convenient to fix the border's top color as part of a shorthand set, either border-top or border-color.
   * Colors can be defined several ways. For more information, see Usage.
   */
  var borderTopColor: UndefOr[js.Any] = js.native;

  /**
   * Sets the rounding of the top-left corner of the element.
   */
  var borderTopLeftRadius: UndefOr[js.Any] = js.native;

  /**
   * Sets the rounding of the top-right corner of the element.
   */
  var borderTopRightRadius: UndefOr[js.Any] = js.native;

  /**
   * Sets the style of an element's top border. To set all four borders, use the shorthand property, border-style. Otherwise, you can set the borders individually with border-top-style, border-right-style, border-bottom-style, border-left-style.
   */
  var borderTopStyle: UndefOr[js.Any] = js.native;

  /**
   * Sets the width of an element's top border. To set all four borders, use the border-width shorthand property which sets the values simultaneously for border-top-width, border-right-width, border-bottom-width, and border-left-width.
   */
  var borderTopWidth: UndefOr[js.Any] = js.native;

  /**
   * Sets the width of an element's four borders. This property can have from one to four values. This is a shorthand property for setting values simultaneously for border-top-width, border-right-width, border-bottom-width, and border-left-width.
   */
  var borderWidth: UndefOr[js.Any] = js.native;

  /**
   * This property specifies how far an absolutely positioned box's bottom margin edge is offset above the bottom edge of the box's containing block. For relatively positioned boxes, the offset is with respect to the bottom edges of the box itself (i.e., the box is given a position in the normal flow, then offset from that position according to these properties).
   */
  var bottom: UndefOr[js.Any] = js.native;

  /**
   * Obsolete.
   */
  var boxAlign: UndefOr[js.Any] = js.native;

  /**
   * Breaks a box into fragments creating new borders, padding and repeating backgrounds or lets it stay as a continuous box on a page break, column break, or, for inline elements, at a line break.
   */
  var boxDecorationBreak: UndefOr[js.Any] = js.native;

  /**
   * Deprecated
   */
  var boxDirection: UndefOr[js.Any] = js.native;

  /**
   * Do not use. This property has been replaced by the flex-wrap property.
   * Gets or sets a value that specifies the direction to add successive rows or columns when the value of box-lines is set to multiple.
   */
  var boxLineProgression: UndefOr[js.Any] = js.native;

  /**
   * Do not use. This property has been replaced by the flex-wrap property.
   * Gets or sets a value that specifies whether child elements wrap onto multiple lines or columns based on the space available in the Any.
   */
  var boxLines: UndefOr[js.Any] = js.native;

  /**
   * Do not use. This property has been replaced by flex-order.
   * Specifies the ordinal group that a child element of the Any belongs to. This ordinal value identifies the display order (along the axis defined by the box-orient property) for the group.
   */
  var boxOrdinalGroup: UndefOr[js.Any] = js.native;

  /**
   * Deprecated.
   */
  var boxFlex: UndefOr[Int] = js.native;

  /**
   * Deprecated.
   */
  var boxFlexGroup: UndefOr[Int] = js.native;

  /**
   * The CSS break-after property allows you to force a break on multi-column layouts. More specifically, it allows you to force a break after an element. It allows you to determine if a break should occur, and what type of break it should be. The break-after CSS property describes how the page, column or region break behaves after the generated box. If there is no generated box, the property is ignored.
   */
  var breakAfter: UndefOr[js.Any] = js.native;

  /**
   * Control page/column/region breaks that fall above a block of content
   */
  var breakBefore: UndefOr[js.Any] = js.native;

  /**
   * Control page/column/region breaks that fall within a block of content
   */
  var breakInside: UndefOr[js.Any] = js.native;

  /**
   * The clear CSS property specifies if an element can be positioned next to or must be positioned below the floating elements that precede it in the markup.
   */
  var clear: UndefOr[js.Any] = js.native;

  /**
   * Deprecated] = js.native; see clip-path.
   * Lets you specify the dimensions of an absolutely positioned element that should be visible, and the element is clipped into this shape, and displayed.
   */
  var clip: UndefOr[js.Any] = js.native;

  /**
   * Clipping crops an graphic, so that only a portion of the graphic is rendered, or filled. This clip-rule property, when used with the clip-path property, defines which clip rule, or algorithm, to use when filling the different parts of a graphics.
   */
  var clipRule: UndefOr[js.Any] = js.native;

  /**
   * The color property sets the color of an element's foreground content (usually text), accepting js.Any standard CSS color from keywords and hex values to RGB(a) and HSL(a).
   */
  var color: UndefOr[js.Any] = js.native;

  /**
   * Describes the Int of columns of the element.
   */
  var columnCount: UndefOr[Int] = js.native;

  /**
   * Specifies how to fill columns (balanced or sequential).
   */
  var columnFill: UndefOr[js.Any] = js.native;

  /**
   * The column-gap property controls the width of the gap between columns in multi-column elements.
   */
  var columnGap: UndefOr[js.Any] = js.native;

  /**
   * Sets the width, style, and color of the rule between columns.
   */
  var columnRule: UndefOr[js.Any] = js.native;

  /**
   * Specifies the color of the rule between columns.
   */
  var columnRuleColor: UndefOr[js.Any] = js.native;

  /**
   * Specifies the width of the rule between columns.
   */
  var columnRuleWidth: UndefOr[js.Any] = js.native;

  /**
   * The column-span CSS property makes it possible for an element to span across all columns when its value is set to all. An element that spans more than one column is called a spanning element.
   */
  var columnSpan: UndefOr[js.Any] = js.native;

  /**
   * Specifies the width of columns in multi-column elements.
   */
  var columnWidth: UndefOr[js.Any] = js.native;

  /**
   * This property is a shorthand property for setting column-width and/or column-count.
   */
  var columns: UndefOr[js.Any] = js.native;

  /**
   * The counter-increment property accepts one or more names of counters (identifiers), each one optionally followed by an integer which specifies the value by which the counter should be incremented (e.g. if the value is 2, the counter increases by 2 each time it is invoked).
   */
  var counterIncrement: UndefOr[js.Any] = js.native;

  /**
   * The counter-reset property contains a list of one or more names of counters, each one optionally followed by an integer (otherwise, the integer defaults to 0.) Each time the given element is invoked, the counters specified by the property are set to the given integer.
   */
  var counterReset: UndefOr[js.Any] = js.native;

  /**
   * The cue property specifies sound files (known as an "auditory icon") to be played by speech media agents before and after presenting an element's content] = js.native; if only one file is specified, it is played both before and after. The volume at which the file(s) should be played, relative to the volume of the main element, may also be specified. The icon files may also be set separately with the cue-before and cue-after properties.
   */
  var cue: UndefOr[js.Any] = js.native;

  /**
   * The cue-after property specifies a sound file (known as an "auditory icon") to be played by speech media agents after presenting an element's content] = js.native; the volume at which the file should be played may also be specified. The shorthand property cue sets cue sounds for both before and after the element is presented.
   */
  var cueAfter: UndefOr[js.Any] = js.native;

  /**
   * Specifies the mouse cursor displayed when the mouse pointer is over an element.
   */
  var cursor: UndefOr[js.Any] = js.native;

  /**
   * The direction CSS property specifies the text direction/writing direction. The rtl is used for Hebrew or Arabic text, the ltr is for other languages.
   */
  var direction: UndefOr[js.Any] = js.native;

  /**
   * This property specifies the type of rendering box used for an element. It is a shorthand property for mjs.Any other display properties.
   */
  var display: UndefOr[js.Any] = js.native;

  /**
   * The  fill property paints the interior of the given graphical element. The area to be painted consists of js.Any areas inside the outline of the shape. To determine the inside of the shape, all subpaths are considered, and the interior is determined according to the rules associated with the current value of the ÃƒÆ’Ã‚Â¯Ãƒâ€šÃ‚Â¿Ãƒâ€šÃ‚Â½fill-ruleÃƒÆ’Ã‚Â¯Ãƒâ€šÃ‚Â¿Ãƒâ€šÃ‚Â½ property. The zero-width geometric outline of a shape is included in the area to be painted.
   */
  var fill: UndefOr[js.Any] = js.native;

  /**
   * SVG: Specifies the opacity of the color or the content the current Any is filled with.
   */
  var fillOpacity: UndefOr[Int] = js.native;

  /**
   * The  fill-rule  property indicates the algorithm which is to be used to determine what parts of the canvas are included inside the shape. For a simple, non-intersecting path, it is intuitively clear what region lies "inside"] = js.native; however, for a more complex path, such as a path that intersects itself or where one subpath encloses another, the interpretation of "inside" is not so obvious.
   * The  fill-rule  property provides two options for how the inside of a shape is determined:
   */
  var fillRule: UndefOr[js.Any] = js.native;

  /**
   * Applies various image processing effects. This property is largely unsupported. See Compatibility section for more information.
   */
  var filter: UndefOr[js.Any] = js.native;

  /**
   * Shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`.
   */
  var flex: UndefOr[String] = js.native;

  /**
   * Obsolete, do not use. This property has been renamed to align-items.
   * Specifies the alignment (perpendicular to the layout axis defined by the flex-direction property) of child elements of the Any.
   */
  var flexAlign: UndefOr[js.Any] = js.native;

  /**
   * The flex-basis CSS property describes the initial main size of the flex item before js.Any free space is distributed according to the flex factors described in the flex property (flex-grow and flex-shrink).
   */
  var flexBasis: UndefOr[js.Any] = js.native;

  /**
   * The flex-direction CSS property describes how flex items are placed in the flex container, by setting the direction of the flex container's main axis.
   */
  var flexDirection: UndefOr[js.Any] = js.native;

  /**
   * The flex-flow CSS property defines the flex container's main and cross axis. It is a shorthand property for the flex-direction and flex-wrap properties.
   */
  var flexFlow: UndefOr[js.Any] = js.native;

  /**
   * Specifies the flex grow factor of a flex item.
   */
  var flexGrow: UndefOr[Int] = js.native;

  /**
   * Do not use. This property has been renamed to align-self
   * Specifies the alignment (perpendicular to the layout axis defined by flex-direction) of child elements of the Any.
   */
  var flexItemAlign: UndefOr[js.Any] = js.native;

  /**
   * Do not use. This property has been renamed to align-content.
   * Specifies how a flexbox's lines align within the flexbox when there is extra space along the axis that is perpendicular to the axis defined by the flex-direction property.
   */
  var flexLinePack: UndefOr[js.Any] = js.native;

  /**
   * Gets or sets a value that specifies the ordinal group that a flexbox element belongs to. This ordinal value identifies the display order for the group.
   */
  var flexOrder: UndefOr[js.Any] = js.native;

  /**
   * Specifies the flex shrink factor of a flex item.
   */
  var flexShrink: UndefOr[Int] = js.native;

  /**
   * Elements which have the style float are floated horizontally. These elements can move as far to the left or right of the containing element. All elements after the floating element will flow around it, but elements before the floating element are not impacted. If several floating elements are placed after each other, they will float next to each other as long as there is room.
   */
  var float: UndefOr[js.Any] = js.native;

  /**
   * Flows content from a named flow (specified by a corresponding flow-into) through selected elements to form a dynamic chain of layout regions.
   */
  var flowFrom: UndefOr[js.Any] = js.native;

  /**
   * The font property is shorthand that allows you to do one of two things: you can either set up six of the most mature font properties in one line, or you can set one of a choice of keywords to adopt a system font setting.
   */
  var font: UndefOr[js.Any] = js.native;

  /**
   * The font-family property allows one or more font family names and/or generic family names to be specified for usage on the selected element(s)' text. The browser then goes through the list] = js.native; for each character in the selection it applies the first font family that has an available glyph for that character.
   */
  var fontFamily: UndefOr[js.Any] = js.native;

  /**
   * The font-kerning property allows contextual adjustment of inter-glyph spacing, i.e. the spaces between the characters in text. This property controls <bold>metric kerning</bold> - that utilizes adjustment data contained in the font. Optical Kerning is not supported as yet.
   */
  var fontKerning: UndefOr[js.Any] = js.native;

  /**
   * Specifies the size of the font. Used to compute em and ex units.
   */
  var fontSize: UndefOr[String] = js.native;

  /**
   * The font-size-adjust property adjusts the font-size of the fallback fonts defined with font-family, so that the x-height is the same no matter what font is used. This preserves the readability of the text when fallback happens.
   */
  var fontSizeAdjust: UndefOr[js.Any] = js.native;

  /**
   * Allows you to expand or condense the widths for a normal, condensed, or expanded font face.
   */
  var fontStretch: UndefOr[js.Any] = js.native;

  /**
   * The font-style property allows normal, italic, or oblique faces to be selected. Italic forms are generally cursive in nature while oblique faces are typically sloped versions of the regular face. Oblique faces can be simulated by artificially sloping the glyphs of the regular face.
   */
  var fontStyle: UndefOr[js.Any] = js.native;

  /**
   * This value specifies whether the user agent is allowed to synthesize bold or oblique font faces when a font family lacks bold or italic faces.
   */
  var fontSynthesis: UndefOr[js.Any] = js.native;

  /**
   * The font-variant property enables you to select the small-caps font within a font family.
   */
  var fontVariant: UndefOr[js.Any] = js.native;

  /**
   * Fonts can provide alternate glyphs in addition to default glyph for a character. This property provides control over the selection of these alternate glyphs.
   */
  var fontVariantAlternates: UndefOr[js.Any] = js.native;

  /**
   * Specifies the weight or boldness of the font.
   *  "normal" | "bold" | "lighter" | "bolder" | Int par String
   */
  var fontWeight: UndefOr[String] = js.native;

  /**
   * Lays out one or more grid items bound by 4 grid lines. Shorthand for setting grid-column-start, grid-column-end, grid-row-start, and grid-row-end in a single declaration.
   */
  var gridArea: UndefOr[js.Any] = js.native;

  /**
   * Controls a grid item's placement in a grid area, particularly grid position and a grid span. Shorthand for setting grid-column-start and grid-column-end in a single declaration.
   */
  var gridColumn: UndefOr[js.Any] = js.native;

  /**
   * Controls a grid item's placement in a grid area as well as grid position and a grid span. The grid-column-end property (with grid-row-start, grid-row-end, and grid-column-start) determines a grid item's placement by specifying the grid lines of a grid item's grid area.
   */
  var gridColumnEnd: UndefOr[js.Any] = js.native;

  /**
   * Determines a grid item's placement by specifying the starting grid lines of a grid item's grid area . A grid item's placement in a grid area consists of a grid position and a grid span. See also ( grid-row-start, grid-row-end, and grid-column-end)
   */
  var gridColumnStart: UndefOr[js.Any] = js.native;

  /**
   * Gets or sets a value that indicates which row an element within a Grid should appear in. Shorthand for setting grid-row-start and grid-row-end in a single declaration.
   */
  var gridRow: UndefOr[js.Any] = js.native;

  /**
   * Determines a grid ites placement by specifying the block-end. A grid item's placement in a grid area consists of a grid position and a grid span. The grid-row-end property (with grid-row-start, grid-column-start, and grid-column-end) determines a grid item's placement by specifying the grid lines of a grid item's grid area.
   */
  var gridRowEnd: UndefOr[js.Any] = js.native;

  /**
   * Specifies a row position based upon an integer location, string value, or desired row size.
   * css/properties/grid-row is used as short-hand for grid-row-position and grid-row-position
   */
  var gridRowPosition: UndefOr[js.Any] = js.native;

  var gridRowSpan: UndefOr[js.Any] = js.native;

  /**
   * Specifies named grid areas which are not associated with js.Any particular grid item, but can be referenced from the grid-placement properties. The syntax of the grid-template-areas property also provides a visualization of the structure of the grid, making the overall layout of the grid container easier to understand.
   */
  var gridTemplateAreas: UndefOr[js.Any] = js.native;

  /**
   * Specifies (with grid-template-rows) the line names and track sizing functions of the grid. Each sizing function can be specified as a length, a percentage of the grid containes size, a measurement of the contents occupying the column or row, or a fraction of the free space in the grid.
   */
  var gridTemplateColumns: UndefOr[js.Any] = js.native;

  /**
   * Specifies (with grid-template-columns) the line names and track sizing functions of the grid. Each sizing function can be specified as a length, a percentage of the grid containes size, a measurement of the contents occupying the column or row, or a fraction of the free space in the grid.
   */
  var gridTemplateRows: UndefOr[js.Any] = js.native;

  /**
   * Sets the height of an element. The content area of the element height does not include the padding, border, and margin of the element.
   */
  var height: UndefOr[js.Any] = js.native;

  /**
   * Specifies the minimum Int of characters in a hyphenated word
   */
  var hyphenateLimitChars: UndefOr[js.Any] = js.native;

  /**
   * Indicates the maximum Int of successive hyphenated lines in an element. Theno-limitvalue means that there is no limit.
   */
  var hyphenateLimitLines: UndefOr[js.Any] = js.native;

  /**
   * Specifies the maximum amount of trailing whitespace (before justification) that may be left in a line before hyphenation is triggered to pull part of a word from the next line back up into the current one.
   */
  var hyphenateLimitZone: UndefOr[js.Any] = js.native;

  /**
   * Specifies whether or not words in a sentence can be split by the use of a manual or automatic hyphenation mechanism.
   */
  var hyphens: UndefOr[js.Any] = js.native;

  var imeMode: UndefOr[js.Any] = js.native;

  var layoutGrid: UndefOr[js.Any] = js.native;

  var layoutGridChar: UndefOr[js.Any] = js.native;

  var layoutGridLine: UndefOr[js.Any] = js.native;

  var layoutGridMode: UndefOr[js.Any] = js.native;

  var layoutGridType: UndefOr[js.Any] = js.native;

  /**
   * Sets the left edge of an element
   */
  var left: UndefOr[js.Any] = js.native;

  /**
   * The letter-spacing CSS property specifies the spacing behavior between text characters.
   */
  var letterSpacing: UndefOr[js.Any] = js.native;

  /**
   * Deprecated. Gets or sets line-breaking rules for text in selected languages such as Japanese, Chinese, and Korean.
   */
  var lineBreak: UndefOr[js.Any] = js.native;

  var lineClamp: UndefOr[Int] = js.native;

  /**
   * Specifies the height of an inline block level element.
   */
  var lineHeight: UndefOr[String] = js.native;

  /**
   * Shorthand property that sets the list-style-type, list-style-position and list-style-image properties in one declaration.
   */
  var listStyle: UndefOr[js.Any] = js.native;

  /**
   * This property sets the image that will be used as the list item marker. When the image is available, it will replace the marker set with the 'list-style-type' marker. That also means that if the image is not available, it will show the style specified by list-style-property
   */
  var listStyleImage: UndefOr[js.Any] = js.native;

  /**
   * Specifies if the list-item markers should appear inside or outside the content flow.
   */
  var listStylePosition: UndefOr[js.Any] = js.native;

  /**
   * Specifies the type of list-item marker in a list.
   */
  var listStyleType: UndefOr[js.Any] = js.native;

  /**
   * The margin property is shorthand to allow you to set all four margins of an element at once. Its equivalent longhand properties are margin-top, margin-right, margin-bottom and margin-left. Negative values are also allowed.
   */
  var margin: UndefOr[js.Any] = js.native;

  /**
   * margin-bottom sets the bottom margin of an element.
   */
  var marginBottom: UndefOr[js.Any] = js.native;

  /**
   * margin-left sets the left margin of an element.
   */
  var marginLeft: UndefOr[js.Any] = js.native;

  /**
   * margin-right sets the right margin of an element.
   */
  var marginRight: UndefOr[js.Any] = js.native;

  /**
   * margin-top sets the top margin of an element.
   */
  var marginTop: UndefOr[js.Any] = js.native;

  /**
   * The marquee-direction determines the initial direction in which the marquee content moves.
   */
  var marqueeDirection: UndefOr[js.Any] = js.native;

  /**
   * The 'marquee-style' property determines a marquee's scrolling behavior.
   */
  var marqueeStyle: UndefOr[js.Any] = js.native;

  /**
   * This property is shorthand for setting mask-image, mask-mode, mask-repeat, mask-position, mask-clip, mask-origin, mask-composite and mask-size. Omitted values are set to their original properties' initial values.
   */
  var mask: UndefOr[js.Any] = js.native;

  /**
   * This property is shorthand for setting mask-border-source, mask-border-slice, mask-border-width, mask-border-outset, and mask-border-repeat. Omitted values are set to their original properties' initial values.
   */
  var maskBorder: UndefOr[js.Any] = js.native;

  /**
   * This property specifies how the images for the sides and the middle part of the mask image are scaled and tiled. The first keyword applies to the horizontal sides, the second one applies to the vertical ones. If the second keyword is absent, it is assumed to be the same as the first, similar to the CSS border-image-repeat property.
   */
  var maskBorderRepeat: UndefOr[js.Any] = js.native;

  /**
   * This property specifies inward offsets from the top, right, bottom, and left edges of the mask image, dividing it into nine regions: four corners, four edges, and a middle. The middle image part is discarded and treated as fully transparent black unless the fill keyword is present. The four values set the top, right, bottom and left offsets in that order, similar to the CSS border-image-slice property.
   */
  var maskBorderSlice: UndefOr[js.Any] = js.native;

  /**
   * Specifies an image to be used as a mask. An image that is empty, fails to download, is non-existent, or cannot be displayed is ignored and does not mask the element.
   */
  var maskBorderSource: UndefOr[js.Any] = js.native;

  /**
   * This property sets the width of the mask box image, similar to the CSS border-image-width property.
   */
  var maskBorderWidth: UndefOr[js.Any] = js.native;

  /**
   * Determines the mask painting area, which defines the area that is affected by the mask. The painted content of an element may be restricted to this area.
   */
  var maskClip: UndefOr[js.Any] = js.native;

  /**
   * For elements rendered as a single box, specifies the mask positioning area. For elements rendered as multiple boxes (e.g., inline boxes on several lines, boxes on several pages) specifies which boxes box-decoration-break operates on to determine the mask positioning area(s).
   */
  var maskOrigin: UndefOr[js.Any] = js.native;

  /**
   * This property must not be used. It is no longer included in js.Any standard or standard track specification, nor is it implemented in js.Any browser. It is only used when the text-align-last property is set to size. It controls allowed adjustments of font-size to fit line content.
   */
  var maxFontSize: UndefOr[js.Any] = js.native;

  /**
   * Sets the maximum height for an element. It prevents the height of the element to exceed the specified value. If min-height is specified and is greater than max-height, max-height is overridden.
   */
  var maxHeight: UndefOr[js.Any] = js.native;

  /**
   * Sets the maximum width for an element. It limits the width property to be larger than the value specified in max-width.
   */
  var maxWidth: UndefOr[js.Any] = js.native;

  /**
   * Sets the minimum height for an element. It prevents the height of the element to be smaller than the specified value. The value of min-height overrides both max-height and height.
   */
  var minHeight: UndefOr[js.Any] = js.native;

  /**
   * Sets the minimum width of an element. It limits the width property to be not smaller than the value specified in min-width.
   */
  var minWidth: UndefOr[js.Any] = js.native;

  /**
   * Specifies the transparency of an element.
   */
  var opacity: UndefOr[Int] = js.native;

  /**
   * Specifies the order used to lay out flex items in their flex container.
   * Elements are laid out in the ascending order of the order value.
   */
  var order: UndefOr[Int] = js.native;

  /**
   * In paged media, this property defines the minimum Int of lines in
   * a block container that must be left at the bottom of the page.
   */
  var orphans: UndefOr[Int] = js.native;

  /**
   * The CSS outline property is a shorthand property for setting one or more of the individual outline properties outline-style, outline-width and outline-color in a single rule. In most cases the use of this shortcut is preferable and more convenient.
   * Outlines differ from borders in the following ways:      var outlines do not take up space, they are drawn above the content.
   *            var outlines may be non-rectangular. They are rectangular in Gecko/Firefox. Internet Explorer attempts to place the smallest contiguous outline around all elements or shapes that are indicated to have an outline. Opera draws a non-rectangular shape around a construct.
   */
  var outline: UndefOr[js.Any] = js.native;

  /**
   * The outline-color property sets the color of the outline of an element. An outline is a line that is drawn around elements, outside the border edge, to make the element stand out.
   */
  var outlineColor: UndefOr[js.Any] = js.native;

  /**
   * The outline-offset property offsets the outline and draw it beyond the border edge.
   */
  var outlineOffset: UndefOr[js.Any] = js.native;

  /**
   * The overflow property controls how extra content exceeding the bounding box of an element is rendered. It can be used in conjunction with an element that has a fixed width and height, to eliminate text-induced page distortion.
   */
  var overflow: UndefOr[js.Any] = js.native;

  /**
   * Specifies the preferred scrolling methods for elements that overflow.
   */
  var overflowStyle: UndefOr[js.Any] = js.native;

  /**
   * Controls how extra content exceeding the x-axis of the bounding box of an element is rendered.
   */
  var overflowX: UndefOr[js.Any] = js.native;

  /**
   * Controls how extra content exceeding the y-axis of the bounding box of an element is rendered.
   */
  var overflowY: UndefOr[js.Any] = js.native;

  /**
   * The padding optional CSS property sets the required padding space on one to four sides of an element. The padding area is the space between an element and its border. Negative values are not allowed but decimal values are permitted. The element size is treated as fixed, and the content of the element shifts toward the center as padding is increased.
   * The padding property is a shorthand to avoid setting each side separately (padding-top, padding-right, padding-bottom, padding-left).
   */
  var padding: UndefOr[js.Any] = js.native;

  /**
   * The padding-bottom CSS property of an element sets the padding space required on the bottom of an element. The padding area is the space between the content of the element and its border. Contrary to margin-bottom values, negative values of padding-bottom are invalid.
   */
  var paddingBottom: UndefOr[js.Any] = js.native;

  /**
   * The padding-left CSS property of an element sets the padding space required on the left side of an element. The padding area is the space between the content of the element and its border. Contrary to margin-left values, negative values of padding-left are invalid.
   */
  var paddingLeft: UndefOr[js.Any] = js.native;

  /**
   * The padding-right CSS property of an element sets the padding space required on the right side of an element. The padding area is the space between the content of the element and its border. Contrary to margin-right values, negative values of padding-right are invalid.
   */
  var paddingRight: UndefOr[js.Any] = js.native;

  /**
   * The padding-top CSS property of an element sets the padding space required on the top of an element. The padding area is the space between the content of the element and its border. Contrary to margin-top values, negative values of padding-top are invalid.
   */
  var paddingTop: UndefOr[js.Any] = js.native;

  /**
   * The page-break-after property is supported in all major browsers. With CSS3, page-break-* properties are only aliases of the break-* properties. The CSS3 Fragmentation spec defines breaks for all CSS box fragmentation.
   */
  var pageBreakAfter: UndefOr[js.Any] = js.native;

  /**
   * The page-break-before property sets the page-breaking behavior before an element. With CSS3, page-break-* properties are only aliases of the break-* properties. The CSS3 Fragmentation spec defines breaks for all CSS box fragmentation.
   */
  var pageBreakBefore: UndefOr[js.Any] = js.native;

  /**
   * Sets the page-breaking behavior inside an element. With CSS3, page-break-* properties are only aliases of the break-* properties. The CSS3 Fragmentation spec defines breaks for all CSS box fragmentation.
   */
  var pageBreakInside: UndefOr[js.Any] = js.native;

  /**
   * The pause property determines how long a speech media agent should pause before and after presenting an element. It is a shorthand for the pause-before and pause-after properties.
   */
  var pause: UndefOr[js.Any] = js.native;

  /**
   * The pause-after property determines how long a speech media agent should pause after presenting an element. It may be replaced by the shorthand property pause, which sets pause time before and after.
   */
  var pauseAfter: UndefOr[js.Any] = js.native;

  /**
   * The pause-before property determines how long a speech media agent should pause before presenting an element. It may be replaced by the shorthand property pause, which sets pause time before and after.
   */
  var pauseBefore: UndefOr[js.Any] = js.native;

  /**
   * The perspective property defines how far an element is placed from the view on the z-axis, from the screen to the viewer.
   * Perspective defines how an Any is viewed. In graphic arts, perspective is the representation on a flat surface of what the viewer's eye would see in a 3D space. (See Wikipedia for more information about graphical perspective and for related illustrations.)
   * The illusion of perspective on a flat surface, such as a computer screen, is created by projecting points on the flat surface as they would appear if the flat surface were a window through which the viewer was looking at the Any. In discussion of virtual environments, this flat surface is called a projection plane.
   */
  var perspective: UndefOr[js.Any] = js.native;

  /**
   * The perspective-origin property establishes the origin for the perspective property. It effectively sets the X and Y position at which the viewer appears to be looking at the children of the element.
   * When used with perspective, perspective-origin changes the appearance of an Any, as if a viewer were looking at it from a different origin. An Any appears differently if a viewer is looking directly at it versus looking at it from below, above, or from the side. Thus, the perspective-origin is like a vanishing point.
   * The default value of perspective-origin is 50% 50%. This displays an Any as if the viewer's eye were positioned directly at the center of the screen, both top-to-bottom and left-to-right. A value of 0% 0% changes the Any as if the viewer was looking toward the top left angle. A value of 100% 100% changes the appearance as if viewed toward the bottom right angle.
   */
  var perspectiveOrigin: UndefOr[js.Any] = js.native;

  /**
   * The pointer-events property allows you to control whether an element can be the target for the pointing device (e.g, mouse, pen) events.
   */
  var pointerEvents: UndefOr[js.Any] = js.native;

  /**
   * The position property controls the type of positioning used by an element within its parent elements. The effect of the position property depends on a lot of factors, for example the position property of parent elements.
   */
  var position: UndefOr[js.Any] = js.native;

  /**
   * Obsolete: unsupported.
   * This property determines whether or not a full-width punctuation mark character should be trimmed if it appears at the beginning of a line, so that its "ink" lines up with the first glyph in the line above and below.
   */
  var punctuationTrim: UndefOr[js.Any] = js.native;

  /**
   * Sets the type of quotation marks for embedded quotations.
   */
  var quotes: UndefOr[js.Any] = js.native;

  /**
   * Controls whether the last region in a chain displays additional 'overset' content according its default overflow property, or if it displays a fragment of content as if it were flowing into a subsequent region.
   */
  var regionFragment: UndefOr[js.Any] = js.native;

  /**
   * The rest-after property determines how long a speech media agent should pause after presenting an element's main content, before presenting that element's exit cue sound. It may be replaced by the shorthand property rest, which sets rest time before and after.
   */
  var restAfter: UndefOr[js.Any] = js.native;

  /**
   * The rest-before property determines how long a speech media agent should pause after presenting an intro cue sound for an element, before presenting that element's main content. It may be replaced by the shorthand property rest, which sets rest time before and after.
   */
  var restBefore: UndefOr[js.Any] = js.native;

  /**
   * Specifies the position an element in relation to the right side of the containing element.
   */
  var right: UndefOr[js.Any] = js.native;

  var rubyAlign: UndefOr[js.Any] = js.native;

  var rubyPosition: UndefOr[js.Any] = js.native;

  /**
   * Defines the alpha channel threshold used to extract a shape from an image. Can be thought of as a "minimum opacity" threshold] = js.native; that is, a value of 0.5 means that the shape will enclose all the pixels that are more than 50% opaque.
   */
  var shapeImageThreshold: UndefOr[js.Any] = js.native;

  /**
   * A future level of CSS Shapes will define a shape-inside property, which will define a shape to wrap content within the element. See Editor's Draft <http://dev.w3.org/csswg/css-shapes/> and CSSWG wiki page on next-level plans <http://wiki.csswg.org/spec/css-shapes>
   */
  var shapeInside: UndefOr[js.Any] = js.native;

  /**
   * Adds a margin to a shape-outside. In effect, defines a new shape that is the smallest contour around all the points that are the shape-margin distance outward perpendicular to each point on the underlying shape. For points where a perpendicular direction is not defined (e.g., a triangle corner), takes all points on a circle centered at the point and with a radius of the shape-margin distance. This property accepts only non-negative values.
   */
  var shapeMargin: UndefOr[js.Any] = js.native;

  /**
   * Declares a shape around which text should be wrapped, with possible modifications from the shape-margin property. The shape defined by shape-outside and shape-margin changes the geometry of a float element's float area.
   */
  var shapeOutside: UndefOr[js.Any] = js.native;

  /**
   * The speak property determines whether or not a speech synthesizer will read aloud the contents of an element.
   */
  var speak: UndefOr[js.Any] = js.native;

  /**
   * The speak-as property determines how the speech synthesizer interprets the content: words as whole words or as a sequence of letters, Ints as a numerical value or a sequence of digits, punctuation as pauses in speech or named punctuation characters.
   */
  var speakAs: UndefOr[js.Any] = js.native;

  /**
   * SVG: Specifies the opacity of the outline on the current Any.
   */
  var strokeOpacity: UndefOr[Int] = js.native;

  /**
   * SVG: Specifies the width of the outline on the current Any.
   */
  var strokeWidth: UndefOr[Int] = js.native;

  /**
   * The tab-size CSS property is used to customise the width of a tab (U+0009) character.
   */
  var tabSize: UndefOr[js.Any] = js.native;

  /**
   * The 'table-layout' property controls the algorithm used to lay out the table cells, rows, and columns.
   */
  var tableLayout: UndefOr[js.Any] = js.native;

  /**
   * The text-align CSS property describes how inline content like text is aligned in its parent block element. text-align does not control the alignment of block elements itself, only their inline content.
   */
  var textAlign: UndefOr[js.Any] = js.native;

  /**
   * The text-align-last CSS property describes how the last line of a block element or a line before line break is aligned in its parent block element.
   */
  var textAlignLast: UndefOr[js.Any] = js.native;

  /**
   * The text-decoration CSS property is used to set the text formatting to underline, overline, line-through or blink.
   * underline and overline decorations are positioned under the text, line-through over it.
   */
  var textDecoration: UndefOr[js.Any] = js.native;

  /**
   * Sets the color of js.Any text decoration, such as underlines, overlines, and strike throughs.
   */
  var textDecorationColor: UndefOr[js.Any] = js.native;

  /**
   * Sets what kind of line decorations are added to an element, such as underlines, overlines, etc.
   */
  var textDecorationLine: UndefOr[js.Any] = js.native;

  var textDecorationLineThrough: UndefOr[js.Any] = js.native;

  var textDecorationNone: UndefOr[js.Any] = js.native;

  var textDecorationOverline: UndefOr[js.Any] = js.native;

  /**
   * Specifies what parts of an elements content are skipped over when applying js.Any text decoration.
   */
  var textDecorationSkip: UndefOr[js.Any] = js.native;

  /**
   * This property specifies the style of the text decoration line drawn on the specified element. The intended meaning for the values are the same as those of the border-style-properties.
   */
  var textDecorationStyle: UndefOr[js.Any] = js.native;

  var textDecorationUnderline: UndefOr[js.Any] = js.native;

  /**
   * The text-emphasis property will apply special emphasis marks to the elements text. Slightly similar to the text-decoration property only that this property can have affect on the line-height. It also is noted that this is shorthand for text-emphasis-style and for text-emphasis-color.
   */
  var textEmphasis: UndefOr[js.Any] = js.native;

  /**
   * The text-emphasis-color property specifies the foreground color of the emphasis marks.
   */
  var textEmphasisColor: UndefOr[js.Any] = js.native;

  /**
   * The text-emphasis-style property applies special emphasis marks to an element's text.
   */
  var textEmphasisStyle: UndefOr[js.Any] = js.native;

  /**
   * This property helps determine an inline box's block-progression dimension, derived from the text-height and font-size properties for non-replaced elements, the height or the width for replaced elements, and the stacked block-progression dimension for inline-block elements. The block-progression dimension determines the position of the padding, border and margin for the element.
   */
  var textHeight: UndefOr[js.Any] = js.native;

  /**
   * Specifies the amount of space horizontally that should be left on the first line of the text of an element. This horizontal spacing is at the beginning of the first line and is in respect to the left edge of the containing block box.
   */
  var textIndent: UndefOr[js.Any] = js.native;

  var textJustifyTrim: UndefOr[js.Any] = js.native;

  var textKashidaSpace: UndefOr[js.Any] = js.native;

  /**
   * The text-line-through property is a shorthand property for text-line-through-style, text-line-through-color and text-line-through-mode. (Considered obsolete] = js.native; use text-decoration instead.)
   */
  var textLineThrough: UndefOr[js.Any] = js.native;

  /**
   * Specifies the line colors for the line-through text decoration.
   * (Considered obsolete] = js.native; use text-decoration-color instead.)
   */
  var textLineThroughColor: UndefOr[js.Any] = js.native;

  /**
   * Sets the mode for the line-through text decoration, determining whether the text decoration affects the space characters or not.
   * (Considered obsolete] = js.native; use text-decoration-skip instead.)
   */
  var textLineThroughMode: UndefOr[js.Any] = js.native;

  /**
   * Specifies the line style for line-through text decoration.
   * (Considered obsolete] = js.native; use text-decoration-style instead.)
   */
  var textLineThroughStyle: UndefOr[js.Any] = js.native;

  /**
   * Specifies the line width for the line-through text decoration.
   */
  var textLineThroughWidth: UndefOr[js.Any] = js.native;

  /**
   * The text-overflow shorthand CSS property determines how overflowed content that is not displayed is signaled to the users. It can be clipped, display an ellipsis ('', U+2026 HORIZONTAL ELLIPSIS) or a Web author-defined string. It covers the two long-hand properties text-overflow-mode and text-overflow-ellipsis
   */
  var textOverflow: UndefOr[js.Any] = js.native;

  /**
   * The text-overline property is the shorthand for the text-overline-style, text-overline-width, text-overline-color, and text-overline-mode properties.
   */
  var textOverline: UndefOr[js.Any] = js.native;

  /**
   * Specifies the line color for the overline text decoration.
   */
  var textOverlineColor: UndefOr[js.Any] = js.native;

  /**
   * Sets the mode for the overline text decoration, determining whether the text decoration affects the space characters or not.
   */
  var textOverlineMode: UndefOr[js.Any] = js.native;

  /**
   * Specifies the line style for overline text decoration.
   */
  var textOverlineStyle: UndefOr[js.Any] = js.native;

  /**
   * Specifies the line width for the overline text decoration.
   */
  var textOverlineWidth: UndefOr[js.Any] = js.native;

  /**
   * The text-rendering CSS property provides information to the browser about how to optimize when rendering text. Options are: legibility, speed or geometric precision.
   */
  var textRendering: UndefOr[js.Any] = js.native;

  /**
   * Obsolete: unsupported.
   */
  var textScript: UndefOr[js.Any] = js.native;

  /**
   * The CSS text-shadow property applies one or more drop shadows to the text and <text-decorations> of an element. Each shadow is specified as an offset from the text, along with optional color and blur radius values.
   */
  var textShadow: UndefOr[js.Any] = js.native;

  /**
   * This property transforms text for styling purposes. (It has no effect on the underlying content.)
   */
  var textTransform: UndefOr[js.Any] = js.native;

  /**
   * Unsupported.
   * This property will add a underline position value to the element that has an underline defined.
   */
  var textUnderlinePosition: UndefOr[js.Any] = js.native;

  /**
   * After review this should be replaced by text-decoration should it not?
   * This property will set the underline style for text with a line value for underline, overline, and line-through.
   */
  var textUnderlineStyle: UndefOr[js.Any] = js.native;

  /**
   * This property specifies how far an absolutely positioned box's top margin edge is offset below the top edge of the box's containing block. For relatively positioned boxes, the offset is with respect to the top edges of the box itself (i.e., the box is given a position in the normal flow, then offset from that position according to these properties).
   */
  var top: UndefOr[js.Any] = js.native;

  /**
   * Determines whether touch input may trigger default behavior supplied by the user agent, such as panning or zooming.
   */
  var touchAction: UndefOr[js.Any] = js.native;

  /**
   * CSS transforms allow elements styled with CSS to be transformed in two-dimensional or three-dimensional space. Using this property, elements can be translated, rotated, scaled, and skewed. The value list may consist of 2D and/or 3D transform values.
   */
  var transform: UndefOr[js.Any] = js.native;

  /**
   * This property defines the origin of the transformation axes relative to the element to which the transformation is applied.
   */
  var transformOrigin: UndefOr[js.Any] = js.native;

  /**
   * This property allows you to define the relative position of the origin of the transformation grid along the z-axis.
   */
  var transformOriginZ: UndefOr[js.Any] = js.native;

  /**
   * This property specifies how nested elements are rendered in 3D space relative to their parent.
   */
  var transformStyle: UndefOr[js.Any] = js.native;

  /**
   * The transition CSS property is a shorthand property for transition-property, transition-duration, transition-timing-function, and transition-delay. It allows to define the transition between two states of an element.
   */
  var transition: UndefOr[js.Any] = js.native;

  /**
   * Defines when the transition will start. A value of  smeans the transition will execute as soon as the property is changed. Otherwise, the value specifies an offset from the moment the property is changed, and the transition will delay execution by that offset.
   */
  var transitionDelay: UndefOr[js.Any] = js.native;

  /**
   * The 'transition-duration' property specifies the length of time a transition animation takes to complete.
   */
  var transitionDuration: UndefOr[js.Any] = js.native;

  /**
   * The 'transition-property' property specifies the name of the CSS property to which the transition is applied.
   */
  var transitionProperty: UndefOr[js.Any] = js.native;

  /**
   * Sets the pace of action within a transition
   */
  var transitionTimingFunction: UndefOr[js.Any] = js.native;

  /**
   * The unicode-bidi CSS property specifies the level of embedding with respect to the bidirectional algorithm.
   */
  var unicodeBidi: UndefOr[js.Any] = js.native;

  /**
   * unicode-range allows you to set a specific range of characters to be downloaded from a font (embedded using @font-face) and made available for use on the current page.
   */
  var unicodeRange: UndefOr[js.Any] = js.native;

  /**
   * This is for all the high level UX stuff.
   */
  var userFocus: UndefOr[js.Any] = js.native;

  /**
   * For inputing user content
   */
  var userInput: UndefOr[js.Any] = js.native;

  /**
   * The vertical-align property controls how inline elements or text are vertically aligned compared to the baseline. If this property is used on table-cells it controls the vertical alignment of content of the table cell.
   */
  var verticalAlign: UndefOr[js.Any] = js.native;

  /**
   * The visibility property specifies whether the boxes generated by an element are rendered.
   */
  var visibility: UndefOr[js.Any] = js.native;

  /**
   * The voice-balance property sets the apparent position (in stereo sound) of the synthesized voice for spoken media.
   */
  var voiceBalance: UndefOr[js.Any] = js.native;

  /**
   * The voice-duration property allows the author to explicitly set the amount of time it should take a speech synthesizer to read an element's content, for example to allow the speech to be synchronized with other media. With a value of auto (the default) the length of time it takes to read the content is determined by the content itself and the voice-rate property.
   */
  var voiceDuration: UndefOr[js.Any] = js.native;

  /**
   * The voice-family property sets the speaker's voice used by a speech media agent to read an element. The speaker may be specified as a named character (to match a voice option in the speech reading software) or as a generic description of the age and gender of the voice. Similar to the font-family property for visual media, a comma-separated list of fallback options may be given in case the speech reader does not recognize the character name or cannot synthesize the requested combination of generic properties.
   */
  var voiceFamily: UndefOr[js.Any] = js.native;

  /**
   * The voice-pitch property sets pitch or tone (high or low) for the synthesized speech when reading an element] = js.native; the pitch may be specified absolutely or relative to the normal pitch for the voice-family used to read the text.
   */
  var voicePitch: UndefOr[js.Any] = js.native;

  /**
   * The voice-range property determines how much variation in pitch or tone will be created by the speech synthesize when reading an element. Emphasized text, grammatical structures and punctuation may all be rendered as changes in pitch, this property determines how strong or obvious those changes are] = js.native; large ranges are associated with enthusiastic or emotional speech, while small ranges are associated with flat or mechanical speech.
   */
  var voiceRange: UndefOr[js.Any] = js.native;

  /**
   * The voice-rate property sets the speed at which the voice synthesized by a speech media agent will read content.
   */
  var voiceRate: UndefOr[js.Any] = js.native;

  /**
   * The voice-stress property sets the level of vocal emphasis to be used for synthesized speech reading the element.
   */
  var voiceStress: UndefOr[js.Any] = js.native;

  /**
   * The voice-volume property sets the volume for spoken content in speech media. It replaces the deprecated volume property.
   */
  var voiceVolume: UndefOr[js.Any] = js.native;

  /**
   * The white-space property controls whether and how white space inside the element is collapsed, and whether lines may wrap at unforced "soft wrap" opportunities.
   */
  var whiteSpace: UndefOr[js.Any] = js.native;

  /**
   * Obsolete: unsupported.
   */
  var whiteSpaceTreatment: UndefOr[js.Any] = js.native;

  /**
   * In paged media, this property defines the mimimum Int of lines
   * that must be left at the top of the second page.
   */
  var widows: UndefOr[Int] = js.native;

  /**
   * Specifies the width of the content area of an element. The content area of the element width does not include the padding, border, and margin of the element.
   */
  var width: UndefOr[js.Any] = js.native;

  /**
   * The word-break property is often used when there is long generated content that is strung together without and spaces or hyphens to beak apart. A common case of this is when there is a long URL that does not have js.Any hyphens. This case could potentially cause the breaking of the layout as it could extend past the parent element.
   */
  var wordBreak: UndefOr[js.Any] = js.native;

  /**
   * The word-spacing CSS property specifies the spacing behavior between "words".
   */
  var wordSpacing: UndefOr[js.Any] = js.native;

  /**
   * An alias of css/properties/overflow-wrap, word-wrap defines whether to break words when the content exceeds the boundaries of its container.
   */
  var wordWrap: UndefOr[js.Any] = js.native;

  /**
   * Specifies how exclusions affect inline content within block-level elements. Elements lay out their inline content in their content area but wrap around exclusion areas.
   */
  var wrapFlow: UndefOr[js.Any] = js.native;

  /**
   * Set the value that is used to offset the inner wrap shape from other shapes. Inline content that intersects a shape with this property will be pushed by this shape's margin.
   */
  var wrapMargin: UndefOr[js.Any] = js.native;

  /**
   * Obsolete and unsupported. Do not use.
   * This CSS property controls the text when it reaches the end of the block in which it is enclosed.
   */
  var wrapOption: UndefOr[js.Any] = js.native;

  /**
   * writing-mode specifies if lines of text are laid out horizontally or vertically, and the direction which lines of text and blocks progress.
   */
  var writingMode: UndefOr[js.Any] = js.native;

  /**
   * The z-index property specifies the z-order of an element and its descendants.
   * When elements overlap, z-order determines which one covers the other.
   */
  var zIndex: UndefOr[js.Any] = js.native;

  /**
   * Sets the initial zoom factor of a document defined by @viewport.
   */
  var zoom: UndefOr[js.Any] = js.native;

  //   [propertyName: string]: js.Any] = js.native;

}