package aux11.solution.controller.states.player

import aux11.solution.controller.states.AbstractGameState

class InitialState extends AbstractGameState {

  override def doAction(): Unit = {
    controller.promptStart()
    controller.changeState(new UnitState())
  }

}
