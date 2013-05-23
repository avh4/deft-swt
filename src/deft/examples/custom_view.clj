(ns deft.examples.custom-view
  (:use [deft core drawing])
  (:import [javax.swing JComponent])
  (:import [java.awt Dimension])
  (:gen-class))

(defn normalize-weights [seq] (map #(/ % (apply + seq)) seq))

(defn chart-values [state] (normalize-weights state))
(defn chart-colors [state] [(color-rgb 255 0 0) (color-rgb 0 0 255)
                            (color-rgb 0 255 255) (color-rgb 255 255 0)])

(defn chart-rendering [[w h] weights colors]
  (let [y 0]
    (map (fn [weight color left]
           (fill-rect [(* w (- left weight)) y (* w weight) h] color))
         weights colors (reductions + weights))
    ))

(defn BarChart [weights-fn colors-fn]
  (CustomComponent [400 200] #(chart-rendering %1 (weights-fn %2) (colors-fn %2))))

(def app
  (application "Custom View"
               [(rand-int 4) (rand-int 4) (rand-int 4) (rand-int 4)]
               (display
                 (BarChart chart-values chart-colors))))

(defn -main []
  (run app))