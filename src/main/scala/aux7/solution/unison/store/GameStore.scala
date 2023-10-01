package aux7.solution.unison.store

import scala.collection.mutable.Map
import aux7.solution.user.User
import aux7.solution.unison.db.Database
import aux7.solution.unison.game._

trait GameStore {
  var catalog: Map[String, Game]
  def buySingle(game: String, user: User): Option[SingleplayerGame]
  def buyMulti(game: String, user: User): Option[MultiplayerGame]
  def hasGame(game: String): Boolean
}
