//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   System.out.println("********************");
   }

   public void printTwentyDashes()
   {
	   System.out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
	   System.out.println("\n");
	   
   }
   
   //small box function
   public void printASmallBox()
   {	
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   
   }
 //large box function
   public void printABigBox()
   { 	
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   
   }   
}