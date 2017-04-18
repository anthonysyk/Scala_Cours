package coursera_funprog01.Week4

/**
  * Created by Anthony on 20/02/2017.
  *
  *
  * case class : def apply implicit (permet de ne pas avoir à mettre le new lors de l'instanciation)
  *
  *
  * Bonne pratique :
  * - nommer les variables avec une minuscule : variable
  * - nommer les constantes avec une majuscule : Constant
  *
  *
  */

trait Expr {
  def eval: Int = this match {
    case Number(n) => n
    case Sum(e1, e2) => e1.eval + e2.eval
  }

  // Exo
  def show: String = this match {
    case Number(n) => n.toString
    case Sum(e1, e2) => s"${e1.show} + ${e2.show}"
  }
}

case class Number(n: Int) extends Expr

case class Sum(n1: Expr, n2: Number) extends Expr

object PatternMatching {

  /**
    * On peut écrire le pattern matching directement dans le trait
    */

  //  def eval(e : Expr) : Int = e match {
  //    case Number(n) => n
  //    case Sum(e1, e2) => eval(e1) + eval(e2)
  //  }

  def main(args: Array[String]): Unit = {
    val sum = Sum(Number(1), Number(2))

    println(s"sum.eval : ${sum.eval}")
    println(s"sum.show : ${sum.show}")
  }
}