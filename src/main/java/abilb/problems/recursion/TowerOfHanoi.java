package abilb.problems.recursion;

public class TowerOfHanoi {
  public void move(int numOfDisks, String from, String to, String helper){
    if( numOfDisks == 1 )
    {
      System.out.println("Move disk 1 from " +  from + " to " + to); 
      return;
    }
    
    move(numOfDisks-1, from, helper, to);
    System.out.println( "Move disk " + numOfDisks + " from " +  from + " to " + to );
    move(numOfDisks-1, helper, to, from);
  }
}