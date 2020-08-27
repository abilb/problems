package abilb.problems.array;

public class SubarrayWithGivenSum {
  public boolean find( int[] arr, int sum ){
    return optimal(arr, sum);
  }

  // O(N)
  private boolean optimal( int[] arr, int givenSum ){
    int n = arr.length;
    int localSum = arr[0];
    int pointer1 = 0;
    int pointer2 = 1;

    while( pointer2 < n && pointer1 < n )
      if( localSum==givenSum )
        return true;      
      else if( localSum < givenSum ){
        localSum += arr[pointer2];
        pointer2++;
      }
      else{
        localSum -= arr[pointer1];
        pointer1++;
      }

    return localSum==givenSum;
  }

  private boolean naive1(int[] arr, int givenSum){
    int n = arr.length;

    for( int i=0; i<n; i++ ){
      int localSum = 0;
      for( int j=i; j<n; j++ ){     
        localSum += arr[j];
        if( localSum==givenSum )
          return true;
      }
    }

    return false;
  }
}