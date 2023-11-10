package aux8.problem

import aux8.problem.cards.{Card, Combat, Distance, Siege}

import scala.collection.mutable.ArrayBuffer

class Board {

  var combatZone: ArrayBuffer[Card] = new ArrayBuffer[Card]()
  var distanceZone: ArrayBuffer[Card] = new ArrayBuffer[Card]()
  var siegeZone: ArrayBuffer[Card] = new ArrayBuffer[Card]()

}
