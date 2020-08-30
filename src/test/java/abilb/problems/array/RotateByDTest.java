package abilb.problems.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Arrays;

public class RotateByDTest {

  @Test
  public void testVariousCases() {
    RotateByD obj = new RotateByD();

    int[] rotates = new int[] {2, 3, 5, 4};

    int[][] cases = new int[10][];

    cases[0] = new int[] {1, 2, 3, 4, 5};
    cases[1] = new int[] {3, 4, 5, 1, 2};

    cases[2] = new int[] {10, 5, 30, 15};
    cases[3] = new int[] {15, 10, 5, 30};

    cases[4] = new int[] {1, 2, 3, 4, 5};
    cases[5] = new int[] {1, 2, 3, 4, 5};

    for (int i = 0; i < cases.length; i = i + 2) {
      if (cases[i] == null)
        break;

      int[] expected = cases[i + 1];

      int[] input = cases[i];
      int[] actual = obj.toLeft(input, rotates[i / 2]);

      assertTrue(Arrays.equals(expected, actual), "toLeft(" + Arrays.toString(input) + ") - expected:" + Arrays.toString(expected) + ", actual: " + Arrays.toString(actual));
    }
  }
}
