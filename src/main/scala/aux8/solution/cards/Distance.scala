package aux8.solution.cards
import aux8.solution.Board

class Distance extends Card {

  override def playOnBoard(board: Board): Unit = {
    board.receiveDistanceCard(this)
  }
}
