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
 
package com.glipka.easyReactJS.reactBootstrap
import scala.scalajs.js
import com.glipka.easyReactJS.react._
@js.native
object ReactBootstrap extends js.Any {
  var Well: ClassicComponentClass[WellProps] = js.native
  var Tooltip: ClassicComponentClass[TooltipProps] = js.native
  var Thumbnail: ClassicComponentClass[ThumbnailProps] = js.native
  var Tabs: ClassicComponentClass[TabsProps] = js.native
  var Table: ClassicComponentClass[TableProps] = js.native

  var Tab: TabClass = js.native
  var SafeAnchor: ClassicComponentClass[SafeAnchorProps] = js.native
  var Row: ClassicComponentClass[RowProps] = js.native
  var ResponsiveEmbed:js.Any=js.native
  var Radio: ClassicComponentClass[RadioProps] = js.native
   var ProgressBar: ClassicComponentClass[ProgressBarProps] = js.native
  var Portal: ClassicComponentClass[PortalProps] = js.native
  var Popover: ClassicComponentClass[PopoverProps] = js.native
  var PanelGroup: ClassicComponentClass[PanelGroupProps] = js.native
  var Panel: ClassicComponentClass[PanelProps] = js.native
  var Pagination: ClassicComponentClass[PaginationProps] = js.native

  var Pager: PagerClass = js.native
  var PageItem: ClassicComponentClass[PageItemProps] = js.native
  var PageHeader: js.Any = js.native
  /** @deprecated since v0.30.0, should use [Pager.Item] instead of [PageItem]*/
  var OverlayTrigger: ClassicComponentClass[OverlayTriggerProps] = js.native
  var NavbarToggle: ClassicComponentClass[NavbarToggleProps] = js.native

  var NavbarHeader: ClassicComponentClass[NavbarHeaderProps] = js.native
  var NavbarBrand: ClassicComponentClass[NavbarBrandProps] = js.native
  var NavbarCollapse: ClassicComponentClass[NavbarCollapseProps] = js.native
  var Navbar: NavbarClass = js.native
  var Nav: Nav = js.native
  var NavDropdown: NavDropdown = js.native
  var NavItem: ClassicComponentClass[NavItemProps] = js.native

  var ModalDialog: ClassicComponentClass[ModalDialogProps] = js.native
  var Modal: ModalClass = js.native

  var MenuItem: ClassicComponentClass[MenuItemProps] = js.native
  var MediaRight: ClassicComponentClass[MediaRightProps] = js.native
  var MediaListItem: ClassicComponentClass[MediaListItemProps] = js.native
  var MediaList: ClassicComponentClass[MediaListProps] = js.native
  var MediaLeft: ClassicComponentClass[MediaLeftProps] = js.native

  var MediaHeading: ClassicComponentClass[MediaHeadingProps] = js.native
  var MediaBody: ClassicComponentClass[MediaBodyProps] = js.native
  var Media: MediaClass = js.native
  var ListGroup: ClassicComponentClass[ListGroupProps] = js.native
  var ListGroupItem: ClassicComponentClass[ListGroupItemProps] = js.native
  var Label: ClassicComponentClass[LabelProps] = js.native
  var Jumbotron: ClassicComponentClass[JumbotronProps] = js.native
  var InputGroupButton: ClassicComponentClass[InputGroupButtonProps] = js.native
  var InputGroupAddon: ClassicComponentClass[InputGroupAddonProps] = js.native
  var InputGroup: InputGroupClass = js.native
  var Image: ClassicComponentClass[ImageProps] = js.native
  var HelpBlock: ClassicComponentClass[HelpBlockProps] = js.native
  var Grid: ClassicComponentClass[GridProps] = js.native
  var Glyphicon: ClassicComponentClass[GlyphiconProps] = js.native
  var FormGroup: FormGroup = js.native
  var FormControl: FormControlClass = js.native
  var Form: ClassicComponentClass[FormProps] = js.native
  var DropdownButton: ClassicComponentClass[DropdownButtonProps] = js.native
  var Col: ClassicComponentClass[ColProps] = js.native
  var ControlLabel: ClassicComponentClass[ControlLabelProps] = js.native
  var Checkbox: ClassicComponentClass[CheckboxProps] = js.native
  var CarouselItem: ClassicComponentClass[CarouselItemProps] = js.native
  var CarouselCaption: ClassicComponentClass[CarouselCaptionProps] = js.native
  var Carousel: CarouselClass = js.native

