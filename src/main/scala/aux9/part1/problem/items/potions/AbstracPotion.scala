package items.potions

abstract class AbstracPotion extends Potion{
  def play: Unit = println("You drink the potion" + name)
}
