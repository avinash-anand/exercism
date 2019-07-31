import java.util.Objects.isNull

class Robot {

  private var robotName: String = _

  def name: String = {
    if (isNull(robotName)) {
      robotName = RobotNameCache.getNextName
    }
    robotName
  }

  def reset(): Unit = robotName = null

}
