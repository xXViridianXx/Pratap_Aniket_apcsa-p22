//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		
		while(number > 0)
		{
			number /= 10;
			count++;
		}
		return count;
		
		
		
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		
		int i = 0;
		int num = number;
				
			while ( num > 0 )
			{
				sorted[i] = num % 10;
				num /= 10;
				i++;
			}
			
			int j = 1;
			
			while(j < sorted.length)
			
			{
				int k = j;
				
				while ( k > 0 && sorted[ k -1] > sorted[k])
				{
					int temp = sorted[k];
					
					sorted[k] = sorted[k-1];
					
					sorted[k-1] = temp;
					
					k--;
					
				}
				j++;
			}
			
			
		
		return sorted;
	}
}