(ns personal-site-2023.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [personal-site-2023.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[personal-site-2023 started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[personal-site-2023 has shut down successfully]=-"))
   :middleware wrap-dev})
