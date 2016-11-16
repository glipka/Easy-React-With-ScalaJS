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
 
package reactRedux
import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import react.Component
import scala.scalajs.js._
import react._

@js.native
@JSName("ReactRedux")
object ReactRedux extends js.Any {
  type FuncOrSelf[T] = () => T //type FuncOrSelf<T> = T | (() => T);
  def connect(): InferableComponentDecorator = js.native

//  def connect[TStateProps, TDispatchProps, TOwnProps](
//    mapStateToProps: FuncOrSelf[MapStateToProps[TStateProps, TOwnProps]],
//    mapDispatchToProps: FuncOrSelf[MapDispatchToPropsFunction[TDispatchProps, TOwnProps]]): ComponentDecorator[Any, TOwnProps] = js.native
//
//  def connect[TStateProps, TDispatchProps, TOwnProps](
//    mapStateToProps: FuncOrSelf[MapStateToProps[TStateProps, TOwnProps]],
//    mapDispatchToProps: FuncOrSelf[MapDispatchToPropsFunction[TDispatchProps, TOwnProps]],
//    mergeProps: MergeProps[TStateProps, TDispatchProps, TOwnProps],
//    options: Options): ComponentDecorator[Any, TOwnProps] = js.native

  //def connect[TStateProps, TDispatchProps, TOwnProps](
  //    mapStateToProps: js.Any,
  //    mapDispatchToProps: Any
  //  ) (app:Any): ComponentDecorator[Any  , TOwnProps] = js.native

  def connect[TStateProps, TDispatchProps, TOwnProps](
    mapStateToProps: js.Function,
    mapDispatchToProps: js.Function  ,
    mapMergeProps: js.Function 
    
  )  : js.Dynamic = js.native // js.Function1[Class[_],Component[TStateProps, TDispatchProps]] = js.native//Component[TOwnProps, Any] = js.native
  var Provider: ClassicComponentClass[ProviderProps] = js.native

}