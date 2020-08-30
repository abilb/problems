package abilb.problems.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class LongestEvenOdSubarrayTest {

  @Test
  public void testVariousCases() {
    LongestEvenOdSubarray obj = new LongestEvenOdSubarray();

    int[][] cases = new int[10][];
    int[] expects = new int[10];

    cases[0] = new int[] {10, 12, 14, 7, 8};
    expects[0] = 3;

    cases[1] = new int[] {1, 2, 3, 4, 5, 6, 7, 7, 7};
    expects[1] = 7;

    cases[2] = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1};
    expects[2] = 1;

    cases[3] = new int[] {2, 2, 2, 2, 2, 2, 2, 2};
    expects[3] = 1;

    cases[4] = new int[] {7, 12, 13, 14};
    expects[4] = 4;

    cases[5] = new int[] {10, 12, 8, 4};
    expects[5] = 1;

    cases[6] = new int[] {10, 12, 14, -7, 8};
    expects[6] = 3;

    for (int i = 0; i < cases.length; i++) {

      if (cases[i] == null)
        break;

      int expect = expects[i];
      int[] input = cases[i];

      int actual = obj.find(input);
      assertEquals(expect, actual,
          "find(" + Arrays.toString(input) + ") - expected:" + expect + ", actual: " + actual);
    }
  }
}
