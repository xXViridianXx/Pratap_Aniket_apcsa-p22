//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		
	setString(word);	//instatiates vars
	}

	public StringOddOrEven(String s)
	{
		
		word = s;  //constructor
	}

	public void setString(String s)
	{
		
		word = s; //sets vars
	}

 	public boolean isEven()
 	{
		if (word.length() % 2 == 0) //calculates
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
 		String output = word;
 		return output;
	}
}