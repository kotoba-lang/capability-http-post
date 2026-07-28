(ns kotoba.capability.http.post
  "Importable contract for http/post.")

(def manifest
  {:schema "kotoba.capability.repository.v1", :capability/version 1, :capability/dependencies #{}, :capability/imports #{:http-post-headers :http-post}, :authority "kotoba-lang/kotoba-core-contracts", :capability/default-policy :approval-required, :capability/artifact {:format :wasm-component, :digest-required? true, :signature-required? true}, :capability/radicle-rid "rad:z2t8b61Lztq4wWDGLasNN1Wzqrc76", :capability/repository "kotoba-lang/capability-http-post", :capability/id "http/post", :capability/effects #{:data-egress :network-write}, :capability/provider-status :contract-only})
