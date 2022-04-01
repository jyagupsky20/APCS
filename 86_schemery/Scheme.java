/*
Team Something Important: Joshua Yagupsky, Jaylen Zeng, Jonathan Song
APCS pd7
HW86 -- What a Racket
2022-03-31
time spent: 1 hr
*/
/***
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Use regex to split your string into an array of tokens.
 *   2. Keep adding tokens to your main stack until you hit a closing bracket.
 *   3. Pop off tokens onto the secondary stack until you see an operation. Record the operation and pop it and the opening bracket off.
 *   4. Unload the second stack using the recorded operation.
 *   5. Push the result of the second stack evaluation to the main stack.
 *   6. After all of the tokens have been pushed and evaluated, return the peekTop of the main stack.
 * ALGORITHM for UNLOADING:
 *   1. Set the running total to the pop of the given stack.
 *   2. Set the current character to the empty string.
 *   3. Pop tokens off the stack. If they are numeric, add/subtract/multiply them to the running total
 *   4. If you hit a closing parenthesis, stop. Return the runningTotal
 * STACK OF CHOICE: LLStack by Team Something Important
 * b/c We can use LLStack's quick push, peek, and pop operations
 **/

public class Scheme
{
  /***
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   **/
  public static String evaluate( String expr )
  {
    LLStack<String> stack = new LLStack<String>();
    Stack<String> opStack = new LLStack<String>();

    String[] exprList = expr.split("\\s+");
    int currentOp = 0;
    for(String token : exprList){
      if (!token.equals(")")){
        stack.push(token);
      }
      else {
        stack.push(token);
        while (!(stack.peekTop().equals("+") || stack.peekTop().equals("-") || stack.peekTop().equals("*"))){
          opStack.push(stack.pop());
        }
        //Get the operation
        if (stack.peekTop().equals("+")) {
          currentOp = 1;
        }
        else if(stack.peekTop().equals("-")){
          currentOp = 2;
        }
        else{
          currentOp = 3;
        }
        //Get rid of the open parenthesis and operation
        stack.pop();
        stack.pop();
        //Add the unpack to the stack
        stack.push(unload(currentOp, opStack));
      }
    }
    return stack.peekTop();
  }//end evaluate()


  /***
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   **/
  public static String unload( int op, Stack<String> numbers )
  {
    int runningTotal = Integer.parseInt(numbers.pop());
    String currentChar = "";
    while (! numbers.isEmpty()){
      currentChar = numbers.pop();
      if(isNumber(currentChar)){
        if(op == 1){
          runningTotal += Integer.parseInt(currentChar);
        }
        else if(op ==2){
          runningTotal -= Integer.parseInt(currentChar);
        }
        else {
          runningTotal *= Integer.parseInt(currentChar);
        }
      }
    }
    return runningTotal+"";
  }//end unload()



  //optional check-to-see-if-its-a-number helper fxn:
  public static boolean isNumber( String s ) {
    try {
      Integer.parseInt(s);
      return true;
    }
    catch( NumberFormatException e ) {
      return false;
    }
  }



  //main method for testing
  public static void main( String[] args )
  {
      String zoo1 = "( + 4 3 )";
      System.out.println(zoo1);
      System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
      //...7

      String zoo2 = "( + 4 ( * 2 5 ) 3 )";
      System.out.println(zoo2);
      System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
      //...17

      String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
      System.out.println(zoo3);
      System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
      //...29

      String zoo4 = "( - 1 2 3 )";
      System.out.println(zoo4);
      System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
      //...-4
  }//main()

}//end class Scheme
