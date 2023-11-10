package aux9.part1.solution.items.weapons.melee

abstract class AbstractMelee extends MeleeWeapon{
  val name: String

  def play: Unit = println("Swing " + name)

  def especialAttack: Unit = println("Especial Melee Attack")
}
