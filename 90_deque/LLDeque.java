/*
Team Something Important: Joshua Yagupsky, Jaylen Zeng, Jonathan Song
APCS pd7
HW90 -- Queue Two Ways
2022-04-11
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
	public static void main(String[] args) {
		Deque<Integer> frenchDeck = new LLDeque<Integer>();
		System.out.println("Empty?: " + frenchDeck.isEmpty());
		System.out.println("Size: " + frenchDeck.size());
		//Adding elements on both sides
		for (int i = 0;i < 10 ;i++ ) {
			if (i % 2 == 0) {
				frenchDeck.addFirst(i);
			}
			else {
				frenchDeck.addLast(i);
			}
		}
		System.out.println("Empty?: " + frenchDeck.isEmpty());
		System.out.println("Size: " + frenchDeck.size());
		//Iterator
		for (Integer i : frenchDeck) {
			System.out.println(i);
		}
		//Getting and removing elements from both sides
		for(int i = 0; i < 5; i++){
			System.out.println(frenchDeck.getFirst());
			frenchDeck.removeFirst();
		}
		for(int i = 0; i < 5; i++){
			System.out.println(frenchDeck.getLast());
			frenchDeck.removeLast();
		}
		System.out.println("Empty?: " + frenchDeck.isEmpty());
		System.out.println("Size: " + frenchDeck.size());
	}
}
