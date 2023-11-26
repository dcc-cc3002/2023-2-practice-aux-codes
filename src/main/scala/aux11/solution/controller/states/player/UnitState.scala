package aux11.solution.controller.states.player

import aux11.solution.controller.states.AbstractGameState

class UnitState extends AbstractGameState {
  
  override def doAction() = {
    controller.promptAllies()
    val id = controller.getInput()
    if (0 < id && id <= controller.alliesLength()) {
      controller.selectAlly(id-1)
      controller.changeState(new ActionState())
    } else {
      controller.promptError(id)
    }
  }

}
