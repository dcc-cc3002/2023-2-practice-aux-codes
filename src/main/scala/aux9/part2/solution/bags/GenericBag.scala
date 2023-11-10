package aux9.part2.solution.bags

import aux9.part2.solution.items.Item

class GenericBag[T <: Item] extends Bag[T]{
  var items: List[T] = List()
  def addItem(weapon: T): Unit = {
    items = weapon :: items
  }
  def getItem(name: String): Option[T] = {
    items.find(_.name == name)
  }
  def removeItem(name: String): Unit = {
    items = items.filter(_.name != name)
  }
  def getItems: List[T] = {
    items
  }
}
