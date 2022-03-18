/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] s1 = {"Ace","Queen","King","Jack","10","9","8","7","6","5","4","3","2"};
		Deck spades = new Deck(s1, {"Spades","Spades","Spades","Spades","Spades","Spades","Spades","Spades","Spades","Spades","Spades","Spades","Spades"}, {14,13,12,11,10,9,8,7,6,5,4,3,2});\
		Deck aces = new Deck({"Ace","Ace","Ace","Ace"}, {"Spades","Diamonds","Clubs","Hearts"}, {14,14,14,14});
		Deck royalFlush new Deck({"Ace","Queen","King","Jack","10"}, {"Spades","Spades","Spades","Spades","Spades"}, {14,13,12,11,10});
		System.out.println(spades);
		System.out.println(aces);
		System.out.println(royalFlush);
	}
}
