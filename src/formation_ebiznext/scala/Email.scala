package formation_ebiznext.scala


case class Email(name: String, domain: String) {
  override def toString(): String =
    s"$name@$domain"
}

object Main {
  def main(args: Array[String]): Unit = {
    val anyone = Email("anyone", "ebiznext.com")

    def isValidUser(email: Email): Boolean = {
      email match {
        case Email(_, "ebiznext.com") => true
        case _ => false
      }
    }

    println(isValidUser(anyone))

    val produits = Map("Orange" -> 1.2, "Pomme" -> 1.3)
    for((produit, prix) <- produits)
      println(s"Une $produit coûte $prix €")

    val list = List(1,2,3,4,5,6,7,8)

    def even(n: Int): Boolean = if(n % 2 == 0) true else false

    def f(i:Int)(s:String): String = s + i

    val y: (Int) => (String) => String = f

    def test(l: List[String], f: (String, Int) => List[Int]) = {
      l.map{ item =>
      }
    }

    val x: (String) => String = f(1)

    x("coucou")

    f(1){
      "coucou"
    }

  }


}