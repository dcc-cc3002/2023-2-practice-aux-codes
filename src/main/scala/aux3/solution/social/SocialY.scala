package aux3.solution.social

import aux3.solution.user.User
import scala.collection.mutable.Map

class SocialY extends ISocialY {
  private val users: Map[String, User] = Map()

  def login(username: String, password: String): Option[User] = {
    val u = users.get(username)
    if (u.isDefined && u.get.auth(password)) u 
    else None
  }

  def register(username: String, password: String): Option[User] = {
    // First check if the username is already taken
    if (users.contains(username)) None
    // If not, create a new user and add it to the database (map)
    else {
      val u = new User(username, password)
      users.put(username, u)
      Some(u)
    }
  }



}
