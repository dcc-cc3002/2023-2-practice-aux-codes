package aux8.solution.cards
import aux8.solution.Board

class Siege extends Card {

  override def playOnBoard(board: Board): Unit = {
    board.receiveSiegeCard(this)
  }
}
