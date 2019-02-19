//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover(sentence, lookFor);
	}

	//add in second constructor
	public LetterRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}
	
	
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned = sentence;
		int charPlace = indexOf(lookFor);
		while (charPlace != -1)
		{
			cleaned = cleaned.substring(0,charPlace) + cleaned.substring(charPlace + 1, cleaned.length());
			charPlace = cleaned.indexOf(lookFor);
		}
		return cleaned;
		
		
	}

	private int indexOf(char lookFor2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters() + "\n";
	}
}