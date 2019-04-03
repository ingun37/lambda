(ns lambda.core
  (:gen-class))
(require '[uncomplicate.fluokitten.core :refer [curry]])

(defn incr [x] (+ x 1))
(defn numcheck [n] ((n incr) 0))


(def n0 (curry (fn [f x] x)))
(def n1 (curry (fn [f x] (f x))))
(def n2 (curry (fn [f x] (f (f x)))))
(def n3 (curry (fn [f x] (f (f (f x))))))
(def n4 (curry (fn [f x] (f (f (f (f x)))))))
(def S (curry (fn [w y x] (y (w y x)))))
(def M (curry (fn [x y z] (x (y z)))))
;(defn M [x y] (fn [z] (x (y z))))
;
;(defn T [a b] a)
;(defn F [a b] b)
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (numcheck n0)))
