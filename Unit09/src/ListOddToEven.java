//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		
		int odd = -1;
		int even = -1;
		
		for(int i = 0; i < ray.size(); i++)
		{
			if ( ray.get(i) % 2 == 1 && odd < 0)
			{
				odd = i;
			}
			if ( ray.get(i) % 2 == 0 && odd >= 0)
			{
				even = i;
			}
		}
		
		if ( odd == -1 || even  == -1)
		{
			return -1;
		}
		else return Math.abs(odd-even);
		
		
	}
}