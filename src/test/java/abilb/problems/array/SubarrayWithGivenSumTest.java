package abilb.problems.array;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubarrayWithGivenSumTest {
  @Test
  public void testVariousCases() {
    SubarrayWithGivenSum obj = new SubarrayWithGivenSum();

    boolean[] expects = new boolean[10];
    int[][] cases = new int[10][];
    int[] sum = new int[10];

    cases[0] = new int[] {6, 5, 2, 3, 4, 1, 7};
    sum[0] = 28;
    expects[0] = true;

    cases[1] = new int[] {2, 7, 1, 18, 0, 3, 4};
    sum[1] = 18;
    expects[1] = true;

    cases[2] = new int[] {1, 4, 20, 3, 10, 5};
    sum[2] = 33;
    expects[2] = true;

    cases[3] = new int[] {1, 4, 0, 0, 0, 3, 10, 5};
    sum[3] = 7;
    expects[3] = true;

    cases[4] = new int[] {5, 2, 7};
    sum[4] = 1;
    expects[4] = false;

    cases[5] = new int[] {2, 1, 7, 3, 9, 10, 23, 5, 4};
    sum[5] = 19;
    expects[5] = true;

    cases[6] = new int[] {7, 3, 9, 2, 1, 10, 23, 5, 4};
    sum[6] = 19;
    expects[6] = true;

    cases[7] = new int[] {2, 1, 10, 23, 5, 4, 7, 3, 9};
    sum[7] = 19;
    expects[7] = true;

    for (int i = 0; i < cases.length; i++) {

      if (cases[i] == null)
        break;

      boolean expect = expects[i];
      int[] input = cases[i];
      int s = sum[i];

      boolean actual = obj.find(input, s);

      assertEquals(expect, actual, "find(" + Arrays.toString(input) + ", " + s + ") - expected:"
          + expect + ", actual: " + actual);
    }
  }
}
