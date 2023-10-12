package bags

import items.weapons.melee.{Halberd, Sword}
import items.weapons.range.Bow
import munit.FunSuite

class WeaponBagTest extends FunSuite{
  var bag: WeaponBag = _
  val sword = new Sword
  val halberd = new Halberd
  val bow = new Bow
  override def beforeEach(context: BeforeEach): Unit = {
    bag = new WeaponBag
  }
  test("WeaponBag should be able to add a weapon"){
    bag.addItem(sword)
    assertEquals(bag.items, List(sword))
  }
  test("WeaponBag should be able to get all weapons"){
    bag.addItem(sword)
    bag.addItem(halberd)
    bag.addItem(bow)
    assertEquals(bag.getItems, List(bow, halberd, sword))
  }
}

