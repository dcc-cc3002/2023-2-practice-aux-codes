package aux11.problem.controller.states

import aux11.problem.controller.observers.Observer
import aux11.problem.controller.GameController

trait GameState {
  var controller: GameController
  def doAction(): Unit
}   
