package aux9.part2.problem.bags

import aux9.part2.problem.items.Item
import aux9.part2.problem.items.potions.HpPotion
import aux9.part2.problem.items.weapons.melee.Sword
import aux9.part2.problem.items.weapons.range.Bow
import munit.FunSuite

/*
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
  test("GenericBag should be able to get a item"){
    bag.addItem(bow)
    assertEquals(bag.getItem("Bow"), Some(bow))
  }
  test("GenericBag should be able to remove a item"){
    bag.addItem(bow)
    bag.removeItem("Bow")
    assertEquals(bag.items, List())
  }
  test("GenericBag should be able to get all item"){
    bag.addItem(bow)
    bag.addItem(sword)
    bag.addItem(hpPotion)
    assertEquals(bag.getItems, List(hpPotion, sword, bow))
  }
}
*/