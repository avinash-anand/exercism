class Clock(val hour: Int, val minute: Int) {

  def +(clock: Clock): Clock = ???

  def -(clock: Clock): Clock = ???

}

object Clock {
  def apply(minute: Int): Clock = new Clock(0, minute)

  def apply(hour: Int, minute: Int): Clock = new Clock(hour, minute)
}
