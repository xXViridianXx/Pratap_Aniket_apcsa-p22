//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static int[] getRowTotals( int[][] m )
    {
    	
    	int[] stuff = new int[m.length];
    	
    	for(int i = 0; i < m.length; i++)
    	{
    		int count = 0;
    	
    		for(int j : m[i])
    		{
    			count += j;
    		}
    		
    		stuff[i] = count;
    	}
    	
    	
    	
		return stuff ;
    }
}
