package abilb.problems.array;

import java.util.ArrayList;
import java.util.List;

public class MaxCircularSubarraySum {
  public int find( int[] arr ){
    return optimal(arr);
  }

  // T(n) = O(n)
  // dp
  private int optimal( int[] arr ){
    int n = arr.length;
    int totalSum = 0;

    int prevSum = arr[0];
    int maxNormal = prevSum;
    totalSum += prevSum;

    for( int i = 1; i < n; i++ ){
      totalSum += arr[i];

      int currSum = prevSum + arr[i];
      prevSum = Math.max( currSum, arr[i] );
      maxNormal = Math.max(maxNormal, prevSum);
    }

    prevSum = arr[0];
    int minNormal = prevSum;
    
    for( int i=1; i<n; i++ ){
      int currSum = prevSum + arr[i];
      prevSum = Math.min( currSum, arr[i] );
      minNormal = Math.min( minNormal, prevSum );
    }

    int maxCircular = totalSum - minNormal;
    
    return Math.max(maxNormal,maxCircular);
  }
  // T(n) = O(n^2)
  private int naive2(int[] arr){
    int max = 0;
    int n = arr.length;

    for( int i=0; i < n; i++ ){      
      int current_sum = 0;
      int current_max = arr[i];

      for( int j = 0; j < n; j++ ){
        int current_index = (i+j)%n;
        current_sum += arr[current_index];
        current_max = Math.max( current_max, current_sum );
      }

      max = Math.max(max, current_max);
    }

    return max;
  }

  // T(n) = O(n^2)
  private int naive( int[] arr ){
    int n = arr.length;
    int max = arr[0];

    for(int i = 0; i < n; i++){
      int sum = 0;
      for( int j = i; j < n+i; j++ ){        
        sum += arr[j%n];
        max = Math.max(max, sum);
      }
    }

    return max;
  }
}