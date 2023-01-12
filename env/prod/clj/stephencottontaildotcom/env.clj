(ns stephencottontaildotcom.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[stephencottontaildotcom started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[stephencottontaildotcom has shut down successfully]=-"))
   :middleware identity})
