package bags

import items.Item
import items.potions.HpPotion
import items.weapons.melee.Sword
import items.weapons.range.Bow
import munit.FunSuite

class GenericBagTest extends FunSuite{
  var bag: GenericBag[Item] = _
  val bow = new Bow
  val sword = new Sword
  val hpPotion = new HpPotion
  override def beforeEach(context: BeforeEach): Unit = {
    bag = new GenericBag[Item]
  }
  test("GenericBag should be able to add a item"){
    bag.addItem(bow)
    assertEquals(bag.items, List(bow))
  }
  test("GenericBag should be able to get all item"){
    bag.addItem(bow)
    bag.addItem(sword)
    bag.addItem(hpPotion)
    assertEquals(bag.getItems, List(hpPotion, sword, bow))
  }
}
