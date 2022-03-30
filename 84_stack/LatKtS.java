/***
 * Team Something Important: Joshua Yagupsky, Jaylen Zeng, Jonathan Song
 * APCS pd7
 * HW84 -- Stack: What Is It Good For?
 * 2022-03-28
 * time spent: 0.2 hr
***/

/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
***/

/*
DISCO:
 * It's very important to check if a stack is empty/full. You might end up with some unintended behavior if you forget.
QCC:
 * Do the test cases take care of all possible scenarios for allMatched?
*/

public class LatKtS
{

  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
    String out = "";
    Latkes stack = new Latkes(s.length());
    for (int i = 0; i < s.length(); i++) {
      stack.push(s.charAt(i)+"");
    }
    while (!stack.isEmpty()){
      out = out + stack.pop();
    }
    return out;
  }


  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/
  public static boolean allMatched( String s )
  {
    String cur = "";
    Latkes stack = new Latkes(s.length());
    for (int i = 0; i < s.length(); i++) {
      cur = s.charAt(i) + "";
      if (isOpenBrack(cur)) {
        stack.push(cur);
      }
      else if (isCloseBrack(cur) && (stack.isEmpty() || !flipOpen(stack.pop()).equals(cur))) {
        return false;
      }
    }
    return stack.isEmpty();
  }
  //Helper functions for allMatched
  private static boolean isOpenBrack(String s){
    return s.equals("{") || s.equals("(") || s.equals("[");
  }
  private static boolean isCloseBrack(String s){
    return s.equals("}") || s.equals(")") || s.equals("]");
  }
  private static String flipOpen(String s){
    if (s.equals("(")){
      return ")";
    }
    if (s.equals("{")){
      return "}";
    }
    if (s.equals("[")){
      return "]";
    }
    //Should never happen:
    return "";
  }
  //main method to test
  public static void main( String[] args )
  {
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
  }

}//end class
