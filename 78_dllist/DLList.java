//Team Something Important: Joshua Yagupsky, Jaylen Zeng, Jonathan Song
//APCS pd7
//HW77 -- Insert|Remove
//2022-03-15
//time spent: 0.25hr
/*
DISCO:

QCC:

ALGO ADD:
1. If you are adding an item to the beginning, set the head to a new node which contains the desired value and points to the old head. Exit.
2. Otherwise, created a node called insert which contains the desired value and points to zero.
3. Let the node temp equal the head. Repeatedly set temp to its next node until you reach the node right before the desired index.
4. Make the insert node point to the node right after temp, and make temp point to insert. Exit.
ALGO REM:
1. If removing a node at the beginning of the List, simply set the _head to the next node.
2. Otherwise, iterate through List until you reach the index before the index of the node you want to remove. Set Node temp equal to the node at that position.
3. Set this node to point to the node after the next node. 
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
    _head = new LLNode(newVal, _head);
    _size++;
    return true;
  }

  public void add( int index, String newVal){
    if ( index < 0 || index > size() ){
      throw new IndexOutOfBoundsException();
    }
    if (index == 0) {
      this.add(newVal);
    }
    else{
      LLNode insert = new LLNode(newVal, null); //Node we are adding
      LLNode temp = _head; //Node right before addition
      for (int i = 0; i < index-1; i++) {
        temp = temp.getNext();
      }
      LLNode next = temp.getNext(); //Node right after addition
      //Insert the new node
      insert.setNext(next);
      temp.setNext(insert);
      _size++;
    }
  }

  public String remove( int index ) {
    String retVal = "";
    if ( index < 0 || index >= size() ){
      throw new IndexOutOfBoundsException();
    }
    if (index == 0){
      retVal = _head.getCargo();
      _head = _head.getNext();
    }
    else{
      LLNode beforeRemove = _head;
      for ( int i = 0; i < index-1; i++){
        beforeRemove = beforeRemove.getNext();
      }
      retVal = beforeRemove.getNext().getCargo();
      beforeRemove.setNext(beforeRemove.getNext().getNext());
    }
    _size--;
    return retVal;
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
    System.out.println( "_size: " + james.size() );

    james.add("beat");
    System.out.println( james );
    System.out.println( "_size: " + james.size() );

    james.add("a");
    System.out.println( james );
    System.out.println( "_size: " + james.size() );

    james.add("need");
    System.out.println( james );
    System.out.println( "_size: " + james.size() );

    james.add("I");
    System.out.println( james );
    System.out.println( "_size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );
    james.add(1, "don't");
    System.out.println(james);
    String deleted = james.remove(1);
    System.out.println(deleted);
    System.out.println(james);
  }

}//end class LList
