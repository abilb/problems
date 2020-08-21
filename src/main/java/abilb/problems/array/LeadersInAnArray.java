package abilb.problems.array;

import java.util.*;

public class LeadersInAnArray {
  public List<Integer> find( int[] arr ){
    List<Integer> list = new ArrayList<Integer>();
    int n = arr.length;

    if( n == 0 )
      return list;

    list.add(arr[n-1]);
    
    for( int i = n-2; i >= 0; i-- )
      if( arr[i] > list.get( list.size()-1 ) )
        list.add( arr[i] );

    return list;
  } 
}