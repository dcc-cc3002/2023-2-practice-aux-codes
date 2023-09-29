package aux7.problem.unison.game

import aux7.problem.unison.db.Database

trait Game {
  var name: String
  var id: Int
  var price: Double
  var isInstalled: Boolean
  def install(): Unit
  def play(): Boolean
  def connect(db: Database): Unit
} 
