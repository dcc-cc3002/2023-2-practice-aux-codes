package aux11.solution.model.abilities

import aux11.solution.model.units.GameUnit

trait Ability {
  def cost: Int
  def name: String
  def use(from: GameUnit, to: GameUnit): Unit
}
