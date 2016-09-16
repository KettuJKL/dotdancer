 (ns dancer)

 (defn fun-times [name]
   (str "I like your dancing " name "! Keep it going!"))

 (defn start []
   (do
     (println (fun-times "Joni"))
     (println "Look at my moves!")))

 (start)