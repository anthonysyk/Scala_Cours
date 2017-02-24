package coursera.Week5

/**
  * Created by Anthony on 23/02/2017.
  */
class ListFunctions {

  def last[T](xs: List[T]) : T = xs match {
    case List() => throw new Error("No last elements on an empty list")
    case List(x) => x
    case y :: ys => last(ys)
  }


  def init[T](xs: List[T]): List[T] = xs match {
    case List() => throw new Error("No last elements on an empty list")
    case List(x) => List(x)
    case y :: ys => y :: init(ys)
  }

  // concat

  // reverse



}
