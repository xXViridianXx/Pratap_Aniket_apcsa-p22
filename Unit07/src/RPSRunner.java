//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		
		String ask = "";
		do{Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
		
			out.print("type in your prompt [R,P,S] :: ");
			
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors();
			String num = keyboard.nextLine();
			game.setPlayers(num);
			game.toString();
			
			System.out.print("Want to play again? [y]");
			 ask = keyboard.nextLine();
			
			
			
				
				
			}while (ask.equals("y"));
			
	}
}



