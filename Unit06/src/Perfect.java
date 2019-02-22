//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   
   
 public Perfect() {
	setPerfect(0);
 }
	//add constructors
   
   public Perfect(int n)
   {
	  setPerfect(n);
   }

	//add a set method
   
   public void setPerfect(int n)
   {
	   number = n;
   }

	public boolean isPerfect()
	{
		int sum = 0;
		
	for (int i = 1; i < number; i++)
	{
		if (number % i == 0 )
		{
			sum = sum + i;
		}
	}
	
	if (sum == number)
	{
		return true;
	}
	else {
		return false;
	}
	}

	//add a toString
	public String toString()
	{
		return "\n" +number+" ";
	}

	
	
}