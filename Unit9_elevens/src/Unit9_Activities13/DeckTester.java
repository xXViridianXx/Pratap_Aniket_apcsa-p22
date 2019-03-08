package Unit9_Activities13;

public class DeckTester 
{

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	private static String[] Suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
	private static String[] Ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	private static int[] pointValues = {2,3,4,5,6,7,8,9,10,10,10,10,11};
	
	public static void main(String[] args)
	{
		
		Deck test = new Deck(Ranks, Suits,pointValues);
		System.out.println(test);
	}
}