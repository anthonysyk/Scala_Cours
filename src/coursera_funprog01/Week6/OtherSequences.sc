import scala.collection.immutable.Seq
// Vectors

val nums = Vector(18, 22, 33, -88)
val names = Vector("Bob", "James", "Peter")

nums :+ List(0, 1, 2)

nums +: List(0, 1, 2)


// Iterable parent type of Set, Map, Seq


// Ranges

val rangeTo: Range = 0 to 5
val rangeUntil: Range = 0 until 5
val rangeBy: Range = 0 to 5 by 2

// Functions
val helloWorld: String = "Hello World!"

// exists
helloWorld exists (c => c.isUpper)

// forall
helloWorld forall (c => c.isUpper)

// zip and unzip
val pairs = List(1,2,3) zip helloWorld
pairs.unzip

// flatMap
helloWorld flatMap (c => List(".", c))

// sum and max
nums.sum
nums.max

def isPrime(n: Int) = (2 until n) forall (d => n % d != 0)

isPrime(25)

def isPrimeMyVersion(n: Int) = {
  val oneToN: Seq[Int] = 2 until n
  val dividableBy: Seq[Int] = oneToN.filter(d => n%d == 0)

  (dividableBy.isEmpty, dividableBy)
}

isPrimeMyVersion(25)

// Sets : pas d'ordre ni de duplicate

Set(1,2,3,4,4).contains(2)

