(ns noises.core
  (:require [reagent.core :as r]))

(defn app []
  [:div.container
   [:h1 "hello world"]])

(defn ^:export main []
  (r/render
   [app]
   (.getElementById js/document "app")))
