package abilb.problems.recursion;

public class Josephus {
  public int findSurvivor(int n, int k){
    if( n < 1 && k < 1 )
      throw new IllegalArgumentException("Value(s) must be greater than zero");
    
    if( n > 10000 && k > 10000 )    
      throw new IllegalArgumentException("Value(s) must be less than 10000");

    return recursive(n, k);
  }

  private int recursive(int n, int k){
    if( n == 1 )
      return 0;
    
    return (recursive(n-1, k)+k)%n;
  }
}