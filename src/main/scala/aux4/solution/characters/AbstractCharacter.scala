package aux4.solution.characters

abstract class AbstractCharacter(val name: String,
                                 var healthPoints: Int) extends ICharacter {

  override def warCry(): String = {
    "For the glory!"
  }

  def regenerateHp(): Unit = {
    healthPoints += 1
  }
}
