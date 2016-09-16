 (ns dancer-test
   (:require [clojure.test :refer [deftest are is testing]]
             [dancer :refer [fun-times]]))

(deftest fun-times-test
  (testing "Dancing"
    (testing "with valid input."
      (is (= (fun-times "Joni") "I like your dancing Joni! Keep it going!"))
      (is (= (fun-times "Mia") "I like your dancing Mia! Keep it going!")))
    (testing "with invalid input."
      (is (= (fun-times nil) "I like your dancing ! Keep it going!")))))