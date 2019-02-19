//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
		
		setWords(wordOne, wordTwo); //initiates variables
	}

	public StringEquality(String one, String two)
	{
		wordOne = one;
		wordTwo = two;  //constructor
		
	}

	public void setWords(String one, String two)
	{
		wordOne = one; //sets vars
		wordTwo = two;
		
	}

	public boolean checkEquality( ) //checking equality
	{
		if (wordOne.equals(wordTwo))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String toString()
	{
		return wordOne + " does not have the same letters as " + wordTwo + "\n";
	}
}