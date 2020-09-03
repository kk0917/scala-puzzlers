object Greeting {
  def greet(name: String): Unit = {
    println(s"Hello, world! I'm $name")
  }
}

object NameContainer {
  var name = ""
}