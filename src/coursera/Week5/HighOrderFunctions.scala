package coursera.Week5

/**
  * Created by Anthony on 11/04/2017.
  */
class HighOrderFunctions {

  val nums = List(2, -4, 3, 5, -2)

  // Appliquer une opération sur chaque élément d'une liste
  def squareList(list: List[Double], factor: Double): List[Double] = list match {
    case Nil => list;
    case y :: ys => (y * factor) :: squareList(ys, factor)
  }

  // en utilisant un map
  def squareListWithMap(list: List[Double], factor: Double): List[Double] = list.map(_ * factor)

  // Filtrer une liste
  def posElems(list: List[Double]): List[Double] = list match {
    case Nil => list
    case y :: ys => if(y > 0) y :: posElems(ys) else posElems(ys)
  }

  // en utilisant un filter
  def posElemsWithFilter(list: List[Double]) = list.filter(_ > 0)

  // Autres fonctions :

  nums filter (_ > 0)
  nums filterNot (_ > 0)
  nums partition (_ > 0)

  nums takeWhile (_ > 0) // retourne les premiers éléments qui valident la condition jusqu'à false
  nums dropWhile (_ > 0) // inverse de takewhile (retourne tout ce que takeWhile ne retourne pas
  nums span (_ > 0) // retourne la combinaison de takeWhile et dropWhile

  // Exercice :

  val data = List("a", "a", "a", "a", "b", "c", "c", "a")

  def pack[T](list: List[T]): List[List[T]] = list match  {
    case Nil => Nil
    case y :: ys =>

  }

  def encode[T](list: List[T]): List[(T,Int)] = pack(list).map(ys => (ys.head, ys.length))
}