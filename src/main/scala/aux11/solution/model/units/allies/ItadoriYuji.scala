package aux11.solution.model.units.allies

import aux11.solution.model.units.AbstractGameUnit
import aux11.solution.model.abilities.allies.Basic

class ItadoriYuji extends AbstractGameUnit("Yuji Itadori", 30, 150, 60) {
  addSpell(new Basic)

  def technique: String = "No technique"
}
