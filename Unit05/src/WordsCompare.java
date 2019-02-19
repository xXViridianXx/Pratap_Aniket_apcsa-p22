//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
   private int compare;

	public WordsCompare()
	{
		
		setWords("hello world", "hello universe"); // initializing
		
	}

	public WordsCompare(String one, String two)
	{
		wordOne = one;
		wordTwo = two;		//0contructor
		
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo =two;		//setter
	}

	public void compare()
	{
		
		compare = wordOne.compareTo(wordTwo); //setting compare to the comparison
		
	}

	public String toString()
	{
		if(compare < 0)		//checking what compare is
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}