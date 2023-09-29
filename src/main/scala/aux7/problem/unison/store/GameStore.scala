package aux7.problem.unison.store

import scala.collection.mutable.Map
import aux7.problem.user.User
import aux7.problem.unison.db.Database
import aux7.problem.unison.game.Game

trait GameStore {
  var catalog: Map[String, Game]
  def buy(game: String, user: User): Option[Game]
  def hasGame(game: String): Boolean
}
