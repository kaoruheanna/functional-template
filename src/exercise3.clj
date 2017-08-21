(ns exercise3)

(defn fibonacci
  "Secuencia de Fibonacci"
  [x]
  (if (<= x 1)
  	x 
  	(+ (fibonacci (- x 1)) (fibonacci (- x 2)) )
  )
)




