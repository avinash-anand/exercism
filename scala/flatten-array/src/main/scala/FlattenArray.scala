object FlattenArray {
  def flatten(list: List[Any]): List[Any] = list match {
    case Nil => Nil
    case (head: List[Any]) :: tail => flatten(head) ::: flatten(tail)
    case head :: tail if head == null => flatten(tail)
    case head :: tail => head :: flatten(tail)
  }

}
