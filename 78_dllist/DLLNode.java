// Team Something Important: Joshua Yagupsky, Jaylen Zeng, Jonathan Song
//APCS pd7
//HW78 --  Doubly Linked List
//2022-03-16
//time spent:


/***
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 **/

public class DLLNode
{
  //instance vars
  private String _cargo;
  private DLLNode _nextNode;
  private DLLNode _prevNode;

  // constructor
  public LLNode(DLLNode prev, String value, DLLNode next)
  {
    _prevNode = prev;
    _cargo = value;
    _nextNode = next;
  }


  //--------------v  ACCESSORS  v--------------
  public String getCargo()
  {
    return _cargo;
  }

  public DLLNode getNext()
  {
    return _nextNode;
  }

  public DLLNode getPrev()
  {
    return _prevNode;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public String setCargo( String newCargo )
  {
    String foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public LLNode setNext( LLNode newNext )
  {
    LLNode foo = getNext();
    _nextNode = newNext;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    return getCargo();
  }


}//end class LLNode
