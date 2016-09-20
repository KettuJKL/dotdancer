 (ns dancer)

 (defn fun-times
   ([] (str "Look at me dancing!"))
   ([name]
    (str "I like your dancing " name "! Keep it going!")))

 (defn start []
   (do
     (println (fun-times "Joni"))
     (println "Look at my moves!")))

 (start)