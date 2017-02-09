package formation_ebiznext.scala

/**
  * Singleton et objets compagnons
  *
  *
  * /!\ apply permet d'appliquer directement
  *
  *
  *
  */
class Utils(val i: Int){
  def convert(s:String): Int = {
    s.toInt
  }
}

object Utils {
  def apply(i:Int): Utils = new Utils(i)
  def apply(s:String): Utils = new Utils(s.toInt)
}

class Other {
  def convert(s:String): Int = {
    s.toInt
  }
}

object Other extends Other



//object MonApplication {
//    println("hello world")
//
//    Other.convert("12")
//
//    val utils = new Utils(9)
//    utils.convert("9")
//    Utils(9)
//    Utils("10")
//
//    // Utils.convert("12") ne fonctionne pas sans le extends
//}

/**
  *
  * Singleton
  * Objet compagnon
  * /!\ Bien comprendre
  *
  */