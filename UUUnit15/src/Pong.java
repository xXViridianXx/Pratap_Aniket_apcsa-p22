import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int i;
	private int leftScore, rightScore;


	public Pong()
	{
		//set up all variables related to the game
		//instantiate a Ball
				ball = new Ball(10, 10, 10, 10, 5, 5, Color.RED);
				
				
				//instantiate a left Paddle
				leftPaddle = new Paddle(10, 10, 20, 200);
				
				
				//instantiate a right Paddle
				rightPaddle = new Paddle(750, 10, 20, 200);
		


		keys = new boolean[5];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }
   public void reset() {
	   ball.setX(400);
	   ball.setY(300);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		if (i == 0) {
			leftPaddle.draw(graphToBack);
			rightPaddle.draw(graphToBack);
		}
		i++;


		ball.moveAndDraw(graphToBack);


		//see if ball hits left wall or right wall
		if(!(ball.getX()>=0 && ball.getX()<=750))
		{
			graphToBack.clearRect(ball.getX(), ball.getY(), ball.getWidth(), ball.getHeight());
			reset();
			leftPaddle.draw(graphToBack);
			rightPaddle.draw(graphToBack);
		}

		if(!(ball.getY()>=0 && ball.getY()<=450))
		{

			ball.setYSpeed(-ball.getYSpeed());
		}

		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(graphToBack);

		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		if (keys[4] == true) {
			leftPaddle.draw(graphToBack);
			rightPaddle.draw(graphToBack);
		}
		
		//see if the ball hits the top or bottom wall 



		//see if the ball hits the left paddle
		if (ball.getX() <= leftPaddle.getX() && ball.getX() >= leftPaddle.getX() - leftPaddle.getWidth() && ball.getY() <= leftPaddle.getY()+leftPaddle.getHeight() && ball.getY() >= leftPaddle.getY())
		{	ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());
			leftScore++;
		}
		
		//see if the ball hits the right paddle
		
		if (ball.getX() >= rightPaddle.getX() && ball.getX() <= rightPaddle.getX() + rightPaddle.getWidth() && ball.getY() >= rightPaddle.getY() && ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight())
		{	
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());
			rightScore++;
		}
		


		//see if the paddles need to be moved













		
		graphToBack.clearRect(400, 520, 100, 20);
		graphToBack.clearRect(600, 520, 100, 20);
		graphToBack.drawString("rightscore = " + rightScore, 400, 540);
		graphToBack.drawString("leftscore = " + leftScore, 600, 540);

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
			default : keys[4]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
			default : keys[4]=true; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}