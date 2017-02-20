package coursera.Week4

/**
  * Created by Anthony on 16/02/2017.
  *
  * Array n'est pas covariant, nous avons donc une erreur à la ligne 2
  *
  * car
  *
  * Array[NonEmpty] et Array[IntSet] n'ont pas de covariance
  *
  */

//abstract class IntSet
//
//class NonEmpty extends IntSet
//
//case class Empty extends IntSet
//
//object CovarianceProblem {
//  val a: Array[NonEmpty] = Array(new NonEmpty(1, Empty, Empty))
//  val b: Array[IntSet] = a
//  b(0) = Empty
//  val s: NonEmpty = a(0)
//}
