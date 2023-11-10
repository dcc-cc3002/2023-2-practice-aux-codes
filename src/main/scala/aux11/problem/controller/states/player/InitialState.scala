package aux11.problem.controller.states.player

import aux11.problem.controller.states.AbstractGameState

class InitialState extends AbstractGameState {

  override def doAction(): Unit = {
    controller.promptStart()
    controller.changeState(new UnitState())
  }

}
