package aux9.part1.solution.bags

class GenericBag[T] extends Bag[T]{
  private var items: List[T] = List()
  def addItem(item: T): Unit = {
    items = item :: items
  }
  def getItems: List[T] = {
    items
  }
}
