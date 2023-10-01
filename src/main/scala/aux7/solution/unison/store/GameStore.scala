package aux7.solution.unison.store

import scala.collection.mutable.Map
import aux7.solution.user.User
import aux7.solution.unison.db.Database
import aux7.solution.unison.game._

trait GameStore {
  def buySingle(game: String, user: User): Option[SingleplayerGame]
  def buyMulti(game: String, user: User): Option[MultiplayerGame]
  def hasGame(game: String): Boolean
  def addGame(game: Game): Unit
}
