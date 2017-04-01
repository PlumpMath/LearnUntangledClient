(defproject client-demo "1.0.0" 
  :description "Untangled Client Quickstart" 
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.229"]
                 [org.omcljs/om "1.0.0-alpha46"]
                 [navis/untangled-client "0.5.6"]]

  ; needed or compiled js file won't get cleaned
  :clean-target ^{:protect false} ["resources/public/js/compiled" "target" "i18n/out"]

  ; needed for macros and our recommended figwheel setup
  :source-paths ["dev/server" "src/client"]

  :cljsbuild {:builds [{:id    "dev"
                        :source-paths  ["dev/client" "src/client"]
                        :figwheel  true
                        :compiler  {:main    "cljs.user"
                                         :asset-path  "js/compiled/dev"
                                         :output-to  "resources/public/js/compiled/app.js"
                                         :output-dir  "resources/public/js/compiled/dev"
                                         :recompile-dependents true
                                         :optimizations  :none}}]}

  ; figwheel dependency and chrome data structure formatting tools
  :profiles {:dev {:dependencies [[figwheel-sidecar "0.5.7"]
                                  [binaryage/devtools "0.6.1"]]}})



