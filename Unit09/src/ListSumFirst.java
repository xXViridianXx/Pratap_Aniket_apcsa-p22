//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int sum = 0;
		for (int i = 0; i < ray.size()-1; i++ )
		{
			if (ray.get(0) < ray.get(i+1))
			{
				sum += ray.get(i+1);
			}
		}
		if (sum == 0)
		{
			return -1;
		}
		else return sum;
		
	}
	
}