//Team Something Important: Joshua Yagupsky, Jaylen Zeng, Jonathan Song
//APCS pd7
//HW76 -- We Got a Little Ol' Convoy
//2022-03-14
//time spent: 0.5hr
/*
DISCO:
You can do for loops with more than just integers. All you need is an initialization of a variable, an ending condition, and an incrementation operation.
QCC:

*/
/***
* class LList
* Implements a linked list of LLNodes, each containing String data
**/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList()
  {
    _size = 0;
    _head = null;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    if (_size == 0){
      _head = new LLNode(newVal, null);
      this._size++;
      return true;
    }
    else {
      LLNode temp = this._head;
      while(temp.getNext() != null){
        temp = temp.getNext();
      }
      LLNode newNode = new LLNode(newVal, null);
      temp.setNext(newNode);
      this._size++;
      return true;
    }
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() ){
      throw new IndexOutOfBoundsException();
    }
    LLNode temp = this._head;
    for (int i = 0; i < index; i++){
      temp = temp.getNext();
    }
    return temp.getCargo();
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    LLNode temp = this._head;
    for (int i = 0; i < index; i++){
      temp = temp.getNext();
    }
    temp.setCargo(newVal);
    return newVal;
  }


  //return number of nodes in list
  public int size()
  {
    return _size;
  }

  //--------------^  List interface methods  ^--------------



  // override inherited toString
  public String toString()
  {
    String out = "[";
    for(LLNode temp = _head; temp != null; temp = temp.getNext()){
      out += temp.getCargo();
      if(temp.getNext() != null){
        out += ",";
      }
    }
    out += "]";
    return out;
  }


  //main method for testing
  public static void main( String[] args )
  {

    LList james = new LList();
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );
  }

}//end class LList
