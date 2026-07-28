(ns kotoba.capability.http.post
  "Importable contract for http/post."
  (:require [kotoba.core.capability-repository :as repository]))

(def manifest
  (repository/repository-manifest "http/post"))
