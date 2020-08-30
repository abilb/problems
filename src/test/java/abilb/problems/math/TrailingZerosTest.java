package abilb.problems.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TrailingZerosTest {
  private TrailingZeros _trailingZeros;

  public TrailingZerosTest() {
    _trailingZeros = new TrailingZeros();
  }

  @Test
  public void testDifferentCases() {
    int[][] cases = new int[10][];

    cases[0] = new int[] {10, 2};
    cases[1] = new int[] {13, 2};
    cases[2] = new int[] {15, 3};
    cases[3] = new int[] {50, 12};
    cases[4] = new int[] {2, 0};
    cases[5] = new int[] {126, 31};
    cases[6] = new int[] {149, 35};

    for (int[] cs : cases) {
      if (cs == null)
        break;

      int expected = cs[1];
      int n = cs[0];

      int actual = _trailingZeros.count(n);
      assertEquals(expected, actual, "count(" + n + ")");
    }
  }

  @Test
  public void testZeroValue() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      _trailingZeros.count(-9);
    });

    String expectedMessage = "Value must be greater than zero";
    String actualMessage = exception.getMessage();

    assertTrue(actualMessage.contains(expectedMessage));
  }
}
