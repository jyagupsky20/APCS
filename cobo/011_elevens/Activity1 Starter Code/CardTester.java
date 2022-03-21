/**Team Something Important Minus One: Joshua Yagupsky, Jonathan Song
APCS pd7
L07 --  Card Game
2022-03-20
time spent: 3.5 hr
**/
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card aceHearts = new Card("Ace", "Hearts" , 1);
		System.out.println(aceHearts.rank());
		System.out.println(aceHearts.suit());
		System.out.println(aceHearts.pointValue());
		System.out.println(aceHearts);
		Card aceHearts2 = new Card("Ace", "Hearts" , 1);
		System.out.println(aceHearts2.rank());
		System.out.println(aceHearts2.suit());
		System.out.println(aceHearts2.pointValue());
		System.out.println(aceHearts2);
		Card queenHearts = new Card("Queen", "Hearts" , 12);
		System.out.println(queenHearts.rank());
		System.out.println(queenHearts.suit());
		System.out.println(queenHearts.pointValue());
		System.out.println(queenHearts);
		System.out.println(aceHearts.matches(aceHearts2));
		System.out.println(queenHearts.matches(aceHearts));
		System.out.println(aceHearts2.matches(queenHearts));
	}
}
