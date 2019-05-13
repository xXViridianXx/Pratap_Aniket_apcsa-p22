//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		
		aliens = new ArrayList<Alien>(size);
		int x = 0;
		int y = 5;
		for(int i = 0; i < size; i++)
		{
			aliens.add(new Alien(x,y,20,20,2));
			x -= 40;
		}
	}

	public void add(Alien al)
	{
		
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for ( Alien a: aliens)
		{
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		
		for(Alien a : aliens)
		{
			
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
	}

	public String toString()
	{
		return "";
	}
}
