package aux2.person

import aux2.bank.Bank

// Note que el nombre de una persona no es algo que varíe con el tiempo, por lo que es constante.
// Sin embargo, la edad sí varía, y junto con eso, tenemos métodos que necesitan modificar la edad, como birthday().
// También, es posible omitir la necesidad de añadirle un banco a una persona en su constructor, y en este caso,
// dejar que simplemente sea un atributo interno que será igual para todas las instancias de personas que se creen.
class Person(val name: String, var age: Int) {
  var bank: Bank = null

  def birthday(): Unit = {
    age += 1
  }

  def bankSubscribe(newBank: Bank): Unit = {
    bank = newBank
    bank.addNewSubscriber(this)
  }

  def bankUnsubscribe(): Unit = {
    bank.removeSubscriber(this)
    bank = null
  }
}
