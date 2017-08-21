(ns exercise2)

(defn only-greater-than-five
	"Filtra la lista"
  	[listToFilter]
  	(filter (fn [v] (> v 5)) listToFilter)
)




