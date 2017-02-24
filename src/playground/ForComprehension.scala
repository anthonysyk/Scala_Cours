package playground

import scala.concurrent.Future

/**
  * Created by Anthony on 23/02/2017.
  *
  *
  * Utiliser des futures pour les traitements longs
  *
  * Instancier les futures à l'extérieur du for comprehension pour paralleliser le traitement (pas séquentiel)
  *
  * For Comprehension c'est comme un flatMap
  *
  */
object ForComprehension {


  def kjExemple = {

    val token: Future[Option[String]] = Future.successful(Some("randomToken"))

    token.flatMap {
      case Some(token) => {
        val futureAccount: Future[Option[String]] = Future.successful(Some("account"))

        for {
          maybeAccount <- futureAccount
          result <- maybeAccount match {
            case Some(_) => Future.successful(true)
            case None => Future.successful(false)
          }
        } yield result
      }
      case None => Future.successful(false)
    }
  }

}



