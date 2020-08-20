package abilb.problems.array;

import abilb.problems.Utils;

public class MoveZerosToEnd {
  public int[] rearrange(int[] arr){
    int count = 0;

    for( int i = 0; i < arr.length; i++ ){
      if( arr[i] != 0 ){        
        Utils.swapIntegersInArray1(arr, i, count);
        count++;
      }
    }
    
    return arr;
  }

  public int[] rearrange1( int[] arr ){

    int zeroPointer = 0;
    int nonZeroPointer = 0;

    while( nonZeroPointer < arr.length && zeroPointer < arr.length ){
      
      if( arr[nonZeroPointer] == 0 ){
        nonZeroPointer++;
        continue;
      }
      else if( arr[zeroPointer] != 0 ){
        zeroPointer++;
        continue;
      }
      else if( nonZeroPointer < zeroPointer ){
        nonZeroPointer++;
        continue;
      }

      if( nonZeroPointer < arr.length && zeroPointer < arr.length )
        Utils.swapIntegersInArray2(arr, nonZeroPointer, zeroPointer);
    }

    return arr;
  }

}