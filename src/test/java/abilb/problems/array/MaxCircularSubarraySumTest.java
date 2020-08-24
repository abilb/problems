package abilb.problems.array;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MaxCircularSubarraySumTest {
  @Test
  public void testVariousCases(){
    MaxCircularSubarraySum obj = new MaxCircularSubarraySum();

    int[][] cases  = new int[20][];
    int[] expects = new int[20];

    cases[0] = new int[]{0,1,2,3,4,5};
    expects[0] = 15;

    cases[1] = new int[]{0,0,0,0,0};
    expects[1] = 0;

    cases[2] = new int[]{0,1,0,1,0,1};
    expects[2] = 3;

    cases[3] = new int[]{ 1,1,1,1,-3,4,-5,1,1 };
    expects[3] = 7;

    cases[4] = new int[]{10, 5, -5};
    expects[4] = 15;

    cases[5] = new int[]{5,-2,3,4};
    expects[5] = 12;

    cases[6] = new int[]{2,3,-4};
    expects[6] = 5;

    cases[7] = new int[]{8,-4,3,-5,4};
    expects[7] = 12;

    cases[8] = new int[]{-3,4,6,-2};
    expects[8] = 10;

    cases[9] = new int[]{-8,7,6};
    expects[9] = 13;

    cases[10] = new int[]{3,-4,5,6,-8,7};
    expects[10] = 17;
    
    for( int i = 0; i < cases.length; i++ ){
      
      if( cases[i] == null )
        break;

      int expect = expects[i];
      int[] input = cases[i];    

      int actual = obj.find(input);
      assertEquals( expect, actual, "find("+Arrays.toString(input)+") - expected:" + expect + ", actual: "+actual );
    }    
  }
}