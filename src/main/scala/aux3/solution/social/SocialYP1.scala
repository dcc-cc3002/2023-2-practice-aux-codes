package aux3.solution.social

import scala.collection.mutable.Map

class SocialYP1 {
  private val users: Map[String, String] = Map()

  def login(username: String, password: String): Boolean = {
    val u = users.get(username)
    if (u.isDefined && u.get == password) true
    else false
  }

  def register(username: String, password: String): Boolean = {
    // First check if the username is already taken
    if (users.contains(username)) false
    // If not, create a new user and add it to the database (map)
    else {
      users.put(username, password)
      true
    }
  }
}
