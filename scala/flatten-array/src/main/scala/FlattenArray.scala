object FlattenArray {
  def flatten(list: List[Any]): List[Any] = list match {
    case Nil => Nil
    case (head: List[Any]) :: tail => flatten(head) ::: flatten(tail)
    case head :: tail if head == null => flatten(tail)
    case head :: tail => head :: flatten(tail)
  }

  def flatten2(list: List[_]): List[_] = {
    def innerFlatten(list: List[_], acc: List[_]): List[_] = list match {
      case Nil => acc
      case ::(head: List[_], tail) => innerFlatten(tail, innerFlatten(head, acc))
      case ::(null, tail) => innerFlatten(tail)
      case ::(head, tail) => innerFlatten(tail, head :: acc)
    }

    innerFlatten(list, Nil).reverse
  }

}
