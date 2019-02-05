//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		
		if (a > b) //the greater value minus lesser value
		{
			return a-b;
		}
		
		else if (b > a) //the greater value minus lesser value
		{
			return b - a;
		}
		else { //both values are equal
			return  a*b;
		}
	}
}