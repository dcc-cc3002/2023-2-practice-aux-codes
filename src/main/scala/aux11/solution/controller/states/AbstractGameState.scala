package aux11.solution.controller.states

import aux11.solution.controller.GameController
import aux11.solution.controller.observers.Observer
import scala.collection.mutable.ArrayBuffer

abstract class AbstractGameState extends GameState {
  private var _controller: Option[GameController] = None

  def controller: GameController = {
    if (_controller.isDefined) {
      _controller.get 
    } else {
      throw new AssertionError("Controller not defined")
    }
  }

  def controller_=(cont: GameController): Unit = {
    _controller = Some(cont)
  }

  def error() = throw new AssertionError("Wrong State")

  def doAction(): Unit = error()
}
