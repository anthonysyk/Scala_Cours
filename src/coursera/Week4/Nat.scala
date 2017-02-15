package coursera.Week4

/**
  * Created by Anthony on 15/02/2017.
  */
abstract class Nat {
  def isZero: Boolean

  def predecessor: Nat

  def successor: Nat = new Succ(this)

  def +(that: Nat): Nat

  def -(that: Nat): Nat
}

object Zero extends Nat {
  def isZero = true

  override def predecessor: Nat = throw new Exception("0.predecessor")

  override def +(that: Nat) = that

  override def -(that: Nat) = that match {
    case Zero => Zero - that
    case _ => throw new Exception("negative number")
  }
}

class Succ(n: Nat) extends Nat {
  def isZero = false

  override def predecessor = n

  override def +(that: Nat) = new Succ(n + that)

  override def -(that: Nat) = that match {
    case Zero => this
    case _ => n - that.predecessor
  }
}
