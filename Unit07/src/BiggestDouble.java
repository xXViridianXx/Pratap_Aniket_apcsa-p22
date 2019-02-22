//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		
		setDoubles(a, b, c, d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		this.one = a;
		this.two = b;
		this.three = c;
		this.four = d;
	}

	public double getBiggest()
	{
		
	
		double[] array = {one,two,three,four};
		double max = array[0];
		for (int i = 0; i < array.length; i++)
		{
			 max = Math.max(max, array[i]);
			
				
		
		}
		return max;
	}

	public String toString()
	{
	   return "Biggest = " +getBiggest();
	}
}