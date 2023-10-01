package aux7.solution.unison.store

import scala.collection.mutable.Map
import aux7.solution.unison.game._
import aux7.solution.unison.db.Database
import aux7.solution.unison.db.UnisonDatabase
import aux7.solution.user.User

class UnisonStore extends GameStore {
  var catalog: Map[String, Game] = Map()
  var db: Database = new UnisonDatabase()

  private def buy(game: String, user: User): Option[Game] = {
    var g = catalog.get(game)
    if (g.isDefined && user.pay(g.get.price)) {
      g.get.connect(db)
      g
    } else None
  }

  def buySingle(game: String, user: User): Option[SingleplayerGame] = {
    var g = buy(game, user)
    if (g.isDefined) {
      Some(g.get.asInstanceOf[SingleplayerGame])
    } else None
  }

  def buyMulti(game: String, user: User): Option[MultiplayerGame] = {
    var g = buy(game, user)
    if (g.isDefined) {
      Some(g.get.asInstanceOf[MultiplayerGame])
    } else None
  }

  def hasGame(game: String): Boolean = {
    catalog.contains(game)
  }
}
