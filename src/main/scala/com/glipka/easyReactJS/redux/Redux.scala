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
 
package com.glipka.easyReactJS.redux
import scala.scalajs.js
import Include._
@js.native
object Redux extends js.Any {

  /**
   * Turns an object whose values are different reducer functions, into a single
   * reducer function. It will call every child reducer, and gather their results
   * into a single state object, whose keys correspond to the keys of the passed
   * reducer functions.
   *
   * @template S Combined state object type.
   *
   * @param reducers An object whose values correspond to different reducer
   *   functions that need to be combined into one. One handy way to obtain it
   *   is to use ES6 `import * as reducers` syntax. The reducers may never
   *   return undefined for any action. Instead, they should return their
   *   initial state if the state passed to them was undefined, and the current
   *   state for any unrecognized action.
   *
   * @returns A reducer function that invokes every reducer inside the passed
   *   object, and builds a state object with the same shape.
   */
  def combineReducers[S](reducers: js.Any): js.Any = js.native
  def combineReducers[S](reducers: Any): js.Any = js.native

  /**
   * A store enhancer is a higher-order function that composes a store creator
   * to return a new, enhanced store creator. This is similar to middleware in
   * that it allows you to alter the store interface in a composable way.
   *
   * Store enhancers are much the same concept as higher-order components in
   * React, which are also occasionally called  component enhancers .
   *
   * Because a store is not an instance, but rather a plain-object collection of
   * functions, copies can be easily created and modified without mutating the
   * original store. There is an example in  compose documentation
   * demonstrating that.
   *
   * Most likely youÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ll never write a store enhancer, but you may use the one
   * provided by the developer tools. It is what makes time travel possible
   * without the app being aware it is happening. Amusingly, the Redux
   * middleware implementation is itself a store enhancer.
   */
  /**
   * Creates a Redux store that holds the state tree.
   * The only way to change the data in the store is to call `dispatch()` on it.
   *
   * There should only be a single store in your app. To specify how different
   * parts of the state tree respond to actions, you may combine several
   * reducers
   * into a single reducer function by using `combineReducers`.
   *
   * @template S State object type.
   *
   * @param reducer A function that returns the next state tree, given the
   *   current state tree and the action to handle.
   *
   * @param [preloadedState] The initial state. You may optionally specify it to
   *   hydrate the state from the server in universal apps, or to restore a
   *   previously serialized user session. If you use `combineReducers` to
   *   produce the root reducer function, this must be an object with the same
   *   shape as `combineReducers` keys.
   *
   * @param [enhancer] The store enhancer. You may optionally specify it to
   *   enhance the store with third-party capabilities such as middleware, time
   *   travel, persistence, etc. The only store enhancer that ships with Redux
   *   is `applyMiddleware()`.
   *
   * @returns A Redux store that lets you read the state, dispatch actions and
   *   subscribe to changes.
   */
  val createStore: StoreCreator = js.native
  def createStore[S] (reducer: Any, preloadedState: S ): Store[S] = js.native
   def createStore[S] (reducer: Any): Store[S] = js.native
   def createStore[S] (reducer: Any,middleware:js.Dynamic): Store[S] = js.native


  /**
   * Creates a store enhancer that applies middleware to the dispatch method
   * of the Redux store. This is handy for a variety of tasks, such as
   * expressing asynchronous actions in a concise manner, or logging every
   * action payload.
   *
   * See `redux-thunk` package as an example of the Redux middleware.
   *
   * Because middleware is potentially asynchronous, this should be the first
   * store enhancer in the composition chain.
   *
   * Note that each middleware will be given the `dispatch` and `getState`
   * functions as named arguments.
   *
   * @param middlewares The middleware chain to be applied.
   * @returns A store enhancer applying the middleware.
   */
  def applyMiddleware[S](middlewares: Middleware[S]*): GenericStoreEnhancer[S] = js.native

  /**
   * Turns an object whose values are action creators, into an object with the
   * same keys, but with every function wrapped into a `dispatch` call so they
   * may be invoked directly. This is just a convenience method, as you can call
   * `store.dispatch(MyActionCreators.doSomething())` yourself just fine.
   *
   * For convenience, you can also pass a single function as the first argument,
   * and get a function in return.
   *
   * @param actionCreator An object whose values are action creator functions.
   *   One handy way to obtain it is to use ES6 `import * as` syntax. You may
   *   also pass a single function.
   *
   * @param dispatch The `dispatch` function available on your Redux store.
   *
   * @returns The object mimicking the original object, but with every action
   *   creator wrapped into the `dispatch` call. If you passed a function as
   *   `actionCreator`, the return value will also be a single function.
   */
  def bindActionCreators[A <: ActionCreator[Any]](actionCreator: Any, dispatch: Any): js.Dynamic = js.native

  // def bindActionCreators[M <: ActionCreatorsMapObject](actionCreators: M, dispatch: Dispatch[Any]): M = js.native

  def bindActionCreators[M <: ActionCreatorsMapObject, N <: ActionCreatorsMapObject](actionCreators: M, dispatch: Dispatch[Any]): N = js.native

  /* compose */

  /**
   * Composes single-argument functions from right to left. The rightmost
   * function can take multiple arguments as it provides the signature for the
   * resulting composite function.
   *
   * @param funcs The functions to compose.
   * @returns R function obtained by composing the argument functions from right
   *   to left. For example, `compose(f, g, h)` is identical to doing
   *   `(...args) => f(g(h(...args)))`.
   */
  def compose[R](): (R, Any*) => R = js.native

  def compose[A, R](
    f1: (A) => R,
    f2: (Any*) => A): (Any*) => R = js.native

  def compose[A, B, R](
    f1: (B) => R,
    f2: (A) => B,
    f3: (Any*) => A): (Any*) => R = js.native

  def compose[A, B, C, R](
    f1: (C) => R,
    f2: (B) => C,
    f3: (A) => B,
    f4: (Any*) => A): (Any*) => R = js.native

  def compose[R](
    f1: (Any) => R,
    funcs: js.Function*): (Any*) => R = js.native

}