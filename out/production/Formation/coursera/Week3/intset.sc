import coursera.Week3.List

/**
  * Class hierarchies
  *
  * abstract class
  *
  * override
  *
  *
  *
  */


abstract class IntSet {
  def contains(x: Int): Boolean
  def incl(x: Int): IntSet
  def union(other: IntSet): IntSet
}

class Empty extends IntSet {

  def contains(x: Int): Boolean = false

  def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)

  def union(other: IntSet) : IntSet = other

  override def toString = "."
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {

  def contains(x: Int): Boolean = {
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true
  }

  def incl(x: Int): IntSet = {
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this
  }

  def union(other: IntSet): IntSet = {
    ((left union right) union other) incl elem
  }

  override def toString = "{" + left + elem + right + "}"
}

new NonEmpty(3, new Empty, new Empty)

abstract class Base {
  def foo = 1
  def bar : Int
}

class Sub extends Base {
  override def foo = 1
  def bar = 3
}

