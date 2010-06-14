
(ns ch4.declarations
  (:use ch4.scheme-helpers
        ch4.predicates))

(defn make-begin [xs] (cons 'begin xs))

(defn sequence->exp [xs]
  (cond (null? xs) xs
        (last-exp? xs) (first-exp xs)
        :else (make-begin xs)))

