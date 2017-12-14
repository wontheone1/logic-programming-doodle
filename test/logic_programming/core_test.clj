(ns logic-programming.core-test
  (:require [midje.sweet :refer :all]
            [logic-programming.core :as core]
            [clojure.core.logic :as log]))

(fact
  "ex1"
  (log/run* [q]
            (log/== q true))
  => [true])

(fact
  "ex2"
  (log/run* [q]
            (log/membero q [1 2 3])
            (log/membero q [2 3 4]))
  => [2 3])

(fact
  "ex3"
  (log/run* [query-variable]
            (log/== 1 1))
  => '[_0])

(fact
  "ex4"
  (log/run* [query-variable]
            (log/!= query-variable 1))
  => '((_0 :- (!= (_0 1)))))
