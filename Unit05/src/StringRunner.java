//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		StringOddOrEven wordCheck = new StringOddOrEven();
		out.println("what is your word? ::");
		String word = keyboard.nextLine();     //Reading user input
		wordCheck.setString(word);
		
		
		if (wordCheck.isEven() == true)
		{
			System.out.println(word + "this is even"); //output
		}
		else {
			System.out.println(word + " this is odd");
		}
	}
}