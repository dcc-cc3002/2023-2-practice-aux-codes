package aux9.part1.problem.items.weapons.range

abstract class AbstractRange extends RangeWeapon{

  def play: Unit = println("Attacking with " + name)

  def especialAttack: Unit = println("Especial Ranged Attack")
}
