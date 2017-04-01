(ns cljs.user
  (:require
    [cljs.pprint :refer [pprint]]
    [devtools.core :as devtools]
    [untangled.client.logging :as log]
    [untangled.client.core :as uc]
    [app.ui :as ui]
    [app.core :as core]))

;; Enable browser console
(enable-console-print!)

;; set overall browser logging level
(log/set-level :debug)

;; Enable devtools in chrome for data structure formatting
(defonce cljs-build-tools (devtools/install!))

;; Mount the Root UI component in the DOM div named "app"
(swap! core/app uc/mount ui/Root "app")






