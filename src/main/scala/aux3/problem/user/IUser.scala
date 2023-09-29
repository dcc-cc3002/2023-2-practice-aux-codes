package aux3.problem.user

trait IUser {
  def name: String
  def username: String
  def follow(user: IUser): Unit
  def unfollow(user: IUser): Unit
  def followedBy(user: IUser): Unit
  def unfollowedBy(user: IUser): Unit
  def auth(password: String): Boolean
  def followers: Int
  def following: Int
}
