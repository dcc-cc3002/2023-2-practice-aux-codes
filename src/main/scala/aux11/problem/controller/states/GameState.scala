package aux11.solution.controller.states

import aux11.solution.controller.observers.Observer
import aux11.solution.controller.GameController

trait GameState {
  var controller: GameController
  def doAction(): Unit
}   
