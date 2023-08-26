package aux3.solution.user

import scala.collection.mutable.Set
import scala.collection.mutable.ArrayBuffer

class User(val username: String, password: String, var name: String = "") extends IUser {
  private val _followers: Set[IUser] = Set()
  private val _following: Set[IUser] = Set()

  def follow(user: IUser): Unit = {
    if (user == this) return
    _following += user
    user.followedBy(this)
  }

  def unfollow(user: IUser): Unit = {
    _following -= user
    user.unfollowedBy(this)
  }

  def followedBy(user: IUser): Unit = {
    if (user == this) return
    _followers += user
  }

  def unfollowedBy(user: IUser): Unit = {
    _followers -= user
  }

  def followers: Int = _followers.size
  def following: Int = _following.size

  def auth(password: String): Boolean = this.password == password


}
