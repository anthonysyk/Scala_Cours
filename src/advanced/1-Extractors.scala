package advanced

import advanced.Extractors.Category

/**
  * Created by Anthony on 17/03/2017.
  */
class Extractors {

  trait User{
    def name: String
    def rating: Int
  }

  class FreeUser(val name: String, val rating: Int) extends User

  class PremiumUser(val name: String, val rating: Int) extends User

  object FreeUser {
    def unapply(user: User): Boolean = user.rating > 7
  }

  object PremiumUser {
    def unapply(user: User): Option[(String, Int)] = {
      if (user.rating < 5) Some(Category.newbie, scala.util.Random.nextInt(user.rating))
      else if (user.rating > 5 && user.rating < 8) Some(Category.advanced, scala.util.Random.nextInt(user.rating))
      else if (user.rating > 8) Some(Category.veteran, scala.util.Random.nextInt(user.rating))
      else None
    }
  }

  def sendMail(user: User): Unit = user match {
    case user @ FreeUser() =>  println(s"Sending Invitation Email to ${user.name}")
    case PremiumUser(category, mailNumber) => println(s"Sending $category Email number $mailNumber")
  }

}

object Extractors {

  object Category {
    val newbie = "Newbie"
    val advanced = "Advanced"
    val veteran = "Veteran"
  }

}
