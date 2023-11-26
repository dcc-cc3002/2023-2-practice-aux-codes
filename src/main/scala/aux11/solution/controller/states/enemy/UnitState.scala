package aux11.solution.controller.states.enemy

import aux11.solution.controller.states.AbstractGameState
import scala.util.Random

class UnitState extends AbstractGameState {

  override def doAction(): Unit = {
    val random = new Random()
    var id = random.nextInt(controller.enemiesLength())
    controller.selectEnemy(id)
    while(!controller.selected.isAlive) {
      id = random.nextInt(controller.enemiesLength())
      controller.selectEnemy(id)
    }
    controller.changeState(new ActionState(random))
  }

} 
