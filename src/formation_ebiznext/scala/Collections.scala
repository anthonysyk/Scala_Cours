package formation_ebiznext.scala

/**
  * Collections
  */
class Collections {

  val numbers = List(1,2,3,4)

  numbers.filter (_ > 2)

  numbers.find(_ > 2) //  Some(3) /!\ option

  numbers.fold(None) (_)

}
