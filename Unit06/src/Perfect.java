//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   
   
 public Perfect() {
	 setPerfect(number);
 }
	//add constructors
   
   public Perfect(int n)
   {
	  number = n;
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
			sum = sum + 1;
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
		return 
	}
	
}