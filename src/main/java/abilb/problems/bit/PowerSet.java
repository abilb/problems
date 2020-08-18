package abilb.problems.bit;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
  public List<String> generate( String s ){
    List<String> list = new ArrayList<String>();
    list.add("");

    int n = (int) Math.pow(2, s.length());

    for( int i = 1; i < n; i++ ){
      int tmp = i;
      int index = 0;
      StringBuilder sb = new StringBuilder();

      while( tmp > 0 ){
        if( (tmp&1) == 1 )
          sb.append( s.charAt(index) );

        index++;
        tmp >>= 1;
      }

      list.add( sb.toString() );
    }

    return list;
  }
}