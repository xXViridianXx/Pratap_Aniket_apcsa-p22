//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Toy
{
	private String name;
	private int count;

	public Toy()
	{
		setCount(3);
		setName("V-bux");
		
	}
	

	public Toy( String nm )
	{
		
		setName(nm);
		setCount((int)(Math.random()*1000));
		
	}
	
	public Toy(String nm, int cnt)
	{
		setName(nm);
		setCount(cnt);
	}
	
	
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount( int cnt )
	{
		count = cnt;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nm )
	{
		name = nm;
	}

	public String toString()
	{
	   return name + " " + count ;
	}
}