package abilb.problems.math;

public class PrimeImpl implements abilb.problems.abstraction.Prime {
  
  @Override
  public boolean check( int n ){

    if( n < 1 )
      throw new IllegalArgumentException("Value must be greater than zero");
    
    if( n==1 )
      return false;

    if( n==2 || n==3 )
      return true;
    
    if( n%2==0 || n%3==0 )
      return false;
    
    for( int i = 5; i*i <= n; i=i+6 )
      if( n%i == 0 || n%(i+2)==0 )
        return false;
    
    return true;
  }
}