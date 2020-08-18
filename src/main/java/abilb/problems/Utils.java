package abilb.problems;

import java.util.*;
import java.lang.*;

public class Utils {
  void printBits( int n ){
    int[] n1 = new int[33];
        
    for( int i = 32; i >= 0; i-- ){
      n1[i] = (n & 1);
      n = n >> 1;
    }

    System.out.println( Arrays.toString(n1) );
  }
}