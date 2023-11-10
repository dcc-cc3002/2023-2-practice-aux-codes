package aux9.part2.solution.bags

trait Bag[T]{
  def addItem(item: T): Unit
  def getItem(name: String): Option[T]
  def removeItem(name: String): Unit
  def getItems: List[T]
}