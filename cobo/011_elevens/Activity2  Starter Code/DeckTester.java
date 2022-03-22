/**Team Something Important Minus One: Joshua Yagupsky, Jonathan Song
APCS pd7
L07 --  Card Game
2022-03-20
time spent: 3.5 hr
**/
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] allSuits = {"Hearts", "Clubs", "Diamonds", "Spades"};
		String[] spadeSuits = {"Spades"};
		String[] allCards = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] broadwayCards = {"Ten", "Jack", "Queen", "King", "Ace"};
		int[] allValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int[] broadwayValues = {10,11,12,13,14};
		Deck fullDeck = new Deck(allCards, allSuits, allValues);
		Deck spadeRoyalFlush = new Deck(broadwayCards, spadeSuits, broadwayValues);
		System.out.println("–––––––STARTING DECKS–––––––");
		System.out.println(fullDeck);
		System.out.println(spadeRoyalFlush);
		System.out.println("–––––––DEALING ROYAL FLUSH–––––––");
		while(!spadeRoyalFlush.isEmpty()){
			System.out.println(spadeRoyalFlush.deal());
		}
		System.out.println("–––––––END ROYAL FLUSH–––––––");
		System.out.println(spadeRoyalFlush);
		System.out.println("–––––––DEALING FULL DECK–––––––");
		while(!fullDeck.isEmpty()){
			System.out.println(fullDeck.deal());
		}
		System.out.println("–––––––END FULL DECK–––––––");
		System.out.println(fullDeck);
	}
}
