(ns stephencottontaildotcom.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [stephencottontaildotcom.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[stephencottontaildotcom started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[stephencottontaildotcom has shut down successfully]=-"))
   :middleware wrap-dev})
