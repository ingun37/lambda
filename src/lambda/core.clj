(ns lambda.core
  (:gen-class))

(defn incr [x] (+ x 1))
(defn numcheck [n] (n incr 0))

(defn n0 [f x] x)
(defn n1 [f x] (f x))
(defn n2 [f x] (f (f x)))
(defn S [w] (fn [y x] (y (w y x))))
(defn T [a b] a)
(defn F [a b] b)
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (numcheck (S n2))))
