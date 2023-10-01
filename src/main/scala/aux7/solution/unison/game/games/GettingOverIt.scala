package aux7.solution.unison.game.games

import aux7.solution.unison.game.AbstractGame
import aux7.solution.unison.game.SingleplayerGame
import aux7.solution.unison.game.Game

class GettingOverIt extends AbstractGame("Getting Over It", 1, 10.0) with SingleplayerGame {
  override def play(): Boolean = {
    // Identificas un patron repetido? quizas lo mejor seria añadir una clase abstracta
    // para juegos single player
    if (isInstalled) {
      println("You will rage, but you will love it") 
      true
    } else {
      false
    }
  }
}
