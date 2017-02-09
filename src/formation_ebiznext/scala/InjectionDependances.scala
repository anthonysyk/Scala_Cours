package formation_ebiznext.scala

/**
  * Injection de dépendance
  *
  * Une classe ne peux pas s'éxécuter sans une autre classe
  *
  * lorsqu'on instancie une classe, il faut lui ajouter un trait avec with
  *
  * trait Domain { def dbAccess() }
  * trait DatabaseDomain extends Domain { def dbAccess {} }
  * trait XMLDomain extends Domain { def dbAccess {} }
  *
  * class BusinessService {
  *
  * domainObject : Domain =>   // Signifie que j'ai besoin de Domain pour accéder à dbAccess()
  * def doIt() = dbAccess()
  *
  * }
  *
  * new BusinessService with DatabaseDomain
  *
  * else
  *
  * new BusinessService with XMLDomain
  *
  * Permet d'augmenter la vitesse de démarrage de l'application grâce à l'injection de dépendance
  *
  *
  */
class InjectionDependances {

}
