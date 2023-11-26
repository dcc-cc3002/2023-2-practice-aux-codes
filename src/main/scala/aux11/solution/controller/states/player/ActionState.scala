package aux11.solution.controller.states.player

import aux11.solution.controller.states.AbstractGameState

class ActionState extends AbstractGameState {
  override def doAction(): Unit = {
    controller.promptActions()
    val id: Int = controller.getInput() 
    id match {
      case 0 => controller.changeState(new UnitState())
      case 1 => controller.changeState(new TargetState())
      case 2 => 
      {
        if (controller.selected.canUseSpell())
          controller.changeState(new SpellState())
        else
          controller.promptNoEnergy()
      }
      case _ => controller.promptError(id)
    }
  }
}
