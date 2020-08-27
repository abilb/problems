package abilb.problems.array;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrefixSumArrayTest {  

  @Test
  public void testVariousCases(){
    PrefixSumArray obj = new PrefixSumArray();
        
    int[][] cases   = new int[10][];    
    int[][] queries = new int[10][];
    int[] expects   = new int[10];

    cases[0] = new int[]{2,8,3,9,6,5,4};
    
    queries[0] = new int[]{0,2};    
    expects[0] = 13;
    
    queries[1] = new int[]{1,3};    
    expects[1] = 20;
    
    queries[2] = new int[]{2,6};    
    expects[2] = 27;
    
    queries[3] = new int[]{6,6};    
    expects[3] = 27;
    

    for( int i = 0; i < queries.length; i++ ){
      
      if( cases[i] == null )
        break;

      int expect = expects[i];
      int[] input = cases[0];
      int b = queries[i][0];
      int e = queries[i][1];

      int actual = obj.find(input, b, e);

      assertEquals( expect, actual, "find("+ Arrays.toString(input)+") - expected:" + expect + ", actual: "+actual );
   }

  }

}