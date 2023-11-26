package aux11.solution.controller.observers

import aux11.solution.model.abilities.Ability
import aux11.solution.model.units.GameUnit

trait Observer {
  def updateAttack(from: GameUnit, to: GameUnit): Unit
  def updateSpell(from: GameUnit, to: GameUnit, sp: Ability): Unit
}
