package aux7.solution.unison.db

import scala.collection.mutable.Map

class UnisonDatabase extends Database {
  private val data: Map[Int, Int] = Map() // val porque Map es mutable!!!

  override def addInstall(id: Int): Unit = {
    if (data.contains(id))
      data(id) += 1
    else
      data(id) = 1
  }
}
