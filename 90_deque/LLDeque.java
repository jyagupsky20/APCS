/*
Team Something Important: Joshua Yagupsky, Jaylen Zeng, Jonathan Song
APCS pd7
HW91 -- Deque the Halls
2022-04-13
time spent: 0.2 hr
*/
import java.util.LinkedList;
import java.util.Iterator;
public class LLDeque<E> implements Deque<E>{
	LinkedList<E> _list;
	public LLDeque(){
		_list = new LinkedList<E>();
	}
	public int size(){
		return _list.size();
	}
	public void addFirst(E val){
		_list.addFirst(val);
	}
	public E removeFirst(){
		return _list.removeFirst();
	}
	public E getFirst(){
		return _list.getFirst();
	}
	public E getLast(){
		return _list.getLast();
	}
	public boolean isEmpty(){
		return _list.isEmpty();
	}
	public Iterator<E> iterator(){
		return _list.iterator();
	}
	public void addLast(E val) {
		_list.addLast(val);
	}
	public E removeLast(){
		return _list.removeLast();
	}
	public boolean contains(Object o){
		return _list.contains(o);
	}
	public Iterator<E> descendingIterator(){
		return _list.descendingIterator();
	}
}
