import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		System.out.println(Arrays.toString(TotalRow.getRowTotals(new int[][] {{1,2,3},{5,5,5,5}})));	
		System.out.println(Arrays.toString(TotalRow.getRowTotals(new int[][] {{1,2,3},{5},{1},{2,2}})));
	}
}



