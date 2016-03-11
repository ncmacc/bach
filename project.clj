(defproject bach "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [optimus "0.18.4"]
                 [ring "1.4.0"]
                 [stasis "2.3.0"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler bach.core/app}
  :aliases {"build-site" ["run" "-m" "bach.core/export"]})
