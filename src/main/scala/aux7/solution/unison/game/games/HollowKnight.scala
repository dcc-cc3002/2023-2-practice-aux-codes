package aux7.solution.unison.game.games

import aux7.solution.unison.game.AbstractGame
import aux7.solution.unison.game.SingleplayerGame
import aux7.solution.unison.game.Game

class HollowKnight extends AbstractGame("Hollow Knight", 3, 15.0) with SingleplayerGame {
  override def play(): Boolean = {
    if (isInstalled) {
      println("The best gaming expierence its about to happen, enjoy...")
      true
    } else {
      false
    }
  }
}
