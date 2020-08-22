package abilb.problems.array;

public class TrappingRainWater {
  public int find( int[] arr ){
    return optimal(arr);
  }

  // time complexity O(n)
  // space complexity O(n)
  private int optimal( int[] arr ){
    int[] leftMax = new int[arr.length];
    int[] rightMax = new int[arr.length];

    leftMax[0] = arr[0];

    for( int i = 1; i < leftMax.length; i++ )
      if( arr[i] >= leftMax[i-1] )
        leftMax[i] = arr[i];
      else 
        leftMax[i] = leftMax[i-1];

    rightMax[arr.length-1] = arr[arr.length-1];

    for( int i = arr.length-2; i >= 0; i-- )
      if( arr[i] >= rightMax[i+1] )
        rightMax[i] = arr[i];
      else 
        rightMax[i] = rightMax[i+1];
    
    int sum = 0;

    for( int i = 1; i < arr.length-1; i++ )
      sum +=  Math.max(0,(Math.min(leftMax[i], rightMax[i])-arr[i]));
    
    return sum;
  }

  // time complexity O(n^2)
  // find trapping water unit for each element
  private int naive(int[] arr){
    int units = 0;

    for( int i = 1; i < arr.length-1; i++ ){
      int lMax = 0;
      int rMax = 0;

      for( int j = 0; j < i; j++ )
        lMax = Math.max(lMax, arr[j]);
      
      for( int j = i+1; j < arr.length; j++ )
        rMax = Math.max(rMax, arr[j]);

      units += Math.max(0, Math.min(lMax, rMax) - arr[i] );
    }

    return units;
  }
}