package aux4.solution.characters.magic

import aux4.solution.characters.ICharacter

trait MagicCharacter extends ICharacter {

  var manaPoints: Int

  def regenerateMp(): Unit
}
