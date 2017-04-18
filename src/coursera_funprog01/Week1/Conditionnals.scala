package coursera_funprog01.Week1

/**
  * Conditions if else
  *
  * Booleans : Shortcuts
  *
  * Value Definitions : val vs def
  *
  * def est "by-name"
  *
  * val est "by-value"
  *
  */
class Conditionnals {

  /**   Boolean shortcuts
    *
    *   val e : Boolean = true
    *
    *   true || e = true (e n'est pas évalué)
    *
    *   false || e = e
    *
    *   true && e = e
    *
    *   false && e = false (e n'est pas évalué)
    *
    */


  // Value Definition (evaluation rules)

  val callByValue = Utils.square(2) // 4 cad "by-value"

  def callByName = Utils.square(2) // square(2) cad "by-name"

    // Exemple
  def loopy: Boolean = loopy

  val NOK = loopy // NOK (infinite loop)
  def OK = loopy // OK

  // Exercice

  def and(x: Boolean, y: Boolean) = if(x) y else false // les deux paramèters sont des call-by-value

  and(false, loopy) // Infinite loop

  def andWithoutLoop(x: Boolean, y : => Boolean) = if(x) y else false // On passe y en call-by-name parameter

  and(false, loopy) // Works !! :)

}

object Utils {
  def square(x: Int) : Int = {
    x*x
  }
}


