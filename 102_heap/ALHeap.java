/*
Team Cautious Crustaceans :: Orion Roven, Joshua Yagupsky, Jonathan Song
APCS pd7
HW102: Heap On Heapin' On
2022-05-18w
time spent: .6 hrs

DISCO:
* If we add or remove using the methods we discussed in class, the heap not only maintains the heap property, but also is a complete tree.
QCC:
* Is there a more efficient way to create a heap out of a collection of elements than adding them one at a time?
*/

/**
 * class ALHeap
 * SKELETON
 * Implements a min heap using an ArrayList as underlying container
 */



import java.util.ArrayList;

public class ALHeap
{

  //instance vars
  private ArrayList<Integer> _heap;

  /**
   * default constructor  ---  inits empty heap
   */
  public ALHeap()
  {
	  _heap = new ArrayList<Integer>();
  }



  /**
   * toString()  ---  overrides inherited method
   * Returns either
   * a) a level-order traversal of the tree (simple version)
   * b) ASCII representation of the tree (more complicated, more fun)
   */
  public String toString()
  {
	  String s = "";
	  for ( int item : _heap) {
	  	s += item + " ";
	  }
	  return s;
  }//O(n)


  /**
   * boolean isEmpty()
   * Returns true if no meaningful elements in heap, false otherwise
   */
  public boolean isEmpty()
  {
	  return _heap.size() == 0;
  }//O(1)


  /**
   * Integer peekMin()
   * Returns min value in heap
   * Postcondition: Heap remains unchanged.
   */
  public Integer peekMin()
  {
	  if ( !isEmpty() ) {
      return _heap.get(0);
    } else {
      return null;
    }
  }//O(1)


  /**
   * add(Integer)
   * Inserts an element in the heap
   * Postcondition: Tree exhibits heap property.
   * ALGO:
   * Add node at leftmost unused spot and continue to swap the added node with its parent if if is less than its parent
   */
  public void add( Integer addVal )
  {
	  _heap.add(addVal);
	  int currentIndex = _heap.size()-1;
    int parentIndex = (currentIndex -1) / 2;
    Integer temp;
	  while(currentIndex >= 0 && parentIndex >= 0 && _heap.get(currentIndex) < _heap.get(parentIndex)) {
      swap(currentIndex, parentIndex);
      currentIndex = parentIndex;
      parentIndex = (currentIndex -1) / 2;
    }
  }//O(h), where h is the tree height


  /**
   * removeMin()  ---  means of removing an element from heap
   * Removes and returns least element in heap.
   * Postcondition: Tree maintains heap property.
   * ALGO:
   * Move the root out, and move in the last element to replace the root. While the element still has children, and while the root is bigger than its smallest child, swap it with its smallest child.
   */
  public Integer removeMin()
  {
    if (_heap.size() == 0){
      return null;
    }
    Integer out = _heap.remove(0); //Get the root out
    if (_heap.size() != 0) {
      _heap.add(0, _heap.remove(_heap.size()-1)); //Move in element from the bottom
      int currentIndex = 0;
      while(minChildPos(currentIndex) != -1 && _heap.get(currentIndex) > _heap.get(minChildPos(currentIndex))){
        swap(currentIndex, minChildPos(currentIndex));
        currentIndex = minChildPos(currentIndex);
      }
    }
    return out;
  }//O(h), where h is the tree height


  /**
   * minChildPos(int)  ---  helper fxn for removeMin()
   * Returns index of least child, or
   * -1 if no children, or if input pos is not in ArrayList
   * Postcondition: Tree unchanged
   */
  private int minChildPos( int pos )
  {
    if(2*pos+2 < _heap.size()) {
      if (_heap.get(2*pos+2) < _heap.get(2*pos+1)){
        return 2*pos+2;
      }
      else {
        return 2*pos+1;
      }
    }
    else if(2*pos+1 < _heap.size()){
      return 2*pos+1;
    }
    else {
      return -1;
    }
  }//O(1)


  //~~~~~~~~~~~~~ aux helper fxns ~~~~~~~~~~~~~~
  private Integer minOf( Integer a, Integer b )
  {
    if ( a.compareTo(b) < 0 )
      return a;
    else
      return b;
  }

  //swap for an ArrayList
  private void swap( int pos1, int pos2 )
  {
    _heap.set( pos1, _heap.set( pos2, _heap.get(pos1) ) );
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



  //main method for testing
  public static void main( String[] args )
  {
      ALHeap pile = new ALHeap();

      pile.add(2);
      System.out.println(pile);
      pile.add(4);
      System.out.println(pile);
      pile.add(6);
      System.out.println(pile);
      pile.add(8);
      System.out.println(pile);
      pile.add(10);
      System.out.println(pile);
      pile.add(1);
      System.out.println(pile);
      pile.add(3);
      System.out.println(pile);
      pile.add(5);
      System.out.println(pile);
      pile.add(7);
      System.out.println(pile);
      pile.add(9);
      System.out.println(pile);

      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
  }//end main()

}//end class ALHeap
