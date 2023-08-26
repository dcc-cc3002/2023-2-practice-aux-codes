package aux3.solution.social

import aux3.solution.user.IUser

trait ISocialY {

  def login(username: String, password: String): Option[IUser]

  def register(username: String, password: String): Option[IUser]

}
