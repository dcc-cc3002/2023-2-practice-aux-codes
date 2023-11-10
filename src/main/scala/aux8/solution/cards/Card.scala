package aux8.solution.cards
import aux8.solution.Board

trait Card {
  def playOnBoard(board: Board): Unit
}
