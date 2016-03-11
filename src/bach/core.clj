(ns bach.core
  (:require [stasis.core :as stasis]
            [clj-yaml.core :as yaml]
            [selmer.parser :as parser]))

(def target-dir "target/build")

(defn get-program-attrs [key]
  (yaml/parse-string (slurp (str "resources/data/" key ".yml"))))

(defn get-layout [key]
  (str "layouts/" key ".html"))

(defn render-page [])

(defn pages []
  {"/" (parser/render-file (get-layout "program") (get-program-attrs "wreach-out"))
   "/wot/" "<h2>test</h2>"})

(def app (stasis/serve-pages pages))

(defn export []
  (stasis/empty-directory! target-dir)
  (stasis/export-pages pages target-dir))
