//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private double distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
		//initializing
	}

	public MilesPerHour(double dist, double hrs, double mins)
	{
		
		distance = dist;
		hours = hrs;
		minutes = mins;
		//object constructor
	}

	public void setNums(double dist, double hrs, double mins)
	{
		
		distance = dist;
		hours = hrs;
		minutes = mins;
		
		//sets vars
	}

	public void calcMPH()
	{
		
		mph = distance/(hours + minutes/60);
		//calc mph
	}

	
	
	public void print()
	{
		
		System.out.println("the speed is " + String.format("%.0f", mph) + "mph\n" );
		//method
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}