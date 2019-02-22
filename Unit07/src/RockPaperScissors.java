//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		
		playChoice = player;
	}

	public void setPlayers(String player)
	{
		
		playChoice = player;
		
	}
	
	public int convert(String c)
	{
		int selection = 0;
		
		if (c.equals("R"))
		{
			return 0;
		}
		else if(c.equals("P"))
		{
			return 1;
		}
		else if (c.equals("S"))
		{
			return 2;
		}
		
		return selection;
		
	}

	public String determineWinner()
	{
		
		
		String winner="";
		playChoice.toUpperCase().trim();
		int choice = (int)Math.floor(Math.random()*3);
		String compString = compChoice;
		
		
		if (choice == 0 )
		{
			compString = "Computer had rock";
		}
		else if (choice == 1)
		{
			compString = "Computer had Paper";
		}
		else if (choice == 2)
		{
			compString = "Computer had scissors";
		}
		System.out.println(compString);
		
		
		
		if (convert(playChoice) == 0 && choice == 2||convert(playChoice) == 1 && choice == 0||convert(playChoice) == 2 && choice == 1 )
		{
			winner = "Player wins!";
		}
		else if (convert(playChoice) == 2 && choice == 0||convert(playChoice) == 0 && choice == 1||convert(playChoice) == 1 && choice == 2 )
		{
			winner = "Computer wins!";
		}
		else if (convert(playChoice) == choice)
		{
			winner ="Tie!";
		}
		
		System.out.println(winner);
		
		
		return winner;
		
		
	}

	public String toString()
	{
		String output= determineWinner();
		return output;
	}
}