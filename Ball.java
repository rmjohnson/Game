import java.applet.*;
import java.awt.*;

public class Ball extends Applet implements Runnable
{
	int x_pos = 10;
	int y_pos = 100;
	int radius = 10;
	public void init()
	{

	}
	public void start()
	{
		Thread th = new Thread (this);
		th.start();
	}
	public void stop()
	{

	}
	public void destroy()
	{

	}	
	public void run()
	{
		//lower thread priority
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

		while (true)
		{
			repaint();
			x_pos++;
			try
			{
				Thread.sleep(20);
			}
			catch (InterruptedException ex)
			{
				//do nothing
			}

			Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		}
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);

		g.fillOval(x_pos - radius, y_pos - radius, 2*radius, 2*radius);
	}
	
	
}
