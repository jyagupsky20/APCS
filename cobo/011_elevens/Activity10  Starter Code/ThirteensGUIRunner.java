/**Team Something Important Minus One: Joshua Yagupsky, Jonathan Song
APCS pd7
L07 --  Card Game
2022-03-20
time spent: 3.5 hr
**/
/**
 * This is a class that plays the GUI version of the Elevens game.
 * See accompanying documents for a description of how Elevens is played.
 */
public class ThirteensGUIRunner {

	/**
	 * Plays the GUI version of Elevens.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		Board board = new ThirteensBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}
}
