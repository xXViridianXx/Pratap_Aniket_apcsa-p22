//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Input
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;

		
		//adidng inputs

		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();


		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();
		
		System.out.print("Enter a double ::");
		doubleOne = keyboard.nextDouble();
		
		System.out.print("Enter a double ::");
		doubleTwo = keyboard.nextDouble();
		
		System.out.println("enter a float ::");
		floatOne = keyboard.nextFloat();
		
		System.out.println("enter a float ::");
		floatTwo = keyboard.nextFloat();
		
		System.out.println("enter a short ::");
		shortOne = keyboard.nextShort();
		
		System.out.println("enter a short ::");
		shortTwo = keyboard.nextShort();
		
		


		// input for all variables


		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		
		System.out.println("double one = " + doubleOne);
		System.out.println("double two = " + doubleTwo);
		
		System.out.println("float one = " + floatOne );
		System.out.println("float two = " + floatOne );
		
		System.out.println("short one = " + shortOne );
		System.out.println("short two = " + shortOne );
		
		

		//add in output for all variables


	}
}