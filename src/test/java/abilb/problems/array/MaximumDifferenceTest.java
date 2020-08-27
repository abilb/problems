package abilb.problems.array;


import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class MaximumDifferenceTest {
  @Test
  public void testVariousCases(){
    MaximumDifference obj = new MaximumDifference();

    int[] expects = new int[10];
    int[][] cases = new int[10][];

    cases[0] = new int[]{1,2,3,4,5,10};
    expects[0] = 9;

    cases[1] = new int[]{1,1,1,1,1,1,1,1,1};
    expects[1] = 0;

    cases[2] = new int[]{5,4,3,2,1};
    expects[2] = 0;

    cases[3] = new int[]{1,1,1,5,5,5};
    expects[3] = 4;

    cases[3] = new int[]{2,3,4,5,5,5,1,7};
    expects[3] = 6;

    cases[5] = new int[]{5,5,5,1,1,1};
    expects[5] = 0;

    cases[6] = new int[]{1,5,1,5,1,1,1,6};
    expects[6] = 5;

    cases[7] = new int[]{5,20,19,33,4,18};
    expects[7] = 15;

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