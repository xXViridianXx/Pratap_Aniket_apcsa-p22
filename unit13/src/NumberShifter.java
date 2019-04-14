//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] listed = new int[size];
		
		for(int i = 0; i < size; i++)
		{
			listed[i] = (int)(Math.random() * 10 + 1);
		}
		
		return listed ;
	}
	public static void shiftEm(int[] array)
	{
		
		
		int i = 1;
				
		while(i < array.length)
		{
			int j = i;
			
			while ( j > 0 && array[j-1] != 7 && array[j] == 7)
			{
				int temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
				j--;
			}
			i++;
		}
		
		}
	}