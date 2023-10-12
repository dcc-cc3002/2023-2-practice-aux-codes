package aux9.part1.problem.items.weapons.melee

abstract class AbstractMelee extends MeleeWeapon{
  val name: String

  def play: Unit = println("Swing " + name)

  def especialAttack: Unit = println("Especial Melee Attack")
}
