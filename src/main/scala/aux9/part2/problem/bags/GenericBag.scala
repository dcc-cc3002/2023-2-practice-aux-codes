package aux9.part2.problem.bags

class GenericBag[T] extends Bag[T]{
  var items: List[T] = List()
  def addItem(item: T): Unit = {
    items = item :: items
  }
  def getItems: List[T] = {
    items
  }
}
