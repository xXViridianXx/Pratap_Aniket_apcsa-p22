//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.lang.reflect.Array;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		
		set('a',1);
	}

	public TriangleFive(char c, int amt)
	{
		letter = c;
		amount = amt;
		
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		for(int i = 0; i <= alpha.length-1; i++)
		{
			for(int a = 0 ; a <= amount; i++ )
			{
				System.out.println(alpha[i] -1);
			}
		}
		String output="";
		return output;
	}
}