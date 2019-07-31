import scala.collection.mutable

object RobotNameCache {
  var names: mutable.Set[String] = mutable.Set[String]()

  def getNextName: String = {
    var name = RobotNameFactory.getName
    while (!names.add(name)) {
      name = RobotNameFactory.getName
    }
    name
  }

}
