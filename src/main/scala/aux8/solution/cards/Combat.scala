package aux8.solution.cards
import aux8.solution.Board

class Combat extends Card {

  override def playOnBoard(board: Board): Unit = {
    board.receiveCombatCard(this)
  }
}
