//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
			LetterRemover sec = new LetterRemover();
			
			sec.setRemover("I am Sam I am", 'a');
			
			System.out.println(sec);
			
			LetterRemover sec1 = new LetterRemover();
			
			sec.setRemover("ssssssssxssssesssssesss", 's');
			
			System.out.println(sec1);
			
LetterRemover sec2 = new LetterRemover();
			
			sec.setRemover("qwertyqwertyqwerty",  'a');
			
			System.out.println(sec2);
			
											
	}
}