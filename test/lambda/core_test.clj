(ns lambda.core-test
  (:require [clojure.test :refer :all]
            [lambda.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= (numcheck(S (S n2))) 4))))
