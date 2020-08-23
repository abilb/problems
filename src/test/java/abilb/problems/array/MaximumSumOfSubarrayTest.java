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

public class MaximumSumOfSubarrayTest {
  @Test
  public void testVariousCases(){

    MaximumSumOfSubarray obj = new MaximumSumOfSubarray();

    int[][] cases  = new int[10][];
    int[] expects = new int[10];

    cases[0] = new int[]{1,2,3,4};
    expects[0] = 10;

    cases[1] = new int[]{2,3,-8,7,-1,2,3};
    expects[1] = 11;

    cases[2] = new int[]{-7, -1, -8};
    expects[2] = -1;

    cases[3] = new int[]{0};
    expects[3] = 0;

    cases[4] = new int[]{1};
    expects[4] = 1;

    cases[5] = new int[]{-5,1,-2,3,-1,2,-2};
    expects[5] = 4;
    
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