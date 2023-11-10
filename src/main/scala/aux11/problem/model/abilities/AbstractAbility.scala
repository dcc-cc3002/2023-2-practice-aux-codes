package aux11.solution.model.abilities

import aux11.solution.model.units.GameUnit

abstract class DamageAbility(
    val cost: Int,
    val name: String,
    private val damage: Int
) extends Ability {

  def use(from: GameUnit, to: GameUnit): Unit = {
    from.cursedEnergy -= cost
    to.healthPoints -= damage
  }

}
