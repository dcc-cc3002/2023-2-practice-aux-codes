package aux7.solution.unison.game

import aux7.solution.unison.db.Database

trait Game {
  // queremos que solo se puedan "ver" estos atributos
  // por que no usar val?
  // en Scala val y def se puede ver muy parecidos (al final los dos te entregan un valor y nada mas)
  // pero en el caso val uno esta garantizando que el parámetro no va a cambiar nunca
  // por lo que si necesitamos manejar por dentro un private var _x, entonces es mejor
  // dejarlo con def
  def name: String
  def price: Double   

  def install(): Unit
  def connect(db: Database): Unit
} 
