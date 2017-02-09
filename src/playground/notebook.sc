val i = 10

val j = i + 3

import java.util.Date

import scala.collection.mutable

val date = new Date()

def add(word: String) : String = {
  word + " world"
}

add("hello")

// Closure: j'accède à la variable dans le constructeur
// grâce au contexte
implicit class RichString(s: String) {
  def adds() : String = s + "s"
}

val rs = new RichString("Coucou")

// Si le constructeur est val s: String
// rs.s est possible

rs.adds()

val maString = "hello world"

maString.adds()

// alt + Enter pour ajouter le type
val tuple: (Int, String, Double) = (1, "coucou", 3.5)

tuple._2

// Fonction qui retourne un tuple
def carreCube(i:Int): (Int, Int) ={
  (i*i, i*i*i)
}

val (a,b) = carreCube(10)

(a,b)._1

// mutable map

val map = mutable.Map("key1" -> "value1")

val kv = "key2" -> "value2"

map += kv

