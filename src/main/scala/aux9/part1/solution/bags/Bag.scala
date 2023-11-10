package aux9.part1.solution.bags

trait Bag[T]{
  def addItem(item: T): Unit
  def getItems: List[T]
}