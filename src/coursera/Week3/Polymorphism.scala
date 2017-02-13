package coursera.Week3

/**
  * Created by Anthony on 09/02/2017.
  *
  * instancier une val dans les paramètres de la classe
  *
  * Rappel :
  *
  * - val est instancié quand l'objet de la classe est instancié
  * - def est instancié quand il est appelé
  *
  * Il existe donc 2 types de polymophism :
  *
  * - subtypes : List a deux sous-types : Nil et Cons ==> Polymorphism des classes
  * - generics : Une fonction qui prend en paramètres plusieurs types ==> Polymorphism des paramètres des fonctions
  *
  */

trait List[T] {
  def isEmpty : Boolean
  def head: T
  def tail: List[T]
}

case class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  override def isEmpty = false
}

case class Nil[T]() extends List[T] {
  override def isEmpty = true
  override def head = throw new NoSuchElementException("Nil.head")
  override def tail = throw new NoSuchElementException("Nil.tail")
}


object Main {


  def nth[T](n : Int, list: List[T]): T = {
    if (list.isEmpty) throw new IndexOutOfBoundsException()
    else if (n == 0) list.head
    else nth(n - 1, list.tail)
  }

  def main(args: Array[String]): Unit = {
    val myList = Cons(1,Cons(2, Cons(3, Nil())))

    println(nth(1, myList))
  }


}