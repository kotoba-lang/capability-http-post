(ns kotoba.capability.http.post-test
  (:require [clojure.test :refer [deftest is]]
            [kotoba.capability.http.post :as capability]
            [kotoba.core.capability-repository :as repository]))

(deftest manifest-conforms
  (is (= [] (repository/validate-manifest capability/manifest))))
