package abilb.problems.array;

import abilb.problems.Utils;

public class RotateByD {
  public int[] toLeft(int[] arr, int d){
    d = d % arr.length;

    if( d == arr.length)
      return arr;

    return optimal(arr, d);
  }

  private int[] optimal(int[] arr, int d){
    int n = arr.length;

    reverse(arr, 0, d-1);
    reverse(arr, d, n-1);
    reverse(arr, 0, n-1);
        
    return arr;
  }

  private void reverse(int[] arr, int l, int r){
    while( l < r){
      Utils.swapIntegersInArray2( arr, l, r );
      l++;
      r--;
    }
  }

  // Time complexity is n*d
  private int[] naive(int[] arr, int d){
    for( int i= 0; i < d; i++ )
      toLeftByOne(arr);      
      
    return arr;  
  }

  private int[] toLeftByOne(int[] arr){
    int n = arr.length;

    for( int i = 0; i < arr.length - 1; i++ )
        Utils.swapIntegersInArray2( arr, i, (i+(n-1))%n );
    
    return arr;
  }

}