package coursera.Week5

/**
  * Created by Anthony on 24/02/2017.
  */
class Tuples {

  // Merge Sort
  def msort(xs: List[Int]): List[Int] = {
    val n = xs.length/2
    if (n == 0) xs
    else {
      val (fst, snd) = xs splitAt n
      merge(msort(fst), msort(snd))
    }

  }


  def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {
      case (List(), ys) => ys
      case (xs, List()) => xs
      case (List(), List()) => List()
      case (x :: xs1, y :: ys1) =>
        if (x < y)  x :: merge(xs1, ys)
        else y :: merge(xs, ys1)
    }
}
