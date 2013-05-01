(ns vigenere.core)

(defn delta 
  [x]
  (- (int x) (int \a)))

(defn shift-op [op msg pwd]
  (char
    (+ (int \a)
       (mod (op (delta msg)
                (delta pwd))
            26))))

(defn shift-char
  [msg pwd]
  (shift-op + msg pwd))

(defn unshift-char
  [msg pwd]
  (shift-op - msg pwd))

(defn shift-string
  [msg pwd]
  (apply str (map shift-char msg pwd)))

(defn unshift-string
  [msg pwd]
  (apply str (map unshift-char msg pwd)))
