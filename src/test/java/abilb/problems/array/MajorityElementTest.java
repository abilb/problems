package abilb.problems.array;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import abilb.problems.Utils;

public class MajorityElementTest {
  @Test
  public void testVariousCases(){
    MajorityElement obj = new MajorityElement();

    int[][] expects = new int[10][];
    int[][] cases = new int[10][];

    cases[0] = new int[]{8,3,4,8,8};
    expects[0] = new int[]{0,3,4};

    cases[1] = new int[]{1,2,1,2,1,2,1,2};
    expects[1] = new int[]{};

    cases[2] = new int[]{1,1,1,1,1,2,2,2,2,2};
    expects[2] = new int[]{};

    cases[3] = new int[]{1,1,1,1,1};
    expects[3] = new int[]{0,1,2,3,4};

    cases[4] = new int[]{1};
    expects[4] = new int[]{0};

    cases[5] = new int[]{3,7,4,7,7,5};
    expects[5] = new int[]{};

    cases[6] = new int[]{20,30,40,50,50,50,50};
    expects[6] = new int[]{3,4,5,6};

    for( int i = 0; i < cases.length; i++ ){
      
      if( cases[i] == null )
        break;

      int[] expect = expects[i];
      int[] input = cases[i];    

      int actual = obj.find(input);

      boolean result = Utils.searchIntegerArray(expect, actual);

      if( expect.length == 0 && actual == -1 )
        result = true;

      assertTrue( result, "find("+ Arrays.toString(input) +") - expected:" + Arrays.toString(expect) + ", actual: "+actual );
   }
  }
}