import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.*;
import java.util.Random;

public class KeyInput extends Applet
implements KeyListener, MouseListener, Runnable {

	int width, height;
	int x, y;
	String s = "";
	Thread t = null;
	boolean threadSuspended;

	Random generator = new Random();
	String[] words = {"Zerg","Protoss","Terran"};
	int[][] cords = {{0,5},{0,25},{0,45}};

	public void init() {
		width = getSize().width;
		height = getSize().height;
		setBackground( Color.black );

		for (int i=0; i < cords.length; i++)
		{
			int r = generator.nextInt(100)+100;
			cords[i][0] = r;
		}
		addKeyListener( this );
		addMouseListener( this );
	}

	public void destroy()
	{
		System.out.println("destroy()");
	}

	public void start()
	{
		System.out.println("start(): begin");
		if ( t == null )
		{
			System.out.println("start(): creating thread");
			t = new Thread( this );
			System.out.println("start(): starting thread");
			threadSuspended = false;
			t.start();
		}
		else
		{
			if ( threadSuspended )
			{
				threadSuspended = false;
				System.out.println("start(): notifying thread");
				synchronized( this )
				{
					notify();
				}
			}
		}
		System.out.println("start(): end");
	}

	public void stop()
	{
		System.out.println("stop(): begin");
		threadSuspended = true;
	}
	public void run()
	{
		System.out.println("run(): begin");
		try {
			while (true) {
				System.out.println("run(): awake");

				for(int i=0;i < cords.length; i++)
				{
					cords[i][1]++;
				}

				if ( threadSuspended ) 
				{
					synchronized( this )
					{
						while ( threadSuspended )
						{
							System.out.println("run(): waiting");
							wait();
						}
					}
				}
				System.out.println("run(): requesting repaint");
				repaint();
				System.out.println("run(): sleeping");
				t.sleep ( 50 );
			}
		}
		catch (InterruptedException e) { }
		System.out.println("run(): end");
	}
	public void keyPressed( KeyEvent e ) { }
	public void keyReleased( KeyEvent e ) { }
	public void keyTyped( KeyEvent e ) {
		char c = e.getKeyChar();
		if ( c != KeyEvent.CHAR_UNDEFINED ) {
			s = Character.toString(c);
			repaint();
			e.consume();
		}
	}

	public void mouseEntered( MouseEvent e ) { }
	public void mouseExited( MouseEvent e ) { }
	public void mousePressed( MouseEvent e ) { }
	public void mouseReleased( MouseEvent e ) { }
	public void mouseClicked( MouseEvent e ) {
	}

	public void paint( Graphics g ) {
		g.setColor( Color.red );
		for(int i=0; i<cords.length; i++)
		{
			g.drawString(words[i],cords[i][0],cords[i][1]);
		}
	}
}
