 (ns Dancer)

 (defn fun-times [name]
   (println (str "I like your dancing " name "! Keep it going!")))

 (defn start []
   (do
     (fun-times "Joni")
     (println "Look at my moves!")))

 (start)