//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private double xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		
		setCoordinates(xOne, yOne, xTwo, yTwo);
		distance = 0.0;
		
		//initializing everything
	}

	public Distance(double x1, double y1, double x2, double y2)
	{
		
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	
		//object to create a new variable
	}

	public void setCoordinates(double x1, double y1, double x2, double y2)
	{
		
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		
		//setting variables
		
	}

	public void calcDistance()
	{
		distance = (double)(sqrt(Math.pow(xTwo-xOne, 2) + Math.pow(yTwo - yOne, 2)));
		//calculating distance
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
		//methods
		System.out.println("the distance is " + String.format("%.3f", distance) + "\n" );
		
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}