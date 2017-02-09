package formation_ebiznext.scala

/**
  * Case Class
  */
class Person(val name : String, val age : Int)

// Exemple du apply
//object Person {
//  def apply(name: String, age: Int) : Person = new Person("Anthony",25)
//}

case class Enfant(val name: String, val age: Int)

trait MonTrait {
  def f() = println("cookie")
}

class X {
  def g() = println("coucou")
}

object MonApplication {
  def main(args:Array[String]): Unit = {
    val person = new Person("Moi", 25)
    val person2 = new Person(person.name, 20)
    println(person.age)

    val enfant = Enfant("Ethan", 5)
    val enfant2 = enfant.copy(age=22)
    val enfant3 = enfant.copy(age=23)

    ////////////////// TRAITS //////////////////

    val xMontrait = new X with MonTrait
    xMontrait

    class Y extends X with MonTrait {
      override def f = println("coucou")
    }

    val yMontrait = new Y

    yMontrait.f

  }
}


/**
  * Si on met une case class, plus besoin de mettre le new
  *
  * Pourquoi ?
  *
  * On a un apply et un objet compagnon créé grâce au case class
  *
  * créé
  *
  * copy est uniquement dans les case class
  *
  *
  *
  * Trait vs Classe
  *
  * Une classe peut être étendue
  *
  * Un trait est une implémentation
  *
  * ex : un oiseau étend la classe être vivant et a pour trait l'implémentation de voler, etc ... (adjectifs)
  *
  * semblable à l'interface en java
  *
  *
 */