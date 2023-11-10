package aux11.problem.controller.observers

import aux11.problem.model.abilities.Ability
import aux11.problem.model.units.GameUnit

trait Observer {
  def updateAttack(from: GameUnit, to: GameUnit): Unit
  def updateSpell(from: GameUnit, to: GameUnit, sp: Ability): Unit
}
