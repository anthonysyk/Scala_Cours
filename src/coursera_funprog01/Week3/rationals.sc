/**
  * Functions and Data
  *
  * Un nouveau type que nous pouvons utiliser : Rational
  *
  * Utilisation de :
  *
  * - this
  * - require ==> plutot une précondition
  * - assert ==> plutot pour checker le code
  * - constructeur primaire avec def this(x: Int) = this(x,1)
  *
  *
  * Infix : on écrit les méthodes comme ça : x.max(y) en x max y
  *
  * On peut utiliser des opérateurs comme identifiers (< pour less, + pour add, - pour sub)
  *
  */

case class Rational(x: Int, y: Int){

  require( y != 0, "denominator must be over 0")

  def this(x: Int) = this(x,1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else (gcd(b, a % b))

  def numer = x
  def denom = y

  def < (that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if(this < (that)) that else this

  def +(that: Rational) = {
    Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  }

  def neg : Rational = Rational(-numer, denom)

  def -(that: Rational) = this +  that.neg

  override def toString = {
    val g = gcd(numer,denom)
    (numer / g) + "/" + (denom / g)
  }
}

val x = Rational(1,3)
val y = Rational(5,7)
val z = Rational(3,2)

x.toString
x.numer
x.denom

x + y

x - y - z

x - y

x < y

y.max(x)

Rational(1,0)



