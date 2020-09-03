package abilb.problems.search;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SquareRootTest {
  @Test
  public void testVariousCases() {
    int[] expects = new int[9];
    int[] cases = new int[9];

    cases[1] = 1;
    expects[1] = 1;

    cases[2] = 2;
    expects[2] = 1;

    cases[3] = 4;
    expects[3] = 2;

    cases[4] = 15;
    expects[4] = 3;

    cases[5] = 14;
    expects[5] = 3;

    cases[6] = 16;
    expects[6] = 4;

    cases[7] = 225;
    expects[7] = 15;

    cases[8] = 25;
    expects[8] = 5;

    for (int i = 1; i < cases.length; i++) {
      int expect = expects[i];
      int x = cases[i];

      int actual = SquareRoot.bruteForce(x);
      assertEquals(expect, actual,
          "bruteForce(" + x + ") - expected:" + expect + ", actual: " + actual);

      actual = SquareRoot.binarySearch(x);
      assertEquals(expect, actual,
          "bruteForce(" + x + ") - expected:" + expect + ", actual: " + actual);
    }
  }
}
