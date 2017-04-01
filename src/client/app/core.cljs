(ns app.core
  (:require [untangled.client.core :as uc]))

; The application itself, create, and store in an atom for a later DOM
; mount and dev mode debug analysis of the application
; The initial state is the starting data for the entire UI
; see dev/client/user.cljs for the actual DOM mount
(defonce app (atom (uc/new-untangled-client)))

; Notice that making the application is a single line of code.
; then create the base UI in src/client/app/ui.cljs

