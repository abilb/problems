package abilb.problems;

import java.util.*;
import java.lang.*;

public class Utils {

  public static boolean searchIntegerArray(int[] arr, int targetVal){
    for( int num: arr )
      if( targetVal == num )
        return true;
    
    return false;
  }

  public static void swapIntegersInArray3(int[] arr, int i1, int i2){
    arr[i1] = arr[i1] + arr[i2];
    arr[i2] = arr[i1] - arr[i2];
    arr[i1] = arr[i1] - arr[i2];
  }

  public static void swapIntegersInArray2(int[] arr, int i1, int i2){
    arr[i1] = arr[i1] ^ arr[i2];
    arr[i2] = arr[i1] ^ arr[i2];
    arr[i1] = arr[i1] ^ arr[i2];
  }

  public static void swapIntegersInArray1(int[] arr, int i1, int i2){
    int tmp = arr[i1];
    arr[i1] = arr[i2];
    arr[i2] = tmp;
  }

  public static void printBits( int n ){
    int[] n1 = new int[33];
        
    for( int i = 32; i >= 0; i-- ){
      n1[i] = (n & 1);
      n = n >> 1;
    }

    System.out.println( Arrays.toString(n1) );
  }
}