package playground

import formation_ebiznext.scala.Person

/**
  * Created by Anthony on 01/03/2017.
  */
object Extractor {

  def identify(person: Person) = person match {
    case PersonNameVerification(name) => name
    case _ => throw new Exception("pegi 18")
  }

  object PersonNameVerification {
    def unapply(person: Person): Option[String] = {
      if (person.age > 18) Some(person.name)
      else None
    }
  }

//  def isUnknown(person: Person): Person = {
//    case unknown @ IsUnknown() => unknown
//    case _ =>  throw new Exception("identified")
//  }

  object IsUnknown {
    def unapply(person: Person): Boolean = if (person.name == "John Doe") false else true
  }

//  def searchRecommandation(jobId: String): Future[RecommendationResult] = withSearchApiTimer {
//    val response = wsClient
//      .url(s"$searchJobsEndpoint/$jobId/recommendations")
//      .get()
//
//    response.map { response =>
//      response match {
//        case RecommendationResultResponse(r) => r
//        case _ =>
//          Logger.error(s"Search with error jobId=$jobId, ${StringUtils.strip(response.body.replace("\n", ""), 20)}")
//          throw new IllegalStateException(s"illegal status code received from search-api (jobs-recommendations) : ${response.status}, ${response.body}")
//      }
//    }
//  }
//
//  private object RecommendationResultResponse {
//    def unapply(response: WSResponse): Option[RecommendationResult] = {
//      if (response.status == Status.OK) Some(response.json.as[RecommendationResult])
//      else None
//    }
//  }

}
