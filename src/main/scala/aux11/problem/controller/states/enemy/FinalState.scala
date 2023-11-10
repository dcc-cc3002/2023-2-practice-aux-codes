package aux11.solution.controller.states.enemy

import aux11.solution.controller.states.AbstractGameState
import aux11.solution.controller.states.player

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
