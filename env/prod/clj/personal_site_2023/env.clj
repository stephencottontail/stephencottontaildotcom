(ns personal-site-2023.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[personal-site-2023 started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[personal-site-2023 has shut down successfully]=-"))
   :middleware identity})
