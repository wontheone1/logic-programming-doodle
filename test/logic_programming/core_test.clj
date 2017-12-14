(ns logic-programming.core-test
  (:require [midje.sweet :refer :all]
            [logic-programming.core :as core]
            [clojure.core.logic :as log]))

(fact
  "ex1"
  (log/run* [q]
            (log/== q true)) => [true])
