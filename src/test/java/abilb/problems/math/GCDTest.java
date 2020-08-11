package abilb.problems.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GCDTest {

  @Test public void testDifferentCases(){
    GCD gcd = new GCD();

    int[][] cases = new int[4][];

    cases[0] = new int[]{12, 48, 12};
    cases[1] = new int[]{1,  48, 13};
    cases[2] = new int[]{48, 48, 48};
    cases[3] = new int[]{6,  48, 18};
    cases[3] = new int[]{48, 0,  48};
    cases[3] = new int[]{48, 48, 0};
    cases[3] = new int[]{0,  0,  0};

    for(int[] cs: cases){
      
      final int expected = cs[0];
      final int num1 = cs[1];
      final int num2 = cs[2];      

      int actual = gcd.euclidianIterativeDivision(num1, num2);
      assertEquals(expected,actual,"euclidianIterativeDivision("+num1+","+num2+") - expected:" + expected + ", actual: "+actual);

      actual = gcd.euclidianIterativeSubtraction(num1, num2);
      assertEquals(expected,actual,"euclidianIterativeSubtraction("+num1+","+num2+") - expected:" + expected + ", actual: "+actual);
      
      actual = gcd.euclidianRecursiveDivision(num1, num2);
      assertEquals(expected,actual,"euclidianRecursiveDivision("+num1+","+num2+") - expected:" + expected + ", actual: "+actual);
    }    
  }

}