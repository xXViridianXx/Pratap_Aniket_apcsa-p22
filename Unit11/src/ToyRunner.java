//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class ToyRunner
{
	public static void main(String[] args)
	{
		
Scanner keyboard = new Scanner(System.in);
		
		
		
		out.println("choose your toy::");
		
		String word = keyboard.nextLine();
		
		Toy f = new Toy(word);
		
		f.toString();
		
		System.out.println(f);
		
		
		
		
		
		
		
	}
}