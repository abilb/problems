package abilb.problems.search;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class ContainsTest {
  @Test
  public void testVariousCases() {
    boolean[] expects = new boolean[8];
    int[][] cases = new int[8][];
    int[] search = new int[8];

    cases[0] = new int[] {};
    search[0] = 1;
    expects[0] = false;

    cases[1] = new int[] {1};
    search[1] = 2;
    expects[1] = false;

    cases[2] = new int[] {2, 4, 6};
    search[2] = 4;
    expects[2] = true;

    cases[3] = new int[] {2, 4, 6};
    search[3] = 5;
    expects[3] = false;

    cases[4] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    search[4] = 8;
    expects[4] = true;

    cases[5] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    search[5] = 0;
    expects[5] = false;

    cases[6] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    search[6] = 1;
    expects[6] = true;

    cases[7] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    search[7] = 10;
    expects[7] = true;

    for (int i = 0; i < cases.length; i++) {
      boolean expect = expects[i];
      int[] arr = cases[i];
      int x = search[i];

      boolean actual = Contains.find(arr,x);
      assertEquals(expect, actual, "find(" + Arrays.toString(arr) + ") - expected:" + expect + ", actual: " + actual);
    }
  }
}