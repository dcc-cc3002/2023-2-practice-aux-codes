package aux11.problem.controller.states.enemy

import aux11.problem.controller.states.AbstractGameState
import aux11.problem.controller.states.player

class FinalState extends AbstractGameState {
  override def doAction(): Unit = {
    if (controller.hasSpell()) {
      controller.useSpell()
    } else {
      controller.doAttack()
    }
    controller.changeState(new player.InitialState())
  }
}
