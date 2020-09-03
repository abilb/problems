package abilb.problems.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class SearchInRotatedArrayTest {
  @Test
  public void testVariousCases() {
    int[] expects = new int[10];
    int[] search = new int[10];
    int[][] cases = new int[10][];

    cases[0] = new int[] {1, 2, 3, 4, 5};
    search[0] = 5;
    expects[0] = 4;

    cases[1] = new int[] {2, 3, 4, 5, 1};
    search[1] = 5;
    expects[1] = 3;

    cases[2] = new int[] {3, 4, 5, 1, 2};
    search[2] = 5;
    expects[2] = 2;

    cases[3] = new int[] {4, 5, 1, 2, 3};
    search[3] = 5;
    expects[3] = 1;

    cases[4] = new int[] {5, 1, 2, 3, 4};
    search[4] = 5;
    expects[4] = 0;

    for (int i = 0; i < cases.length; i++) {
      if (cases[i] == null)
        break;

      int expect = expects[i];
      int[] input = cases[i];
      int x = search[i];

      int actual = SearchInRotatedArray.find(input, x);
      assertEquals(expect, actual, "find(" + Arrays.toString(input) + ") - expected:" + expect + ", actual: " + actual); 
    }
  }
}
