package aux7.solution.unison.store

import scala.collection.mutable.Map
import aux7.solution.unison.game._
import aux7.solution.unison.db.Database
import aux7.solution.unison.db.UnisonDatabase
import aux7.solution.user.User

class UnisonStore extends GameStore {
  private val _catalog: Map[String, Game] = Map()
  private var _db: Database = new UnisonDatabase()

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

  def addGame(game: Game): Unit = {
    catalog.put(game.name, game)
  }

  // setter & getter
  // de manera similar a el caso de val en database
  // como es un map mutable, solo necesitamos un getter
  private def catalog: Map[String, Game] = _catalog 

  // no es necesario hacer los setters y getters de db
  // pero hace sentido lógico que algo tan complicado
  // como una base de datos pueda tener ciertas condiciones
  // que cumplir en un futuro
  private def db_=:(newDb: Database): Unit = _db = newDb
  private def db: Database = _db

}
