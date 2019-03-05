package Unit9_Activities13;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		Card test1 = new Card("Jack", "Hearts", 10);
		test1.suit();
		test1.rank();
		test1.pointValue();
		System.out.println(test1.toString());
		
		Card test2 = new Card("Four", "Diamonds", 4);
		test2.suit();
		test2.rank();
		test2.pointValue();
		System.out.println(test2.matches(test1));
		System.out.println(test2.toString());
		
		Card test3 = new Card("Ace", "Spades", 1);
		test3.suit();
		test3.rank();
		test3.pointValue();
		test3.matches(test1);
		System.out.println(test3.toString());
		
		Card test4 = new Card("Jack", "Hearts", 10);
		test4.suit();
		test4.rank();
		test4.pointValue();
		System.out.println(test4.matches(test1));
		System.out.println(test4.toString());

	}
}
