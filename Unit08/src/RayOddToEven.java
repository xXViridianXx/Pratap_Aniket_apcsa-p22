//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int evenSpace = -1;
		int oddSpace = -1;
		
		
		
		for (int i = 0; i < ray.length; i++)
		{
			if ( ray[i] % 2 == 1 && oddSpace < 0 )
			{
				oddSpace = i;
			}
			if (ray[i] % 2 == 0 && evenSpace < 0 && oddSpace >= 0)
			{
				evenSpace = i;
			}
		}
		
		if (oddSpace == -1 || evenSpace == -1 )
		{
			return -1;
		}
		else 
		{
			return Math.abs(oddSpace - evenSpace);
		}
		
	}
}