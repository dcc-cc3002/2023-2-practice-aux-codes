package aux4.problem

class ICharacter(val name: String,
                 val healthPoints: Int,
                 val manaPoints: Int,
                 val characterType: String) {

  // Commented for compilation purposes
  // if (characterType == "Mercenary" || characterType == "Acrobat") {
  //   manaPoints = 0
  // }
  //
  // def warCry(): String = {
  //   "For the glory!"
  // }
  //
  // def regenerateHp(): Unit = {
  //   healthPoints += 1
  // }
  //
  // def regenerateMp(): Unit = {
  //   if (characterType == "Assist" || characterType == "Magician") {
  //     manaPoints += 1
  //   }
  // }
}
