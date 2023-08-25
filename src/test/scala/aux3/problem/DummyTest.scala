package aux3.problem

import munit.FunSuite


class DummyTest extends FunSuite {
  private var n1: Int = _
  private var n2: Int = _

  override def beforeEach(context: BeforeEach): Unit = {
    n1 = 1
    n2 = 2
  }

  test("Dummy test") {
    assertEquals(n1, 1)
    assertEquals(n2, 2)
    assertEquals(n1 + n2, 3)
  }
  

}
