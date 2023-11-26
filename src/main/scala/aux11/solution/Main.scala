package aux11.solution

import controller.GameController
import controller.observers.InfoObserver

object Main {
  def main(args: Array[String]): Unit = {
    val game = new GameController()
    game.addObserver(new InfoObserver())
    game.startGame()
    while(!game.finish()) {
      game.play()
    }
    game.endGame()
  }
}

