package abilb.problems.array;

public class LongestEvenOdSubarray {
  public int find( int[] arr ){
    return optimal(arr);
  }

  private int optimal(int[] arr){
    int max = 1;
    int length = 1;

    for( int i = 0; i < arr.length-1; i++ )
      if( ((arr[i]^arr[i+1])&1) == 1 ){
        length++;
        max = Math.max(max, length);
      }
      else
        length = 1;    

    return max;
  }

  /* 
    why ((arr[j]^arr[j+1])&1) == 1
    short way to check even and odd
  */
  private int naive( int[] arr ){
    int max = 1;    

    for(int i = 0; i < arr.length-1; i++){
      int length = 1;

      for( int j = i; j < arr.length-1; j++ )
        if( ((arr[j]^arr[j+1])&1) == 1 )
          length++;
        else
          break;
      
      max = Math.max( max, length );
    }

    return max;
  }
}