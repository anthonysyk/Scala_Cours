import scala.concurrent.duration.Duration

object PartialFunctions {

  val f: String => String = { case "ping" => "pong" }

  f("ping")

  f("error")


}

def pretify(x: Int) = {
    if (x < 24) {
      s"Il y a $x heures"
    } else if (x % 24 == 0) {
      s"Il y a ${x / 24} jours"
    } else s"Il y a ${x / 24 + 1} jours"
  }

pretify(721)