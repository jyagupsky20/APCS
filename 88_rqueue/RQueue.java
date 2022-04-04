/*
Team Something Important: Joshua Yagupsky, Jaylen Zeng, Jonathan Song
APCS pd7
HW88 -- BPC Kiddies Do Not Wait in Line Either
2022-04-4
time spent: 0.5 hr
DISCO:

QCC:
What would be a use for an RQueue?
*/
/***
 * class RQueue
 * SKELETON
 * A node-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 **/


public class RQueue<T> implements Queue<T>
{
  //instance variables
  private LLNode<T> _front, _end;
  private int _size;


  // default constructor creates an empty queue
  public RQueue()
  {
    _front = null;
    _end = null;
    _size = 0;
  }

  //This is the random one!
  public void enqueue( T enQVal )
  {
    _size++;
    if (isEmpty()){
      _front = new LLNode<T>(enQVal, null);
      _end = _front;
      return;
    }
    LLNode<T> tracker = _front;
    int pos = (int) ((this._size-1) * Math.random());
    for (int i = 0; i < pos; i++){
      tracker = tracker.getNext();
    }
    LLNode<T> next = tracker.getNext();
    tracker.setNext(new LLNode<T>(enQVal, next));
  }//O(n)


  // remove and return thing at front of queue
  // assume _queue ! empty
  public T dequeue()
  {
    if (isEmpty()){return null;}
    T ret = _front.getCargo();
    _front = _front.getNext();
    _size--;
    return ret;
  }//O(1)


  public T peekFront()
  {
    return _front.getCargo();
  }//O(1)


  /***
   * void sample() -- a means of "shuffling" the queue
   * Algo:
   *   Dequeue an element and enqueue it randomly. This should be done at least _size times
   **/
  public void sample ()
  {
    T val;
    for (int i = 0; i< _size; i++){
      val = dequeue();
      enqueue(val);
    }
  }//O(n^2)


  public boolean isEmpty()
  {
    return _front == null;
  } //O(1)


  // print each node, separated by spaces
  public String toString()
  {
    String out = "";
    for (LLNode<T> i = _front; i != null; i = i.getNext()) {
      out = i.getCargo() + " " + out;
    }
    return out;
  }//end toString()



  //main method for testing
  public static void main( String[] args )
  {
    RQueue<String> PirateQueue = new RQueue<String>();

    System.out.println("\nnow enqueuing...");
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Roberts");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");

    System.out.println("\nShuffling 10 times!");
    for (int i = 0;i< 10 ;i++ ) {
      PirateQueue.sample();
      System.out.println(PirateQueue);
    }

    System.out.println("\nnow testing toString()...");
    System.out.println( PirateQueue ); //for testing toString()...

    System.out.println("\nnow dequeuing...");
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );

    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n");
    System.out.println( PirateQueue.dequeue() );

  }//end main

}//end class RQueue
