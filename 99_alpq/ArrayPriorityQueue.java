/**
Team Cautious Crustaceans :: Orion Roven, Joshua Yagupsky, Jonathan Song
APCS pd7
HW99 -- Some Are More Equal Than Others Codified
2022-05-15
time spent: 0.5 hrs
**/
import java.util.ArrayList;
public class ArrayPriorityQueue implements PriorityQueue {
    private ArrayList<Integer> _queue; //Holds the queue

    //O(1), we're just initializing the ArrayList
    public ArrayPriorityQueue() {
        _queue = new ArrayList<Integer>();
    }

    //O(n), since we have to check every item in the list in the worst case before inserting
    public void add(int item) {
        for(int i = 0; i < _queue.size(); i++){
            if(_queue.get(i) <= item){
                _queue.add(i, item);
                return;
            }
        }
        _queue.add(item);
    }

    //O(1), we're removing the last item of an ArrayList
    public int removeMin() {
        return _queue.remove(_queue.size()-1);
    }

    //O(1), we're just getting an item of an ArrayList
    public int peekMin() {
       return _queue.get(_queue.size()-1);
    }

    //O(1), we're checking if an ArrayList is empty
    public boolean isEmpty() {
        return _queue.isEmpty();
    }
    public static void main(String[] args){
       ArrayPriorityQueue q = new ArrayPriorityQueue();
       for(int i = 0; i<=10; i++){
            q.add(i);
       }
       while (!q.isEmpty()) {
            System.out.println(q.peekMin());
            q.removeMin();
       }
    }
}
