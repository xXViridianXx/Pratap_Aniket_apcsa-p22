//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		

		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		double payment = Discount.getDiscountedBill(amt);
		
		
		out.print("Bill after discount :: $"  + payment);
		

	}
}