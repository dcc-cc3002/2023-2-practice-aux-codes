package aux7.solution.unison.game

import aux7.solution.unison.db.Database
import aux7.solution.unison.db.UnisonDatabase

abstract class AbstractGame(private var _name: String, private var id: Int, private var _price: Double) extends Game {
  protected var isInstalled: Boolean = false
  protected var database: Database = new UnisonDatabase()
  def install(): Unit = {
    println(s"Installing $name")
    database.addInstall(id)
    isInstalled = true
  }

  // def play(): Boolean = {
  //   if (isInstalled) {
  //     println(s"Playing $name")
  //     true
  //   } else {
  //     println("Install first")
  //     false
  //   }
  // }

  def connect(db: Database) = {
    database = db
  }

  // Setters & Getters
  def price: Double = _price
  def name: String = _name
}
