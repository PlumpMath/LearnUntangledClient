(ns app.ui
  (:require [om.next :as om :refer-macros [defui]]
            [untangled.client.mutations :as mut]
            [untangled.client.core :as uc]
            [om.dom :as dom]))

;; A UI node, with a co-located query of app state and a definition
;; of the application's initial state.
;; The `:once` metadata ensures that figwheel does not redefine the
;; static component with each re-render.

(defui ^:once Root
  static uc/InitialAppState
  (initial-state [this params] {:ui/react-key "ROOT"
                                :some-data 42})
  static om/IQuery
  (query [this] [:ui/react-key :some-data])
  Object
  (render [this]
    (let [{:keys [ui/react-key some-data]} (om/props this)]
      (dom/div #js {:key react-key}
               (str "Hello world: " some-data)))))

;; Create an application entry point for development mode in
;; dev/client/cljs/user.cljs



