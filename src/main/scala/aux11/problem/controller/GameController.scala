package aux11.problem.controller

import states.GameState
import states.player.InitialState
import observers.Observer
import aux11.problem.model.units.GameUnit
import aux11.problem.model.units.enemies._
import aux11.problem.model.units.allies._
import aux11.problem.model.abilities.Ability
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
      println("Oh no! Perdiste :c")
    } else {
      println("Juego terminado antes de tiempo")
    }
  }

  def getInput(): Int = {
    val in = StdIn.readLine()
    in.toInt
  }

  // DESDE AQUI USTED DEBE COMPLETAR

  def addObserver(obs: Observer) = {}

  def changeState(st: GameState) = {}

  def play() = {}

  def finish(): Boolean = false

  def win(): Boolean = false

  def lose(): Boolean = false

  def hasSpell(): Boolean = false

  def alliesLength(): Int = 0

  def enemiesLength(): Int = 0

  def selectAlly(id: Int) = {}

  def selectAllyTarget(id: Int) = {}

  def selectEnemy(id: Int) = {}

  def selectEnemyTarget(id: Int) = {}

  def doAttack() = {}

  def useSpell() = {}
  // HASTA AQUI USTED DEBE COMPLETAR

  def promptStart() = {
    println("Turno del jugador")
  }

  def promptError(opt: Int) = {
    println(s"Opción inválida $opt")
  }

  def promptAllies() = {
    println("Escoge un aliado:")
    for (i <- 0 to allies.length - 1) {
      println(s"${i + 1}) ${allies(i).name}")
    }
  }

  def promptEnemies() = {
    println("Escoge un enemigo:")
    for (i <- 0 to enemies.length - 1) {
      println(s"${i + 1}) ${enemies(i).name}")
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
    for (i <- 0 to sp.length - 1) {
      println(s"${i + 1}) ${sp(i).name}")
    }
  }

  def promptNoEnergy(u: GameUnit) = {
    println(s"${u.name} no tiene suficiente energía maldita para hacer eso")
  }

  def promptNoHealth(u: GameUnit) = {
    println(s"${u.name} esta muerto, no puede atacar o ser atacado")
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
