package aux2

import aux2.bank.Bank
import aux2.person.Person

// Juegue con las diferentes cosas que puede realizar con este código para familiarizarse con la sintaxis del lenguaje.
object Main {
  def main(args: Array[String]): Unit = {
    val joel: Person = new Person("Joelito", 22)
    val daniel: Person = new Person("Danielito", 22)
    val bancoChile: Bank = new Bank("Banco de Chile")
    val bancoEstado: Bank = new Bank("Banco Estado")
    val gol: Person = new Person("Nose :D", 22)

    println(gol.name)
    println(joel.name)
    joel.bankSubscribe(bancoChile)
    println(joel.bank.name)
    println(bancoChile.subscribers.size)
  }
}
