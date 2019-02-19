//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(in);
		
		StringEquality e = new StringEquality();
		
		out.println("Chose a word::");
		String word = keyboard.nextLine();
		

		StringEquality f = new StringEquality();
		
		out.println("Choose another word::");
		String word2 = keyboard.nextLine();
		
		e.setWords(word, word2);
		//returns output
		if (e.checkEquality() == true)
		{
			System.out.println(word + " has the same amount of letters as" +word2);
		}
		else if (e.checkEquality() == false)
		{
			System.out.println(word + " does not have the same amount of letters as " +word2);
		}
		
	}
}