package aux4.solution.characters

trait ICharacter {

  val name: String

  var healthPoints: Int

  def warCry(): String

  def regenerateHp(): Unit
}
