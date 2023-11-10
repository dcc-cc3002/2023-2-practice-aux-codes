package aux11.solution.model.units.enemies

import aux11.solution.model.units.AbstractGameUnit
import aux11.solution.model.abilities.enemies.Transfiguration

class Mahito extends AbstractGameUnit("Mahito", 10, 80, 120) {
  addSpell(new Transfiguration)

  def technique: String = "Soul Manipulation"
}
