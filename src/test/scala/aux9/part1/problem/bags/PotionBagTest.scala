package bags

import items.potions.{Antidote, HpPotion, ManaPotion}
import munit.FunSuite

class PotionBagTest extends FunSuite{
  var bag: PotionBag = _
  val hpPotion = new HpPotion
  val manaPotion = new ManaPotion
  val antidote = new Antidote
  override def beforeEach(context: BeforeEach): Unit = {
    bag = new PotionBag
  }
  test("PotionBag should be able to add a potion"){
    bag.addItem(hpPotion)
    assertEquals(bag.items, List(hpPotion))
  }
  test("PotionBag should be able to get all potions"){
    bag.addItem(hpPotion)
    bag.addItem(manaPotion)
    bag.addItem(antidote)
    assertEquals(bag.getItems, List(antidote, manaPotion, hpPotion))
  }
}
