package aux7.problem.unison.store

import scala.collection.mutable.Map
import aux7.problem.unison.game.Game
import aux7.problem.unison.db.Database
import aux7.problem.unison.db.UnisonDatabase
import aux7.problem.user.User

class UnisonStore extends GameStore {
  var catalog: Map[String, Game] = Map()
  var db: Database = new UnisonDatabase()

  def buy(game: String, user: User): Option[Game] = {
    var g = catalog.get(game)
    if (g.isDefined && user.pay(g.get.price)) {
      g.get.connect(db)
      g
    } else None
  }

  def hasGame(game: String): Boolean = {
    catalog.contains(game)
  }
}
