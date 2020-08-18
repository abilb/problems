package abilb.problems.bit;

public class ToggleKthBit {
  public int toggle(int num, int k){
    if( num < 1 )
      throw new IllegalArgumentException("Num must be greater than zero");

    if( !(k > 0 && k < 32) )
      throw new IllegalArgumentException("K must be grater than zero and smaller than 32");

    int value = 1<<(k-1);
    return num ^ value;
  }

  public int set(int num, int k){
    if( num < 1 )
      throw new IllegalArgumentException("Num must be greater than zero");

    if( !(k > 0 && k < 32) )
      throw new IllegalArgumentException("K must be grater than zero and smaller than 32");

    int value = 1<<(k-1);
    return value | num; 
  }

  public int unset(int num, int k){
    if( num < 1 )
      throw new IllegalArgumentException("Num must be greater than zero");

    if( !(k > 0 && k < 32) )
      throw new IllegalArgumentException("K must be grater than zero and smaller than 32");

    int value = ~(1<<(k-1));
    return value & num;
  }
}