package coursera.Week5

/**
  * Created by Anthony on 24/02/2017.
  *
  * - rendre générique cette fonction msort
  * - use of implicit
  *
  */
class Tuples {

  // Merge Sort
  def msort[T](xs: List[T])(implicit lt: (T, T) => Boolean): List[T] = {
    val n = xs.length/2
    if (n == 0) xs
    else {
      val (fst, snd) = xs splitAt n
      merge(msort(fst), msort(snd))
    }

  }


  def merge[T](xs: List[T], ys: List[T])(implicit lt: (T, T) => Boolean): List[T] = (xs, ys) match {
      case (List(), ys) => ys
      case (xs, List()) => xs
      case (List(), List()) => List()
      case (x :: xs1, y :: ys1) =>
        if (lt == true)
          x :: merge(xs1, ys)
        else
          y :: merge(xs, ys1)
    }

  val nums = List(2, -4, 5, 7, 1)
  msort(nums)((x: Int, y: Int) => x < y)

  val fruits = List("apple", "pineapple", "banana", "orange")
  msort(fruits)((x: String, y: String) => x.length < y.length)

  // Here we can use msort() without specifying the implicits
}


