// What's in a Name
object Puzzle19 {
  def inEcosystem(predator: String, prey: String): Unit = {
    println(s"${predator} eat ${prey}")
    /**
     * > inEcosystem("cats", "mice")
     * cats eat cats
     */
  }

  def inEcosytem(prey: String, predator: String): Unit = {
    println(s"${predator} eat ${predator}")
  }
}
