(ns bach.core
  (:require [stasis.core :as stasis]))

(def target-dir "target/build")

(def pages
  {"/" "<h1>Welcome</h1>"
   "/wot/" "<h2>test</h2>"})

(def app (stasis/serve-pages pages))

(defn export []
  (stasis/empty-directory! target-dir)
  (stasis/export-pages pages target-dir))
