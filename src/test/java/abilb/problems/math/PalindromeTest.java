package abilb.problems.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
  
  private Palindrome _palindrome;

  public PalindromeTest(){
    _palindrome = new Palindrome();
  }

  @Test
  public void testDifferentCases(){
    int[][] cases = new int[20][];

    cases[0] = new int[]{1,1};
    cases[0] = new int[]{9,1};
    cases[1] = new int[]{10,0};
    cases[1] = new int[]{55,1};
    cases[1] = new int[]{12345566,0};
    cases[2] = new int[]{705,0};
    cases[3] = new int[]{10001, 1};
    cases[3] = new int[]{123454321, 1};

    for(int[] cs: cases){      
      if( cs == null )
        break;

      boolean expected = (cs[1]==1);
      int n = cs[0];      

      boolean actual = _palindrome.check(n);
      assertEquals(expected,actual,"check("+n+")");
    }
  }

  @Test
  public void testException(){
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      _palindrome.check(-9);
    });

    String expectedMessage = "Value must be greater or equal to zero";
    String actualMessage = exception.getMessage();

    assertTrue(actualMessage.contains(expectedMessage));
  }

}