//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		//ask for name and size
		System.out.print("Enter 1st monster's name : ");
		String n1 = keyboard.next();
		System.out.print("Enter 1st monster's size : ");
		int s1 = keyboard.nextInt();
		//instantiate monster one
		

		Monster mon1 = new Skeleton(n1,s1);
		
		//ask for name and size
		
		//instantiate monster two
	
		
		System.out.print("Enter 2nd monster's name : ");
		String n2 = keyboard.next();
		System.out.print("Enter 2nd monster's size : ");
		int s2 = keyboard.nextInt();
		
		Monster mon2 = new Skeleton(n2,s2);	
		
		if (mon1.isBigger(mon2))
		{
			System.out.println("Monster One is bigger than Monster two ");
		}
		else if(mon1.isSmaller(mon2))
		{
			System.out.println("Monster One is smaller than Monster two ");
		}
		else
		{
			System.out.println("Monster One is the same size as Monster 2");
		}
		
		
		if(mon1.namesTheSame(mon2))
		{
			System.out.println("Monster one has the same name as Monster two");
		}
		else
		{
			System.out.println("Monster one does not have the same name as Monster two");
		}
		
		
	}
}