(ns vigenere.core-test
  (:require [clojure.test :refer :all]
            [vigenere.core :refer :all]))

(deftest delta-test
  (testing "delta of a"
    (is (= 0 (delta \a)))))

(deftest a-test 
  (testing "a"
    (is (= \a (shift-char \a \a)))))

(deftest mapping-to-seq-of-shifts
  (testing "it should return the list of shifts to use"
    (is (= "bcdef" (shift-string "abcde" "bbbbb")))))

(deftest uncipher-test
  (testing "it should revert back the string to normal"
    (is (= "abcde" (unshift-string "bcdef" "bbbbb")))))