  var ButtonToolbar: ClassicComponentClass[ButtonToolbarProps] = js.native
  var ButtonGroup: ClassicComponentClass[ButtonGroupProps] = js.native
  var Button: ClassicComponentClass[ButtonProps] = js.native
  var BreadcrumbItem: ClassicComponentClass[BreadcrumbItemProps] = js.native
  var Breadcrumb: BreadcrumbClass = js.native
  var Badge: ClassicComponentClass[BadgeProps] = js.native
  var Alert: ClassicComponentClass[AlertProps] = js.native
  var Accordion: ClassicComponentClass[AccordionProps] = js.native
  type Tooltip = ClassicComponent[TooltipProps, Any]

  type Thumbnail = ClassicComponent[ThumbnailProps, Any]
  type Tabs = ClassicComponent[TabsProps, Any]
  type Table = ClassicComponent[TableProps, Any]

  type TabPane = ClassicComponentClass[TabPaneProps]
  type TabContainer = ClassicComponentClass[TabContainerProps]
  type Tab = TabClass
  type Sizes = String;
  type SafeAnchor = ClassicComponent[SafeAnchorProps, Any]
  type Row = ClassicComponent[RowProps, Any]
  type Portal = ClassicComponent[PortalProps, Any]
  type Popover = ClassicComponent[PopoverProps, Any]
  type PanelGroup = ClassicComponent[PanelGroupProps, Any]
  type Panel = ClassicComponent[PanelProps, Any]
  type Pagination = ClassicComponent[PaginationProps, Any]
  type Pager = ClassicComponent[PagerProps, Any]
  type PageItem = ClassicComponent[PageItemProps, Any]
  type OverlayTrigger = ClassicComponent[OverlayTriggerProps, Any]
  type NavbarToggle = ClassicComponent[NavbarToggleProps, Any]
  type NavbarHeader = ClassicComponent[NavbarHeaderProps, Any]
  type NavbarCollapse = ClassicComponent[NavbarCollapseProps, Any]
  type Navbar = ClassicComponent[NavbarProps, Any]
  type NavItem = ClassicComponent[NavItemProps, Any]
  type NavDropdownProps = HTMLProps[NavDropdown]
  type ModalDialog = ClassicComponent[ModalDialogProps, Any]
  type Modal = ClassicComponent[ModalProps, Any]
  type MediaRight = ClassicComponent[MediaRightProps, Any]
  type MediaListItem = ClassicComponent[MediaListItemProps, Any]
  type MediaList = ClassicComponent[MediaListProps, Any]
  type MediaLeft = ClassicComponent[MediaLeftProps, Any]
  type MediaHeading = ClassicComponent[MediaHeadingProps, Any]
  type MediaBody = ClassicComponent[MediaBodyProps, Any]
  type Media = ClassicComponent[MediaProps, Any]
  type Jumbotron = ClassicComponent[JumbotronProps, Any]
  type InputGroupButton = ClassicComponent[InputGroupButtonProps, Any]
  type InputGroupAddon = ClassicComponent[InputGroupAddonProps, Any]
  type InputGroup = Component[InputGroupProps, Any]
  type Image = ClassicComponent[ImageProps, Any]
  type Grid = ClassicComponent[GridProps, Any]
  type Glyphicon = ClassicComponent[GlyphiconProps, Any]
  type FormControl = Component[FormControlProps, Any]
  type DropdownProps = Props[Dropdown]
  type DropdownButtonProps = Props[DropdownButton]
  type Col = ClassicComponent[ColProps, Any]
  type CarouselItem = ClassicComponent[CarouselItemProps, Any]
  type CarouselCaption = ClassicComponent[CarouselCaptionProps, Any]
  type Carousel = ClassicComponent[CarouselProps, Any]
  type ButtonToolbar = ClassicComponent[ButtonToolbarProps, Any]
  type ButtonGroup = ClassicComponent[ButtonGroupProps, Any]
  type Button = ClassicComponent[ButtonProps, {}]
  type BreadcrumbItem = ClassicComponent[BreadcrumbItemProps, {}]
  type Breadcrumb = ClassicComponent[BreadcrumbProps, Any]
  type Badge = ClassicComponent[BadgeProps, Any]
  type Alert = ClassicComponent[AlertProps, Any]
  type Accordion = ClassicComponent[AccordionProps, Any]

}