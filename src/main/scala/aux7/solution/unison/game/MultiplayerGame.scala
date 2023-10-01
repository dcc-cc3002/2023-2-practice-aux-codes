package aux7.solution.unison.game

import aux7.solution.user.User

trait MultiplayerGame extends Game {
  def play(other: User): Boolean 
}
