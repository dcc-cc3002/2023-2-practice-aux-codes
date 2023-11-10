package aux11.problem.controller.observers

import aux11.problem.model.units.GameUnit
import aux11.problem.model.abilities.Ability

class InfoObserver extends Observer {
  def updateAttack(from: GameUnit, to: GameUnit): Unit = {
    println(s"${from.name} attacks ${to.name}")
    println(s"${to.name} HP reduced to ${to.healthPoints}")
  }
  def updateSpell(from: GameUnit, to: GameUnit, sp: Ability): Unit = {
    println(s"${from.name} uses ${sp.name} on ${to.name}")
    println(s"${from.name} CE reduced to ${from.cursedEnergy}")
    println(s"${to.name} HP reduced to ${to.healthPoints}")
  }
}
