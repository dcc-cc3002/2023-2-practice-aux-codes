package aux7.solution.unison.game

import aux7.solution.unison.db.Database

trait Game {
  // queremos que solo se puedan "ver" estos atributos
  def name: String
  def price: Double   

  def install(): Unit
  def connect(db: Database): Unit
} 
