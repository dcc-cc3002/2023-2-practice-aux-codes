package aux11.solution.model.units.allies

import aux11.solution.model.units.AbstractGameUnit
import aux11.solution.model.abilities.allies.Blue
import aux11.solution.model.abilities.allies.Red
import aux11.solution.model.abilities.allies.Purple

class GojoSatoru extends AbstractGameUnit("Satoru Gojo", 20, 100, 150) {
  addSpell(new Blue)
  addSpell(new Red)
  addSpell(new Purple)

  def technique: String = "No technique"
}
