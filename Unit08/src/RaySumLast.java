//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;
		for (int i = 0; i < ray.length; i++)
		{
			if(ray[i] > ray.length-1)
			{
				return sum+= ray[i];
			}
			else if (ray.length-1 > ray[i])
			{
				return -1;
			}
		}
		
		return sum;
	}
	

}