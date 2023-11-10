package aux9.part2.solution

import bags.{GenericBag, PotionBag, WeaponBag}
import items.Item
import items.weapons.Weapon
import items.weapons.melee.{Halberd, MeleeWeapon, Sword}
import items.weapons.range.Bow

object Main {
  def main(args: Array[String]): Unit = {
    val weaponBag = new WeaponBag[Weapon]()
    val genericBag = new GenericBag[Item]()
    val sword = new Sword
    val halberd = new Halberd
    val bow = new Bow
    weaponBag.addItem(sword)
    weaponBag.addItem(halberd)
    genericBag.addItem(bow)
    genericBag.addItem(sword)
    genericBag.addItem(halberd)
    for (item <- genericBag.getItems) {
      item.play
      // item.especialAttack // This line will not compile
    }
    for (weapon <- weaponBag.getItems) {
      weapon.especialAttack
    }
  }
}
