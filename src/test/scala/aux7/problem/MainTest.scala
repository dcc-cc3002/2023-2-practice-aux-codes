package aux7.problem

import munit.FunSuite
import aux7.problem.user.User
import unison.game.Game
import unison.game.games._
import unison.store.GameStore
import unison.store.UnisonStore

class MainTest extends FunSuite {
  var u1: User = _
  var u2: User = _
  var store: GameStore = _
  var g1: Game = _
  var g2: Game = _
  var g3: Game = _

  override def beforeEach(context: BeforeEach): Unit = {
    u1 = new User("Rorro Pirrorro", 999999.0)
    u2 = new User("Random", 10.0)
    store = new UnisonStore()
    g1 = new HollowKnight()
    g2 = new GettingOverIt()
    g3 = new Smash()
    store.catalog.put(g1.name, g1)
    store.catalog.put(g2.name, g2)
    store.catalog.put(g3.name, g3)
  }

  test("A user can buy a game") {
    var g = store.buy("Hollow Knight", u1)
    assertEquals(u1.money, 999984.0)
    assert(g.isDefined)
    assertEquals(g.get.name, "Hollow Knight")
  }

  test("A user can't buy a game if it doesn't have enough money") {
    var g = store.buy("Hollow Knight", u2)
    assertEquals(u2.money, 10.0)
    assert(g.isEmpty)
  }

  test("An game can be played only after installed") {
    var g = store.buy("Hollow Knight", u1)
    assert(!g.get.play())
    g.get.install()
    assert(g.get.play())
  } 

  test("A user can't buy a game if it doesn't exist") {
    var g = store.buy("GTA VI", u1)
    assertEquals(u1.money, 999999.0)
    assert(g.isEmpty)
  }

  test("All installed games should be playable") {
    var g1 = store.buy("Hollow Knight", u1)
    var g2 = store.buy("Getting Over It", u1)
    var g3 = store.buy("Super Smash Bros. Ultimate", u1)
    g1.get.install()
    g2.get.install()
    g3.get.install()
    assert(g1.get.play())
    assert(g2.get.play())
    assert(g3.get.play())
  }

}

