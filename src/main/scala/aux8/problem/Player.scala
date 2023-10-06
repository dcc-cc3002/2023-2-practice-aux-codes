package aux8.problem

import aux8.problem.cards.{Card, Combat, Distance, Siege}

class Player {

  val board: Board = new Board

  def play(card: Card): Unit = {
    if (card.isInstanceOf[Combat]) {
      board.combatZone.addOne(card)
    }

    else if (card.isInstanceOf[Distance]) {
      board.distanceZone.addOne(card)
    }

    else if (card.isInstanceOf[Siege]) {
      board.siegeZone.addOne(card)
    }
  }
}
