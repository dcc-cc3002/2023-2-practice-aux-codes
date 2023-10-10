package aux8.solution

import aux8.solution.cards.{Combat, Distance, Siege}
import scala.collection.mutable.ArrayBuffer

class Board {

  var combatZone: ArrayBuffer[Combat] = new ArrayBuffer[Combat]()
  var distanceZone: ArrayBuffer[Distance] = new ArrayBuffer[Distance]()
  var siegeZone: ArrayBuffer[Siege] = new ArrayBuffer[Siege]()

  def receiveCombatCard(card: Combat): Unit = {
    combatZone.addOne(card)
  }

  def receiveDistanceCard(card: Distance): Unit = {
    distanceZone.addOne(card)
  }

  def receiveSiegeCard(card: Siege): Unit = {
    siegeZone.addOne(card)
  }
}
