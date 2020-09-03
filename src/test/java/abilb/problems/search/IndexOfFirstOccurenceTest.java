package abilb.problems.search;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class IndexOfFirstOccurenceTest {

  @Test
  public void testVariousCases() {
    int[] expects = new int[11];
    int[] search = new int[11];
    int[][] cases = new int[11][];

    cases[0] = new int[] {2, 2, 2, 3, 4, 5, 6, 7};
    search[0] = 2;
    expects[0] = 0;

    cases[1] = new int[] {1, 2, 3, 4, 4, 4, 4, 5, 6, 7, 8, 9};
    search[1] = 4;
    expects[1] = 3;

    cases[2] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 8, 8};
    search[2] = 8;
    expects[2] = 7;

    cases[3] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    search[3] = 3;
    expects[3] = 2;

    cases[4] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    search[4] = 1;
    expects[4] = 0;

    cases[5] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    search[5] = 10;
    expects[5] = 9;

    cases[6] = new int[] {2, 2, 2, 2, 2, 2, 2, 2, 2};
    search[6] = 2;
    expects[6] = 0;

    cases[7] = new int[] {2, 2, 2, 2, 2, 2, 2, 2, 2};
    search[7] = 3;
    expects[7] = -1;

    cases[8] = new int[] {1};
    search[8] = 2;
    expects[8] = -1;

    cases[9] = new int[] {1, 2};
    search[9] = 2;
    expects[9] = 1;

    for (int i = 0; i < cases.length; i++) {
      if (cases[i] == null)
        break;

      int expect = expects[i];
      int[] input = cases[i];
      int x = search[i];

      int actual = IndexOfFirstOccurence.recursive(input, x, 0, input.length - 1);
      assertEquals(expect, actual,
          "recursive(" + Arrays.toString(input) + ") - expected:" + expect + ", actual: " + actual);

      actual = IndexOfFirstOccurence.iterative(input, x);
      assertEquals(expect, actual,
          "iterative(" + Arrays.toString(input) + ") - expected:" + expect + ", actual: " + actual);

      actual = IndexOfFirstOccurence.bruteForce(input, x);
      assertEquals(expect, actual, "bruteForce(" + Arrays.toString(input) + ") - expected:" + expect
          + ", actual: " + actual);
    }
  }
}
