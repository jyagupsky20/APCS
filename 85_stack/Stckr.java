/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    Stack<String> cakes = new ALStack<String>();
    //Stack<String> cakes = new LLStack<String>();
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    String[] bob = {"Apple", "Banana", "Cranberry", "Durian", "Eggfruit", "Fig", "Grape", "Huckleberry"};
    for (String fruit : bob) {
      cakes.push(fruit);
    }
    //Prints the fruits in reverse order
    while(!cakes.isEmpty()){
      System.out.println(cakes.peekTop());
      cakes.pop();
    }
  }//end main

}//end class
