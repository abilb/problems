package abilb.problems.array;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrappingRainWaterTest {

  @Test
  public void testVariousCases(  ){
    TrappingRainWater obj = new TrappingRainWater();

    int[] expects = new int[]{6,2,7,0,0};

    int[][] cases = new int[10][];
    cases[0] = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
    cases[1] = new int[]{2,0,2};
    cases[2] = new int[]{3, 0, 2, 0, 4};
    cases[3] = new int[]{1,2,3,4,5,6,7};
    cases[4] = new int[]{5,4,3,2,1};

    for( int i = 0; i < cases.length; i++ ){
      if( cases[i]==null )
        break;

      int expected = expects[i];

      int[] input = cases[i];
      int actual = obj.find(input);

      assertEquals( expected, actual, "find(" + Arrays.toString(input)+") - expected:" + expected + ", actual: "+actual );
    }
  }
  
}