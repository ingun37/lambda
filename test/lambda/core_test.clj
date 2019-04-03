(ns lambda.core-test
  (:use [clojure.repl :only (source)])
  (:require [clojure.test :refer :all]
            [lambda.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
           (is (= (numcheck n0) 0))
           (is (= (numcheck n1) 1))
           (is (= (numcheck (S n3)) 4))
           (is (= (numcheck (n4 S n2)) 6))
           (is (= (numcheck (M n3 n2)) 6))
           (is (= (boolcheck F) false))
           (is (= (boolcheck (AND T T)) true))
           (is (= (boolcheck (AND T F)) false))
           (is (= (boolcheck (OR F T)) true))
           (is (= (boolcheck (OR F F)) false))
;    (is (= (numcheck(S (S n2))) 4))
;    (is (= (numcheck(n4 S n2)) 6))
    ;(is (= (numcheck(M n3 n2)) 6))
  )
)
