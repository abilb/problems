package abilb.problems.math;

public class Palindrome {
  public boolean check(int n){

    if( n < 0 )
      throw new IllegalArgumentException("Value must be greater or equal to zero");

    int tmp = n;
    int reversed = 0;

    while( tmp > 0 ){
      int remainder = tmp%10;
      reversed = reversed * 10 + remainder; 

      tmp /= 10;
    }

    return reversed==n;
  }
}