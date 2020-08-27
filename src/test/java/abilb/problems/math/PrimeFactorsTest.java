package abilb.problems.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

public class PrimeFactorsTest {
  private PrimeFactors _primeFactors;

   public PrimeFactorsTest(){
    _primeFactors = new PrimeFactors();
  }

  @Test
  public void testDifferentCasesOptimal(){
    int[] nums = new int[10];
    Integer[][] factors = new Integer[10][];

    nums[0] = 100;
    factors[0] = new Integer[]{2,2,5,5};

    nums[1] = 12;
    factors[1] = new Integer[]{2,2,3};

    nums[2] = 450;
    factors[2] = new Integer[]{2,3,3,5,5};

    nums[3] = 1;
    factors[3] = new Integer[0];

    nums[4] = 13;
    factors[4] = new Integer[0];

    nums[5] = 84;
    factors[5] = new Integer[]{2,2,3,7};

    nums[6] = 9085;
    factors[6] = new Integer[]{5,23,79};

    nums[7] = 118105;
    factors[7] = new Integer[]{5,13,23,79};

    nums[8] = 3;
    factors[8] = new Integer[0];

    for(int i = 0; i < nums.length; i++ ){

      if( factors[i] == null )
        break;

      int num = nums[i];
      
      Arrays.sort( factors[0] );
      List<Integer> expected = Arrays.asList(factors[i]);

      List<Integer> actualOptimal = _primeFactors.solveOptimal(num);
      Collections.sort(actualOptimal);

      List<Integer> actualNaive = _primeFactors.solveNaive(num);
      Collections.sort(actualNaive);

      assertEquals(expected,actualOptimal,"solveOptimal("+num+")");
      assertEquals(expected,actualNaive,"solveNaive("+num+")");
    }
  }

  @Test
  public void testExceptions(){
    Exception exception = assertThrows( IllegalArgumentException.class, () -> {
      _primeFactors.solveNaive(0);
    });

    String expectedMessage = "greater than zero";
    String actualMessage = exception.getMessage();

    assertTrue(actualMessage.contains(expectedMessage));
  }
}