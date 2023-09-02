package aux4.solution.characters.magic

import aux4.solution.characters.AbstractCharacter

abstract class AbstractMagicCharacter(name: String,
                                      healthPoints: Int,
                                      var manaPoints: Int)
  extends AbstractCharacter(name, healthPoints) with MagicCharacter {

  def regenerateMp(): Unit = {
    manaPoints += 1
  }
}
