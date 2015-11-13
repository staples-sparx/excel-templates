(defproject staples-sparx/excel-templates "0.4.1"
  :description "Build Excel files by combining a template with plain old data"
  :url "https://github.com/tomfaulhaber/excel-templates"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.apache.poi/poi-ooxml "3.10-FINAL"]
                 [org.apache.poi/ooxml-schemas "1.1"]
                 [org.clojure/data.zip "0.1.1" :exclusions [[org.clojure/clojure]]]
                 [clojure-csv/clojure-csv "2.0.1"]
                 [joda-time "2.7"]
                 [prismatic/schema "1.0.3"]]
  :plugins [[s3-wagon-private "1.1.2"]]
  :repositories {"releases" {:url "s3p://runa-maven/releases/"
                             :username [:env/archiva_username]
                             :passphrase [:env/archiva_passphrase]}}
  :profiles {:repl {:dependencies [[org.clojure/clojure "1.7.0"]]}})
