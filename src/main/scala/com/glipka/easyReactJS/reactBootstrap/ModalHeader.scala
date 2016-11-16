 
package com.glipka.easyReactJS.reactBootstrap
import scala.scalajs.js
import scala.scalajs.js._
import com.glipka.easyReactJS.react._
import ReactBootstrap._

@js.native trait ModalHeaderProps extends HTMLProps[ModalHeader]  with js.Any {
  var closeButton: Boolean = js.native
  var modalClassName: String = js.native
  var onHide: Function = js.native
  // undefined : String=js.native
}
@js.native
class ModalHeader(props:ModalHeaderProps) extends Component[ModalHeaderProps, Any](props) with js.Any {
}