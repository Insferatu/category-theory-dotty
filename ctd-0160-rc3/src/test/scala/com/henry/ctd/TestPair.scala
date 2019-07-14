import org.junit.Test
import org.junit.Assert._

import com.henry.ctd.data.pair._

class TestPair {
  @Test def testFst(): Unit = {
    assertEquals(fst(Pair("Hello", 1)), "Hello")
    assertEquals(fst(Pair(1, true)), 1)
    assertEquals(fst(Pair(true, "Hello")), true)
  }

  @Test def testSnd(): Unit = {
    assertEquals(snd(Pair("Hello", 1)), 1)
    assertEquals(snd(Pair(1, true)), true)
    assertEquals(snd(Pair(true, "Hello")), "Hello")
  }
}