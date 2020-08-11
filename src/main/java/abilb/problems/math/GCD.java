package abilb.problems.math;

public class GCD {
  int euclidianIterativeDivision( int num1, int num2 ){
    if( num1==0 || num2==0 )
      return num1==0 ? num2 : num1;

    int max = Math.max(num1, num2);
    int min = Math.min(num1, num2);

    if( max==min )
      return max;
    
    int dividend = max;
    int divisor = min;
    int remainder = dividend % divisor;

    while( remainder > 0 ){
      dividend = divisor;
      divisor = remainder;
      remainder = dividend%divisor;
    }

    return divisor;
  }

  int euclidianIterativeSubtraction(int num1, int num2){

    if( num1==0 || num2==0 )
      return num1==0 ? num2 : num1;

    while( num1 != num2 )
      if( num1 > num2 )
        num1 = num1-num2;
      else  
        num2 = num2-num1;
    
    return num1;
  }

  int euclidianRecursiveDivision(int num1, int num2){
    
    if( num2 == 0 )
      return num1;
    
    return euclidianRecursiveDivision( num2, num1%num2 );
  }
}