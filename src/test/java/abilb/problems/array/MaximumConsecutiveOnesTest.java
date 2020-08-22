package abilb.problems.array;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MaximumConsecutiveOnesTest {
  
  @Test
  public void testVariousCases(){

    MaximumConsecutiveOnes obj = new MaximumConsecutiveOnes();

    int[] expects = new int[11];
    int[][] cases = new int[11][];

    cases[0] = new int[]{0,0,0,0,0,0};
    expects[0] = 0;

    cases[1] = new int[]{1,1,1,1,1,1};
    expects[1] = 6;

    cases[2] = new int[]{1,0,1,1,1,1,0,1,1,0,0,0,0};
    expects[2] = 4;

    cases[3] = new int[]{0,1,1,0,1,0};
    expects[3] = 2;

    cases[4] = new int[]{0,1,0,1,0,1,0,1,0,1,0,1,0,1};
    expects[4] = 1;

    cases[5] = new int[]{0};
    expects[5] = 0;

    cases[6] = new int[]{1};
    expects[6] = 1;

    cases[7] = new int[]{1,0};
    expects[7] = 1;

    cases[8] = new int[]{0,1};
    expects[8] = 1;

    cases[9] = new int[]{1,1};
    expects[9] = 2;

    cases[10] = new int[]{1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0};
    expects[10] = 8;

    for( int i = 0; i < cases.length; i++ ){      
      if( cases[i] == null )
        break;

      int expect = expects[i];
      int[] input = cases[i];    

      int actual = obj.find(input);
      assertEquals( expect, actual, "find("+ Arrays.toString(input) +") - expected:" + expect + ", actual: "+actual );
    }

  }
}