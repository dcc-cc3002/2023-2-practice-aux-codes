package aux7.problem.unison.game.games

import aux7.problem.unison.game.AbstractGame
import aux7.problem.unison.game.Game

class Smash extends AbstractGame("Super Smash Bros. Ultimate", 10, 60.0) {
  override def play(): Boolean = {
    print("Can't play alone :c")
    false
  }
}
