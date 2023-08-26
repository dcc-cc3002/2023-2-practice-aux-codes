package aux3.solution.user

import munit.FunSuite

class UserTest extends FunSuite {
  var u1: User = _
  var u2: User = _
  var u3: User = _

  override def beforeEach(context: BeforeEach): Unit = {
    u1 = new User("alonmask", "soyadmin", "Alon Mask")
    u2 = new User("operagyofficial", "browserforgamers", "Opera GY")
    u3 = new User("user123", "12356")

  }

  test("Its obligatory that the user has a username and a password") {
    val u = new User("memeselmejorramo", "contraseña")
    assertEquals(u.username, "memeselmejorramo")
  }

  test("Its optional that the user has a name") {
    val u = new User("memeselelmejorramo", "contraseña", "Vicente González")
    assertEquals(u.name, "Vicente González")
    assertEquals(u3.name, "")
  }

  test("An user can follow multiple users") {
    u1.follow(u2)
    u1.follow(u3)
    assertEquals(u1.following, 2)
    assertEquals(u2.followers, 1)
    assertEquals(u3.followers, 1)
  }

  test("An user can be follow by multiple users") {
    u1.follow(u2)
    u3.follow(u2)
    assertEquals(u2.followers, 2)
    assertEquals(u1.following, 1)
    assertEquals(u3.following, 1)
  }

  test("An user can unfollow a followed user") {
    u1.follow(u2)
    u1.unfollow(u2)
    assertEquals(u1.following, 0)
    assertEquals(u2.followers, 0)

    assertEquals(u3.followers, 0)
    u1.unfollow(u3)
    assertEquals(u3.followers, 0)
  }


  test("An user can't follow itself") {
    u1.follow(u1)
    assertEquals(u1.following, 0)
    assertEquals(u1.followers, 0)
  }

  test("An user can't be follow twice by the same user") {
    u1.follow(u2)
    u1.follow(u2)
    assertEquals(u1.following, 1)
    assertEquals(u2.followers, 1)
  }

  test("An user can't be unfollow twice by the same user") {
    u1.follow(u2)
    u1.unfollow(u2)
    u1.unfollow(u2)
    assertEquals(u1.following, 0)
    assertEquals(u2.followers, 0)
  }

  test("An user password its secret, only can be checked by auth") {
    assert(u1.auth("soyadmin"))
    assert(!u1.auth("soyadmin2"))
  }

  test("Its needed to have a way to know the number of followers and following") {
    u1.follow(u2)
    u1.follow(u3)
    u3.follow(u2)
    u2.follow(u1)

    assertEquals(u1.following, 2)
    assertEquals(u1.followers, 1)

    assertEquals(u2.following, 1)
    assertEquals(u2.followers, 2)

    assertEquals(u3.following, 1)
    assertEquals(u3.followers, 1)
  }
}
