package bags

trait Bag[T]{
  def addItem(item: T): Unit
  def getItems: List[T]
}