/*
Team Something Important: Joshua Yagupsky, Jaylen Zeng, Jonathan Song
APCS pd7
HW90 -- Queue Two Ways
2022-04-11
time spent: 0.2 hr
*/
public interface Deque<E> extends Iterable<E>{
	public void addFirst(E val);
	public void addLast(E val);
	public E removeFirst();
	public E removeLast();
	public E getFirst();
	public E getLast();
	public boolean isEmpty();
	public int size();
}
