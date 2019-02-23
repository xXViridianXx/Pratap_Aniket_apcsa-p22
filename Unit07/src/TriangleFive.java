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
		
		setLetter('a');
		setAmount(1);
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
		
		String output = "";
		for (int i = amount; i > 0; i--)
		{
			//keeps track of which row we are on
			int j = 0;
			char temp = letter;
			while (j < i)
			{
				for (int k = amount - j; k > 0; k--)
				{
					output += temp;
				}
				//changes the value of temp and decreases the number of letters the 
				// next character will be printed
				if (temp == 'Z' || temp == 'z')
				{
					temp -= 25;
				}
				else {
					temp ++;
				}
				output += " ";
				j++;
			}
			output += "\n";
			
		}
		return output;
	}
}