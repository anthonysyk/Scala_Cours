/**
  * Currying
  *
  * fonction qui retourne une autre fonction
  *
  * list.foreach(println)
  *
  *
 */

def product(f: Int => Int)(a: Int, b: Int) : Int = {
  if (a > b) 1 else f(a) * product(f)(a + 1, b)
}


def sum(f: Int => Int)(a: Int, b: Int) : Int = {
  if (a > b) 0 else f(a) + sum(f)(a + 1, b)
}

sum(Int=>Int)(1,4)

product(Int => Int * Int)(3,4)


def fact(n: Int) : Int = product(Int => Int)(1, n)

fact(5)


def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int) : Int = {
  if (a > b) zero
  else combine(f(a), mapReduce(f, combine, zero)(a+1, b))
}

def productMapReduce(f: Int => Int)(a: Int, b: Int) : Int ={
  mapReduce(f, (x,y) => x * y, 1)(a,b)
}

def sumMapReduce(f: Int => Int)(a: Int, b: Int) : Int ={
  mapReduce(f, (x,y) => x + y, 0)(a,b)
}

productMapReduce(Int => Int * Int)(3,4)

sumMapReduce(Int => Int)(1,4)

