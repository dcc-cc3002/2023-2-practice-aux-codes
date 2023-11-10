package aux11.solution.controller

import states.GameState
import states.player.InitialState
import observers.Observer
import aux11.solution.model.units.GameUnit
import aux11.solution.model.units.enemies._
import aux11.solution.model.units.allies._
import aux11.solution.model.abilities.Ability
import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

class GameController {

  private var state: GameState = _
  private var observers = ArrayBuffer.empty[Observer]
  private var allies = ArrayBuffer.empty[GameUnit]
  private var enemies = ArrayBuffer.empty[GameUnit]

  private var _selected: Option[GameUnit] = None
  private var _target: Option[GameUnit] = None
  private var _spell: Option[Ability] = None

  def selected(): GameUnit = {
    if (_selected.isDefined) {
      _selected.get 
    } else {
      throw new AssertionError("Ally not defined")
    }
  }

  def target(): GameUnit = {
    if (_target.isDefined) {
      _target.get 
    } else {
      throw new AssertionError("Enemy not defined")
    }
  }

  def hasSpell(): Boolean = {
    _spell.isDefined
  }

  def spell(): Ability = {
    if (_spell.isDefined) {
      _spell.get 
    } else {
      throw new AssertionError("Spell not defined")
    }
  }

  def spell_=(sp: Ability): Unit = {
    _spell = Some(sp)
  }


  def changeState(st: GameState) = {
    state = st
    st.controller = this
  }

  def startGame() = {
    changeState(new InitialState())

    allies += new GojoSatoru()
    allies += new ItadoriYuji()

    enemies += new Jogo()
    enemies += new Mahito()

    println("Bienvenido al combate!")
  } 

  def endGame() = {
    if (win()) {
      println("Felicidades! Ganaste!")
    } else if (lose()) {
      println("O no! Perdiste :c")
    } else {
      println("Juego terminado antes de tiempo")
    }
  }

  def addObserver(obs: Observer) = {
    this.observers += obs
  }

  def getInput(): Int = {
    val in = StdIn.readLine()
    in.toInt
  } 

  def play() = {
  }

  def finish(): Boolean = {
  }

  def win(): Boolean = {

  }

  def lose(): Boolean = {

  }

  def alliesLength(): Int = {
  }

  def enemiesLength(): Int = {
  }

  def selectAlly(id: Int) = {
  }

  def selectAllyTarget(id: Int) = {
  }

  def selectEnemy(id: Int) = {
  }

  def selectEnemyTarget(id: Int) = {
  }

  def doAttack() = {

  }

  def useSpell() = {

  }


  def promptStart() = {
    println("Turno del jugador")
  } 

  def promptError(opt: Int) = {
    println(s"Opción inválida $opt")
  }

  def promptAllies() = {
    println("Escoge un aliado:")
    for(i <- 0 to allies.length - 1) {
      println(s"${i+1}) ${allies(i).name}")
    }
  }

  def promptEnemies() = {
    println("Escoge un enemigo:")
    for(i <- 0 to enemies.length - 1) {
      println(s"${i+1}) ${enemies(i).name}")
    }
  }


  def promptActions() = {
    println(s"Estado de ${selected.name}")
    println(s"Vida: ${selected.healthPoints}/${selected.maxHP}")
    println(s"EM: ${selected.cursedEnergy}/${selected.maxCE}")
    println(s"Técnica maldita: ${selected.technique}")
    println("Escoge una acción:")
    println("1) Atacar")
    println("2) Usar técnica maldita")
    println("0) Cambiar de aliado")
  }

  def promptSpells(sp: ArrayBuffer[Ability]) = {
    println("Escoge una técnica maldita:")
    for(i <- 0 to sp.length - 1) {
      println(s"${i+1}) ${sp(i).name}")
    }
  }

  def promptNoEnergy() = {
    println("No tienes suficiente energía maldita")
  }

  def notifyAttack(from: GameUnit, to: GameUnit) {
    for (o <- observers) {
      o.updateAttack(from, to)
    }
  }

  def notifySpell(from: GameUnit, to: GameUnit, sp: Ability) {
    for (o <- observers) {
      o.updateSpell(from, to, sp)
    }
  }
}
