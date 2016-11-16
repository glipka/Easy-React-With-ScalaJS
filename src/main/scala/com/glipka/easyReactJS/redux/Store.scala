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
 
package redux

import scala.scalajs.js 
import Include._
 
    /**
     * A store is an object that holds the application s state tree.
     * There should only be a single store in a Redux app, as the composition
     * happens on the reducer level.
     *
     * @template S State object type.
     * import 
     */
  @js.native
   trait Store[S] extends js.Any {
      /**
       * Dispatches an action. It is the only way to trigger a state change.
       *
       * The `reducer` function, used to create the store, will be called with the
       * current state tree and the given `action`. Its return value will be
       * considered the **next** state of the tree, and the change listeners will
       * be notified.
       *
       * The base implementation only supports plain object actions. If you want
       * to dispatch a Promise, an Observable, a thunk, or something else, you
       * need to wrap your store creating function into the corresponding
       * middleware. For example, see the documentation for the `redux-thunk`
       * package. Even the middleware will eventually dispatch plain object
       * actions using this method.
       *
       * @param action A plain object representing  what changed . It is a good
       *   idea to keep actions serializable so you can record and replay user
       *   sessions, or use the time travelling  redux-devtools . An action must
       *   have a  type  property which may not be  undefined . It is a good idea
       *   to use string constants for action types.
       *
       * @returns For convenience, the same action object you dispatched.
       *
       * Note that, if you use a custom middleware, it may wrap  dispatch()  to
       * return something else (for example, a Promise you can await).
       */
      def dispatch(function:Any): Any = js.native

      /**
       * Reads the state tree managed by the store.
       *
       * @returns The current state tree of your application.
       */
      def getState(): S = js.native

      /**
       * Adds a change listener. It will be called any time an action is
       * dispatched, and some part of the state tree may potentially have changed.
       * You may then call  getState()  to read the current state tree inside the
       * callback.
       *
       * You may call  dispatch()  from a change listener, with the following
       * caveats:
       *
       * 1. The subscriptions are snapshotted just before every `dispatch()` call.
       * If you subscribe or unsubscribe while the listeners are being invoked,
       * this will not have any effect on the `dispatch()` that is currently in
       * progress. However, the next `dispatch()` call, whether nested or not,
       * will use a more recent snapshot of the subscription list.
       *
       * 2. The listener should not expect to see all states changes, as the state
       * might have been updated multiple times during a nested  dispatch()  before
       * the listener is called. It is, however, guaranteed that all subscribers
       * registered before the `dispatch()` started will be called with the latest
       * state by the time it exits.
       *
       * @param listener A callback to be invoked on every dispatch.
       * @returns A function to remove this change listener.
       */
      def subscribe(listener: () => Unit): Unsubscribe = js.native;

      /**
       * Replaces the reducer currently used by the store to calculate the state.
       *
       * You might need this if your app implements code splitting and you want to
       * load some of the reducers dynamically. You might also need this if you
       * implement a hot reloading mechanism for Redux.
       *
       * @param nextReducer The reducer for the store to use instead.
       */
      def replaceReducer(nextReducer: Reducer[S]): Unit = js.native;
    }