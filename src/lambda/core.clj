(ns lambda.core
  (:gen-class))
(require '[uncomplicate.fluokitten.core :refer [curry]])

(defn incr [x] (+ x 1))
(defn numcheck [n] ((n incr) 0))
(defn boolcheck [b] (if (= ((b 0) 1) 0) true false))

(def n0 (curry (fn [f x] x)))
(def n1 (curry (fn [f x] (f x))))
(def n2 (curry (fn [f x] (f (f x)))))
(def n3 (curry (fn [f x] (f (f (f x))))))
(def n4 (curry (fn [f x] (f (f (f (f x)))))))
(def S (curry (fn [w y x] (y ((w y) x)))))
(def M (curry (fn [x y z] (x (y z)))))
(def T (curry (fn [a b] a)))
(def F (curry (fn [a b] b)))
(def AND (curry (fn [x y] ((x y) F))))
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (numcheck n0)))
