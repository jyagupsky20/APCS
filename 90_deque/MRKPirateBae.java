/*
Team Something Important: Joshua Yagupsky, Jaylen Zeng, Jonathan Song
APCS pd7
HW91 -- Deque the Halls
2022-04-13
time spent: 0.2 hr
*/
import java.util.Iterator;
public class MRKPirateBae {
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
		System.out.println("Ascending:");
		for (Integer i : frenchDeck) {
			System.out.println(i);
		}
		//Descending Iterator
		System.out.println("Descending");
		Iterator<Integer> it = frenchDeck.descendingIterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("Contains 6?: "+ frenchDeck.contains(6));
		//Getting and removing elements from both sides
		for(int i = 0; i < 5; i++){
			System.out.println(frenchDeck.getFirst());
			frenchDeck.removeFirst();
		}

		System.out.println("Contains 6?: "+ frenchDeck.contains(6));
		for(int i = 0; i < 5; i++){
			System.out.println(frenchDeck.getLast());
			frenchDeck.removeLast();
		}
		System.out.println("Contains 6?: "+ frenchDeck.contains(6));
		System.out.println("Empty?: " + frenchDeck.isEmpty());
		System.out.println("Size: " + frenchDeck.size());
	}
}
