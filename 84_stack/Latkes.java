/***
 * Team Something Important: Joshua Yagupsky, Jaylen Zeng, Jonathan Song
 * APCS pd7
 * HW83 -- Stacks on Stacks
 * 2022-03-28
 * time spent: 0.2 hr
 * class Latkes
 * v1
 * SKELETON
 * Implements a stack of Strings using an encapsulated array
 **/

/***
  DISCO:
  The _stackSize variable tracks the first "junk" element of the internal array, i.e, the first element we can safely overwrite.
  QCC:

 **/


public class Latkes
{
  private String [] _stack;
  private int _stackSize;//Stack size represents the index of the first unused item


  //constructor
  public Latkes( int initCapacity )
  {
    _stack = new String[initCapacity];
    _stackSize = 0;
  }// O(1)


  //means of insertion
  public void push( String s )
  {
    if (!isFull()) {
      _stack[_stackSize] = s;
      _stackSize++;
    }
  }// O(1)


  //means of removal
  public String pop( )
  {
    if(!isEmpty()){
      _stackSize--;
      return _stack[_stackSize];
    }
    return null;
  }// O(1)


  //chk for emptiness
  public boolean isEmpty()
  {
    return _stackSize <= 0;
  }// O(1)


  //chk for fullness
  public boolean isFull()
  {
    return _stackSize >= _stack.length;
  }// O(1)


  //main method for testing
  public static void main( String[] args )
  {
    Latkes testCase = new Latkes(1);
    testCase.push("thing");
    System.out.println(testCase.pop());

    Latkes tastyStack = new Latkes(10);

    tastyStack.push("aoo");
    tastyStack.push("boo");
    tastyStack.push("coo");
    tastyStack.push("doo");
    tastyStack.push("eoo");
    tastyStack.push("foo");
    tastyStack.push("goo");
    tastyStack.push("hoo");
    tastyStack.push("ioo");
    tastyStack.push("joo");
    tastyStack.push("coocoo");
    tastyStack.push("cachoo");

    //cachoo
    System.out.println( tastyStack.pop() );
    //coocoo
    System.out.println( tastyStack.pop() );
    //joo
    System.out.println( tastyStack.pop() );
    //ioo
    System.out.println( tastyStack.pop() );
    //hoo
    System.out.println( tastyStack.pop() );
    //goo
    System.out.println( tastyStack.pop() );
    //foo
    System.out.println( tastyStack.pop() );
    //eoo
    System.out.println( tastyStack.pop() );
    //doo
    System.out.println( tastyStack.pop() );
    //coo
    System.out.println( tastyStack.pop() );
    //boo
    System.out.println( tastyStack.pop() );
    //aoo
    System.out.println( tastyStack.pop() );

    //stack empty by now; SOP(null)
    System.out.println( tastyStack.pop() );
  }//end main()

}//end class Latkes
