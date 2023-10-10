package aux8.solution

import aux8.solution.cards.{Combat, Distance, Siege}

class BoardTest extends munit.FunSuite {

  var player: Player = _
  var combatCard: Combat = _
  var distanceCard: Distance = _
  var siegeCard: Siege = _

  override def beforeEach(context: BeforeEach): Unit = {
    player = new Player
    combatCard = new Combat
    distanceCard = new Distance
    siegeCard = new Siege
  }

  test("A board should receive Combat cards in the Combat Zone") {
    player.play(combatCard)
    assert(player.board.combatZone.contains(combatCard))
  }

  test("A board should receive Distance cards in the Distance Zone") {
    player.play(distanceCard)
    assert(player.board.distanceZone.contains(distanceCard))
  }

  test("A board should receive Siege cards in the Siege Zone") {
    player.play(siegeCard)
    assert(player.board.siegeZone.contains(siegeCard))
  }
}