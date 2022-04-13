/*
Team Something Important: Joshua Yagupsky, Jaylen Zeng, Jonathan Song
APCS pd7
HW90 -- Queue Two Ways
2022-04-11
time spent: 0.2 hr
*/
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
		for (Integer i : frenchDeck) {
			System.out.println(i);
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
