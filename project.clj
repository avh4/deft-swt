(defproject net.avh4.clj/deft-swt "0.2.0-SNAPSHOT"
  :description "An experimental API design for functional GUI development"
  :url "http://github.com/avh4/deft-swt"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {"swt-repo" "https://swt-repo.googlecode.com/svn/repo/"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [net.avh4.clj/deft "0.2.0-SNAPSHOT"]
                 [org.eclipse.swt/org.eclipse.swt.cocoa.macosx.x86_64 "4.2.2"]]
  :profiles {
    :dev {
      :plugins [[lein-midje "3.0.0"]]
      :dependencies [[midje "1.5.0"]] }} )
