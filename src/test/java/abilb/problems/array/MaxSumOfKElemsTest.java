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

public class MaxSumOfKElemsTest {
  
  @Test
  public void testVariousCases(){
    MaxSumOfKElems obj = new MaxSumOfKElems();

    int[] expects = new int[10];
    int[][] cases = new int[10][];
    int[] K = new int[10];

    cases[0] = new int[]{1,1,1,1,1,1,1,1};
    K[0] = 3;
    expects[0] = 3;

    cases[1] = new int[]{1,2,3,4,5,6,7};
    K[1] = 4;   
    expects[1] = 22;

    cases[2] = new int[]{7,6,5,4,3,2,1};
    K[2] = 4;
    expects[2] = 22;

    cases[3] = new int[]{1,-1,1,-1,1,-1};
    K[3] = 3;
    expects[3] = 1;

    cases[4] = new int[]{-1,-2,-3,-4,-5,-6,-7};
    K[4] = 4;
    expects[4] = -10;

    cases[5] = new int[]{1,2,3,4};
    K[5] = 4;
    expects[5] = 10;

    cases[6] = new int[]{1,8,30,-5,20,7};
    K[6] = 3;
    expects[6] = 45;

    for( int i = 0; i < cases.length; i++ ){
      
      if( cases[i] == null )
        break;

      int expect = expects[i];
      int[] input = cases[i];
      int k = K[i];

      int actual = obj.find(input, k);
      assertEquals( expect, actual, "find("+ Arrays.toString(input) +", "+k+") - expected:" + expect + ", actual: "+actual );
    }
  }


}