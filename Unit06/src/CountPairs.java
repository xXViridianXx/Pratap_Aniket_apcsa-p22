//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		
		char[] array = str.toCharArray();
		
		for (int i = 0; i < array.length -1; i++)
		{
			
			if (array[i] == array[i+1])
			{
				count++;
			}
			
		}
		return count;
	}
}