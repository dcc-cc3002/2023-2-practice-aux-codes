package aux11.problem.model.units.enemies

import aux11.problem.model.units.AbstractGameUnit
import aux11.problem.model.abilities.enemies.Flames
import aux11.problem.model.abilities.enemies.Meteor

class Jogo extends AbstractGameUnit("Jogo", 20, 100, 100) {
  addSpell(new Flames)
  addSpell(new Meteor)

  def technique: String = "Fire manipulation"
}
