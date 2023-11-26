package aux11.solution.controller.states.player

import aux11.solution.controller.states.AbstractGameState
import aux11.solution.controller.states.enemy

class FinalState extends AbstractGameState {
  override def doAction(): Unit = {
    if (controller.hasSpell()) {
      controller.useSpell()
    }  else {
      controller.doAttack()
    } 
    controller.changeState(new enemy.UnitState())
  }
}
