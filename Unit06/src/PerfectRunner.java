//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		
		
		Scanner keyboard = new Scanner(in);
		Perfect pNumber = new Perfect();
		out.println("what is your number? ::");
		int num = keyboard.nextInt();     //Reading user input
		pNumber.setPerfect(num);
		
		
		
		
		
		if (pNumber.isPerfect() == true)
		{
			System.out.println(pNumber + "is perfect"); //output
		}
		else {
			System.out.println(pNumber + " is not perfect");
		}
																
	}
}