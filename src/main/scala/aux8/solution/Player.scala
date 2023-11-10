package aux8.solution

import aux8.solution.cards.Card

class Player {
  val board: Board = new Board

  def play(card: Card): Unit = {
    card.playOnBoard(board)
  }
}
