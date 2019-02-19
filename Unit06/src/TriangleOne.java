//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word=""; //initialize
	}

	public TriangleOne(String s)
	{
		word = s;
		
	}

	public void setWord(String s)
	{
		
		word = s;
	}

	public void print( )
	{
		
		int l = word.length(); //for loop dealing with word
		
		for (int i = 0; i < word.length() ; i++)
		{
			System.out.println(word.substring(0, l));
			
			l--;
			
		}
	
	}
}