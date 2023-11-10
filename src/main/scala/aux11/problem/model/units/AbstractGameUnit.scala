package aux11.problem.model.units

import aux11.problem.model.abilities.Ability

import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable.List

abstract class AbstractGameUnit(
    val name: String,
    val attack: Int,
    val maxHP: Int,
    val maxCE: Int
) extends GameUnit {

  private var _cursedEnergy = maxCE
  private var _healthPoints = maxHP
  private var _spells = ArrayBuffer.empty[Ability]

  def healthPoints: Int = _healthPoints
  def healthPoints_=(value: Int): Unit = _healthPoints =
    math.min(math.max(value, 0), maxHP)

  def cursedEnergy: Int = _cursedEnergy
  def cursedEnergy_=(value: Int): Unit = _cursedEnergy =
    math.min(math.max(value, 0), maxCE)

  def isAlive(): Boolean = healthPoints > 0
  def canUse(ability: Ability): Boolean = {
    ability.cost <= cursedEnergy
  }
  def canUseSpell(): Boolean = {
    for (sp <- _spells) {
      if (canUse(sp)) {
        return true
      }
    }
    false
  }

  def spells(): ArrayBuffer[Ability] = _spells.clone() 
  def addSpell(spell: Ability): Unit = _spells += spell

  def doAttack(target: GameUnit): Unit = { target.healthPoints -= attack }
  def useSpell(target: GameUnit, ability: Ability): Unit = {
    ability.use(this, target)
  }

}
