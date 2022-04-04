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

public class LList<T> implements List<T> //interface def must be in this dir
{

  //instance vars
  private LLNode<T> _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList()
  {
    _size = 0;
    _head = null;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( T newVal )
  {
    _head = new LLNode<T>(newVal, _head);
    _size++;
    return true;
  }

  public void add( int index, T newVal){
    if ( index < 0 || index > size() ){
      throw new IndexOutOfBoundsException();
    }
    if (index == 0) {
      this.add(newVal);
    }
    else{
      LLNode<T> insert = new LLNode<T>(newVal, null); //Node we are adding
      LLNode<T> temp = _head; //Node right before addition
      for (int i = 0; i < index-1; i++) {
        temp = temp.getNext();
      }
      LLNode<T> next = temp.getNext(); //Node right after addition
      //Insert the new node
      insert.setNext(next);
      temp.setNext(insert);
      _size++;
    }
  }

  public T remove( int index ) {
    T retVal = null;
    if ( index < 0 || index >= size() ){
      throw new IndexOutOfBoundsException();
    }
    if (index == 0){
      retVal = _head.getCargo();
      _head = _head.getNext();
    }
    else{
      LLNode<T> beforeRemove = _head;
      for ( int i = 0; i < index-1; i++){
        beforeRemove = beforeRemove.getNext();
      }
      retVal = beforeRemove.getNext().getCargo();
      beforeRemove.setNext(beforeRemove.getNext().getNext());
    }
    _size--;
    return retVal;
  }

  public T get( int index )
  {
    if ( index < 0 || index >= size() ){
      throw new IndexOutOfBoundsException();
    }
    LLNode<T> temp = this._head;
    for (int i = 0; i < index; i++){
      temp = temp.getNext();
    }
    return temp.getCargo();
  }


  public T set( int index, T newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    LLNode<T> temp = this._head;
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
    for(LLNode<T> temp = _head; temp != null; temp = temp.getNext()){
      out += temp.getCargo().toString();
      if(temp.getNext() != null){
        out += ",";
      }
    }
    out += "]";
    return out;
  }


}//end class LList
