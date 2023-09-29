package aux7.problem.unison.game

import aux7.problem.unison.db.Database
import aux7.problem.unison.db.UnisonDatabase

abstract class AbstractGame(var name: String, var id: Int, var price: Double) extends Game {
  var isInstalled: Boolean = false
  private var database: Database = new UnisonDatabase()
  def install(): Unit = {
    println(s"Installing $name")
    var inst: Option[Int] = database.data.get(id)
    if (inst.isDefined) {
      database.data.put(id, inst.get + 1)
    } else {
      database.data.put(id, 1)
    }
    isInstalled = true
  }

  def play(): Boolean = {
    if (isInstalled) {
      println(s"Playing $name")
      true
    } else {
      println("Install first")
      false
    }
  }

  def connect(db: Database) = {
    database = db
  }
}
