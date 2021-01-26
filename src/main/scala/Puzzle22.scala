import java.util

import scala.collection.mutable
import scala.jdk.CollectionConverters._

object Puzzle22 {
  def javaMap: java.util.Map[String, java.lang.Integer] = {
    val map = new util.HashMap[String, java.lang.Integer]()
    map.put("key", null)
    map
  }

  val scalaMap: mutable.Map[String, Integer] = javaMap.asScala
  val scalaTypesMap: collection.Map[String, Int] = scalaMap.asInstanceOf[scala.collection.Map[String, Int]]
  println(scalaTypesMap("key") == null)
  println(scalaTypesMap("key") == 0)
}
