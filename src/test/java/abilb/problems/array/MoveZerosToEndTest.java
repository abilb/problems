package abilb.problems.array;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveZerosToEndTest {

  @Test
  public void testVariousCases() {
    MoveZerosToEnd obj = new MoveZerosToEnd();

    int[][] inputs1 = new int[15][];
    int[][] expects = new int[15][];

    inputs1[0] = new int[] {0, 0, 0, 1, 2, 3};
    expects[0] = new int[] {1, 2, 3, 0, 0, 0};

    inputs1[1] = new int[] {1, 2, 3, 0, 0, 0};
    expects[1] = new int[] {1, 2, 3, 0, 0, 0};

    inputs1[2] = new int[] {1, 2, 3, 0, 0, 0, 4, 5, 6};
    expects[2] = new int[] {1, 2, 3, 4, 5, 6, 0, 0, 0};

    inputs1[3] = new int[] {0, 1, 0, 2, 0, 3, 0, 4, 0};
    expects[3] = new int[] {1, 2, 3, 4, 0, 0, 0, 0, 0};

    inputs1[4] = new int[] {0, 0, 1, 2, 0, 0};
    expects[4] = new int[] {1, 2, 0, 0, 0, 0};

    inputs1[5] = new int[] {0, 0, 0, 0, 0};
    expects[5] = new int[] {0, 0, 0, 0, 0};

    inputs1[6] = new int[] {1, 2, 3, 4, 5};
    expects[6] = new int[] {1, 2, 3, 4, 5};

    inputs1[7] = new int[] {0, 0, 0, 0, 0, 0, 0, 1};
    expects[7] = new int[] {1, 0, 0, 0, 0, 0, 0, 0};

    for (int i = 0; i < inputs1.length; i++) {

      if (inputs1[i] == null)
        break;

      int[] expect = expects[i];
      int[] input = inputs1[i].clone();

      int[] actual = obj.rearrange1(input);
      assertTrue(Arrays.equals(expects[i], actual), "rearrange1(" + Arrays.toString(input)
          + ") - expected:" + Arrays.toString(expect) + ", actual: " + Arrays.toString(actual));

      actual = obj.rearrange(input);
      assertTrue(Arrays.equals(expects[i], actual), "rearrange(" + Arrays.toString(input) + ") - expected:" + Arrays.toString(expect) + ", actual: " + Arrays.toString(actual));
    }
  }
}
