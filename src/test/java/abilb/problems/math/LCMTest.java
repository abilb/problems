package abilb.problems.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LCMTest {

  private LCM _lcm;

  public LCMTest(){
    _lcm = new LCM();
  }

  @Test 
  public void testDifferentCases(){
    int[][] cases = new int[20][];

    cases[0] = new int[]{60, 12, 15};
    cases[1] = new int[]{12, 4, 6};
    cases[2] = new int[]{21, 3, 7};
    cases[3] = new int[]{8, 2, 8};

    for(int[] cs: cases){
      if( cs == null )
        break;
      
      final int expected = cs[0];
      final int num1 = cs[1];
      final int num2 = cs[2];      

      int actual = _lcm.calculate(num1, num2);
      assertEquals(expected,actual,"calculate("+num1+","+num2+") - expected:" + expected + ", actual: "+actual);
    }
  }

  @Test 
  public void testZeroValue(){
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      _lcm.calculate(48, 0);
    });

    String expectedMessage = "Values must be non-zero";
    String actualMessage = exception.getMessage();

    assertTrue(actualMessage.contains(expectedMessage));
  }
}