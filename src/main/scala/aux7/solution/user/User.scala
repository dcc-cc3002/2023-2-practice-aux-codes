package aux7.solution.user

class User(val name: String, private var _money: Double) {
  def money: Double = _money
  def pay(amount: Double): Boolean = {
    if (amount > money) false
    else {
      _money -= amount
      true
    }
  } 
}
