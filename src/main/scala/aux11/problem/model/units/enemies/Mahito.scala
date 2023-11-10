package aux11.problem.model.units.enemies

import aux11.problem.model.units.AbstractGameUnit
import aux11.problem.model.abilities.enemies.Transfiguration

class Mahito extends AbstractGameUnit("Mahito", 10, 80, 120) {
  addSpell(new Transfiguration)

  def technique: String = "Soul Manipulation"
}
