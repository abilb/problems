package abilb.problems.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class JosephusTest {
  Josephus obj;

  public JosephusTest() {
    obj = new Josephus();
  }

  @Test
  public void testDifferentCases() {

    int[][] cases = new int[10][];

    cases[0] = new int[] {5, 3, 3};
    cases[1] = new int[] {7, 2, 6};
    cases[2] = new int[] {7, 3, 3};
    cases[3] = new int[] {8, 2, 0};
    cases[4] = new int[] {4, 2, 0};

    for (int[] cs : cases) {
      if (cs == null)
        break;

      int expected = cs[2];
      int n = cs[0];
      int k = cs[1];

      int actual = this.obj.findSurvivor(n, k);
      assertEquals(expected, actual,
          "find(" + n + "," + k + ") - expected:" + expected + ", actual: " + actual);
    }
  }

  @Test
  public void testExceptions() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      this.obj.findSurvivor(-9, 0);
    });

    String expectedMessage = "Value(s) must be greater than zero";
    String actualMessage = exception.getMessage();

    assertTrue(actualMessage.contains(expectedMessage));
  }

}
