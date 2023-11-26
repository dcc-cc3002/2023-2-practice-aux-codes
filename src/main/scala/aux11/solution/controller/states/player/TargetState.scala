package aux11.solution.controller.states.player

import aux11.solution.controller.states.AbstractGameState


class TargetState extends AbstractGameState {
  override def doAction(): Unit = {
    controller.promptEnemies()
    val id: Int = controller.getInput()
    if (0 < id && id <= controller.enemiesLength()) {
      controller.selectAllyTarget(id-1)
      controller.changeState(new FinalState())
    } else {
      controller.promptError(id)
    }
  }
}
