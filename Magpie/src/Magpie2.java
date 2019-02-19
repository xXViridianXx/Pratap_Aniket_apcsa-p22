/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
<<<<<<< HEAD
		
		if (statement.length() <= 1)
		{
			response = "Say something please";
		}
		
=======
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
>>>>>>> 459860760c3b1af61e80ae219fc04a6748efb1d9
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
<<<<<<< HEAD
		
		else if(statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0 ||statement.indexOf("dragon") >= 0)
				{
			response = "Tell me more about your pets";
				}
		
		else if (statement.indexOf("Mauro") >= 0)
		{
			response = " Mauro is a beast";
		}
		else if (statement.indexOf("fortnite") >= 0)
		{
			response = "You should stop playing videogames";
		}
		
		else if (statement.indexOf("Canyon Crest Academy") >= 0 || statement.indexOf("CCA") >= 0)
		{
			response = "You are so cool!";
		}
		
		else if (statement.indexOf("Minecraft") >= 0)
		{
			response = "You are so cool";
		}
		else if(statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
=======
>>>>>>> 459860760c3b1af61e80ae219fc04a6748efb1d9
		else
		{
			response = getRandomResponse();
		}
		return response;
<<<<<<< HEAD
		
=======
>>>>>>> 459860760c3b1af61e80ae219fc04a6748efb1d9
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
<<<<<<< HEAD
		final int NUMBER_OF_RESPONSES = 6;
=======
		final int NUMBER_OF_RESPONSES = 4;
>>>>>>> 459860760c3b1af61e80ae219fc04a6748efb1d9
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
<<<<<<< HEAD
		else if (whichResponse == 4)
		{
			response = "I like you";
		}
		else if (whichResponse == 5)
		{
			response = "You are amazing";
		}
=======
>>>>>>> 459860760c3b1af61e80ae219fc04a6748efb1d9

		return response;
	}
}
