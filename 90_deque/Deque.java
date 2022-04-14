/*
Team Something Important: Joshua Yagupsky, Jaylen Zeng, Jonathan Song
APCS pd7
HW91 -- Deque the Halls
2022-04-13
time spent: 0.2 hr
*/
import java.util.Iterator;
public interface Deque<E> extends Iterable<E>{
	public void addFirst(E val);
	public void addLast(E val);
	public E removeFirst();
	public E removeLast();
	public E getFirst();
	public E getLast();
	public boolean isEmpty();
	public int size();
	public boolean contains(Object o);
	public Iterator<E> descendingIterator();
}
