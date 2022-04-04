/*
Team Something Important: Joshua Yagupsky, Jaylen Zeng, Jonathan Song
APCS pd7
HW87 -- The English Do Not Wait In Line for Soup
2022-04-3
time spent: 0.2 hr
DISCO:

QCC:
Wouldn't this be faster with a doubly-linked list? That way, we could use the O(1) removeLast method,
instead of the O(n) it takes for a singly-linked list
*/
public class NodeQueue<T> implements Queue<T> {
  private LList<T> _queue;
  public NodeQueue(){
    _queue = new LList<T>();
  }
  public boolean isEmpty(){
    return _queue.size() == 0;
  }
  public T peekFront(){
    return _queue.get(_queue.size()-1);
  }
  public T dequeue(){
    if(isEmpty()){return null;}
    return _queue.remove(_queue.size()-1);
  }
  public void enqueue(T item){
    _queue.add(item);
  }
  public static void main(String[] args) {
    Queue<Integer> q = new NodeQueue<Integer>();
    for (int i = 0; i <= 10; i++){
      q.enqueue(i);
    }
    while (!q.isEmpty()){
      System.out.println(q.peekFront());
      q.dequeue();
    }
  }
}
