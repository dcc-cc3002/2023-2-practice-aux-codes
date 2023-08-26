package aux3.solution.social

import munit.FunSuite

class SocialYP1Test extends FunSuite {
  private var social: SocialYP1 = _

  override def beforeEach(context: BeforeEach): Unit = {
    social = new SocialYP1
    social.register("user", "pass")
  }

  test("An user must be able to login") {
    assert(social.login("user", "pass"))
  }

  test("An user that doesn't exist must not be able to login") {
    assert(!social.login("user2", "pass2"))
  }

  test("An user must be able to login only with the correct password") {
    assert(!social.login("user", "pass2"))
    assert(social.login("user", "pass"))
  }


  test("An user must be able to register") {
    assert(social.register("user2", "pass2"))
  }

  test("An user must not be able to register with an already taken username") {
    assert(!social.register("user", "pass2"))
  }
}
