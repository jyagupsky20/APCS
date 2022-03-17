// Team Something Important: Joshua Yagupsky, Jaylen Zeng, Jonathan Song
//APCS pd7
//HW78 --  Doubly Linked List
//2022-03-16
//time spent: 0.25 hr


/***
 * class DLLNode
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
  public DLLNode(DLLNode prev, String value, DLLNode next)
  {
    _prevNode = prev;
    _cargo = value;
    _nextNode = next;
    if(_prevNode != null){
      _prevNode.setNext(this);
    }
    if(_nextNode != null){
      _nextNode.setPrev(this);
    }
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

  public DLLNode setNext( DLLNode newNext )
  {
    DLLNode foo = getNext();
    _nextNode = newNext;
    if(_nextNode != null && _nextNode.getPrev() != this){
      _nextNode.setPrev(this);
    }
    return foo;
  }
  public DLLNode setPrev( DLLNode newPrev )
  {
    DLLNode foo = getPrev();
    _prevNode = newPrev;
    if(_prevNode != null && _prevNode.getNext() != this){
      _prevNode.setNext(this);
    }
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    return getCargo();
  }


}//end class DLLNode
