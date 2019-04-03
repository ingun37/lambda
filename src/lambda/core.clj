(ns lambda.core
  (:gen-class))
(require '[uncomplicate.fluokitten.core :refer [curry]])

(defn incr [x] (+ x 1))
(defn toI [n] ((n incr) 0))
(defn toB [b] (if (= ((b 0) 1) 0) true false))

(def n0 (curry (fn [f x] x)))
(def n1 (curry (fn [f x] (f x))))
(def n2 (curry (fn [f x] (f (f x)))))
(def n3 (curry (fn [f x] (f (f (f x))))))
(def n4 (curry (fn [f x] (f (f (f (f x)))))))
(def S (curry (fn [w y x] (y ((w y) x)))));successor
(def M (curry (fn [x y z] (x (y z)))));multiply
(def T (curry (fn [a b] a)))
(def F (curry (fn [a b] b)))
(def AND (curry (fn [x y] ((x y) F))))
(def OR (curry (fn [x y] ((x T) y))))
(def NOT (curry (fn [x] ((x F) T))))
(def Z (curry (fn [x] (((x F) NOT) F))));is 0
(def pair (curry (fn [x y b] ((b x) y))))
(def pairIncr (curry (fn [p] (pair (S (p T)) (p T)))))
(def P (curry (fn [n] (((n pairIncr) (pair n0 n0)) F))));predecessor
(def GE (curry (fn [x y] (Z ((x P) y))))); greater than or equal
(def E (curry (fn [x y] (AND (GE x y) (GE y x)))));(λxy. ∧ (Z(xPy))(Z(yPx)))
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (toI n0)))
