package aux11.solution.controller.states.player

import aux11.solution.controller.states.AbstractGameState

class SpellState extends AbstractGameState {
  override def doAction(): Unit = {
    val spells = controller.selected.spells()
    controller.promptSpells(spells)
    val id = controller.getInput()
    if (0 < id && id <= spells.length) {
      val sp = spells(id-1)
      if (controller.selected.canUse(sp))
      {
        controller.spell = spells(id-1)
        controller.changeState(new TargetState())
      } else {
        controller.promptNoEnergy()
      }
    } else {
      controller.promptError(id)
    }
  }

}
