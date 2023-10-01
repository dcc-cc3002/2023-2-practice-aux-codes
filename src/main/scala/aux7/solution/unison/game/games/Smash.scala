package aux7.solution.unison.game.games

import aux7.solution.unison.game.AbstractGame
import aux7.solution.unison.game.MultiplayerGame
import aux7.solution.unison.game.Game
import aux7.solution.user.User

class Smash extends AbstractGame("Super Smash Bros. Ultimate", 10, 60.0) with MultiplayerGame {
  override def play(other: User): Boolean = {
    if (isInstalled) {
      println(s"Time to destroy ${other.name}")
      true
    } else {
      false
    }
  }
}
