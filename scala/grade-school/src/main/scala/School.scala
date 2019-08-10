import scala.collection.immutable.TreeMap

class School {
  type DB = Map[Int, Seq[String]]
  private var data: DB = TreeMap[Int, Seq[String]]()

  def add(name: String, g: Int): Unit = {
    val updatedValuesForKey = data.get(g).map(seq => seq :+ name).getOrElse(Seq(name))
    data = data.+(g -> updatedValuesForKey)
  }

  def db: DB = data

  def grade(g: Int): Seq[String] = data.getOrElse(g, Nil)

  def sorted: DB = data.mapValues(_.sorted)

}
