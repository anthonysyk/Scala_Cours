package coursera_funprog01.Week6

/**
  * Created by Anthony on 14/04/2017.
  */
object Nqueens {
  def queens(n: Int): Set[List[Int]] = {
    def placeQueens(k: Int): Set[List[Int]] = {
      if (k == 0) Set(List())
      for {
        queens <- placeQueens(k - 1)
        col <- 0 until n
        if isSafe(col, queens)
      } yield col :: queens

        placeQueens(n)

    }
  }

  def isSafe(col: Int, queens: List[Int]) = {
    val row = queens.length
    val queensWithRow = (row - 1 to 0 by -1) zip queens
    queensWithRow forall {
      case(r, c) => col != c && math.abs(col - c) != row - r
    }
  }
}
