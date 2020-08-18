package abilb.problems.bit;

public class NumberComplement {

  int findComplementWithPow( int num ){

    if( num < 1 )
      throw new IllegalArgumentException("Value must be greater than zero");
    
    // get most siginificant bit's position
    int tmp = num;
    int p = 0;

    while(tmp > 0){
      tmp = tmp >> 1;
      p++;
    }

    // flipp all bits until p
    for( int i = 0; i < p; i++ ){
      num = num ^ (1<<i);  
    }

    return num;
  }
}