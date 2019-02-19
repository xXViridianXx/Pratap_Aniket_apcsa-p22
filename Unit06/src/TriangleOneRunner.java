//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		TriangleOne t = new TriangleOne("hippo");	//running test cases
		
		t.print();
		
		TriangleOne r = new TriangleOne("abcd");
		r.print();
		
		TriangleOne n = new TriangleOne("it");
		n.print();
		
		TriangleOne j = new TriangleOne("a");
		j.print();
		
		TriangleOne p = new TriangleOne("chicken");
		p.print();
	}
}