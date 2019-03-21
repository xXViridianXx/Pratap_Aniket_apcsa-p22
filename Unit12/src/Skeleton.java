//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	
	private String name;
	private int size;
	
	public Skeleton()
	{
		name = " Jeremy Clarkson";
		size = 58;
	}
	
	public Skeleton(String nm, int sz)
	{
		name = nm;
		size = sz;
	}

	@Override
	public int getHowBig() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean isBigger(Monster other) {
		if(getHowBig() > other.getHowBig())
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean isSmaller(Monster other) {
		if(getHowBig() < other.getHowBig())
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean namesTheSame(Monster other) {
		if (other.getName() == getName())
		{
			return true;
		}
		return false;
	}
	//add instance variables	
	
	


	//add a constructor

	//add code to implement the Monster interface

	//add a toString
	
	public String toString()
	{
		return "" + getName() + "" + getHowBig();
		
	}
}