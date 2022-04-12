public interface Deque<E>{
	public void addFirst(E val);
	public void addLast(E val);
	public E removeFirst();
	public E removeLast();
	public E getFirst();
	public E getLast();
	public boolean isEmpty();
	public int size();
}
