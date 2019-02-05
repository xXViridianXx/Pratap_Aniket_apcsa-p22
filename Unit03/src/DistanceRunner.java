//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Distance d = new Distance(1,1,2,1);
		d.calcDistance();
		d.print();
		
		Distance r = new Distance(1,1,-2,2);
		r.calcDistance();
		r.print();
		
		Distance t = new Distance(1,1,0,0);
		t.calcDistance();
		t.print();
		
		//runs print method and distance object
			
	}
}