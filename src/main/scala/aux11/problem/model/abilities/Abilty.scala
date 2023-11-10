package aux11.problem.model.abilities

import aux11.problem.model.units.GameUnit

trait Ability {
  def cost: Int
  def name: String
  def use(from: GameUnit, to: GameUnit): Unit
}
