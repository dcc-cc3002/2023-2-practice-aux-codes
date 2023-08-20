package aux2.bank
// package aux2.bank nos indica el paquete en el que se encuentra este archivo

import aux2.person.Person
// Este import nos permite utilizar la clase Person, que se ubica en el paquete aux2.person
// NOTE LA IMPORTANCIA DEL NOMBRAMIENTO DE PAQUETES EXPLICADA EN LA AUXILIAR: Si utiliza mayúsculas, por ejemplo,
// se confundirá pues las clases e interfaces SIEMPRE deben llevar capitalizado (la primera letra en mayúsculas) su
// nombre. También, utilizar guiones (-) o guiones bajos (_) al nombrar paquetes podría provocar errores de compilación
// en su código.

import scala.collection.mutable.ArrayBuffer
// importación de cosas relacionadas a la librería estándar de Scala. Generalmente, se hacen de manera automática, por
// lo que no debe preocuparse mucho por esto.

// Similar al ejemplo de Person, no es necesario que para construir un banco debamos agregar la lista de usuarios
// registrados a ese banco, simplemente podemos dejarlo como un atributo interno que se irá modificando con el tiempo.
// IMPORTANTE: Note que modificar y reasignar son 2 conceptos diferentes en este contexto, pues podemos modificar a
// este ArrayBuffer, ya sea agregando o removiendo personas de dicho banco, pero esto no reasigna 'subscribers', sino
// que lo modifica internamente (mutabilidad).
class Bank(val name: String) {
  val subscribers: ArrayBuffer[Person] =
    new ArrayBuffer[Person]()

  def addNewSubscriber(person: Person): Unit = {
    subscribers.addOne(person)
  }

  def removeSubscriber(person: Person): Unit = {
    val index: Int = subscribers.indexOf(person)
    subscribers.remove(index)
  }
}
