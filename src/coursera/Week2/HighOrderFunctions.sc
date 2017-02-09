/**
  * High order functions
  *
  * ce sont des fonctions qui prennent en paramètres d'autres fonctions
  *
  * Tail Rec :
  *
  * 1) trouver la condition d'arrêt
  *
  */


//  def sum(f: Int => Int, x: Int, y: Int): Int = {
//    if (x < y) 0 else sum(f, x + 1, y)
//  }

  // Exercice :

def sum(f: Int => Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a + 1, f(a) + acc)
  }
  loop(a, 0)
}
sum(x => x * x)(3, 5)


def sumInts(a: Int, b: Int) = sum(x => x)(a,b)
sumInts(1,2)

def sumCubes(a: Int, b: Int) = sum(x => x * x * x)(a,b)
sumCubes(2,10)

//def sumFactorials(a: Int, b: Int) = sum(fact)(a,b)
def fact(x: Int): Int = {
  if (x == 1) 1 else x * fact(x - 1)
}

def factTailRec(x: Int): Int = {
  def loop(number: Int, acc: Int): Int = {
    if (number == 1) acc
    else loop(number - 1, number * acc)
  }
  loop(x, 1)
}

fact(5)

factTailRec(5)


