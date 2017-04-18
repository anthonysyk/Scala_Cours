package coursera_funprog01.Week4

/**
  * Created by Anthony on 22/02/2017.
  */
object ListDecomposition {

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
  }

  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => xs
    case y :: ys => insert(y, isort(ys))
  }

  val TestList = List(2,1,8,7)


  def main(args: Array[String]): Unit = {
    println(isort(TestList))

    println(TestList)

// Result
//    List(1, 2, 7, 8)
//    List(2, 1, 8, 7)
  }

}
