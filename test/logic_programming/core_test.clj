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
