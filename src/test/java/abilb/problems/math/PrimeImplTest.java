package abilb.problems.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeImplTest {
  private PrimeImpl _prime;

  public PrimeImplTest(){
    _prime = new PrimeImpl();
  }

  @Test
  public void testDifferentCases(){
    int[][] cases = new int[15][];

    cases[0] = new int[]{60, 0};
    cases[1] = new int[]{12, 0};
    cases[2] = new int[]{17, 1};
    cases[3] = new int[]{5, 1};
    cases[4] = new int[]{103, 1};
    cases[5] = new int[]{1153, 1};
    cases[6] = new int[]{15359, 1};
    cases[7] = new int[]{15357, 0};
    cases[8] = new int[]{1, 0};
    cases[9] = new int[]{25, 0};

    for(int[] cs: cases){

      if( cs == null )
        break;
      
      boolean expected = (cs[1]==1);
      int n = cs[0];      

      boolean actual = _prime.check(n);
      assertEquals(expected,actual,"check("+n+")");
    }
  }

  @Test 
  public void testZeroValue(){
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      _prime.check(-9);
    });

    String expectedMessage = "greater than zero";
    String actualMessage = exception.getMessage();

    assertTrue(actualMessage.contains(expectedMessage));
  }

}