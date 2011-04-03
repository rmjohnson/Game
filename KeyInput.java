import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class KeyInput extends Applet implements KeyListener, MouseListener {
	int width, height;
	int x, y;
	String s = "";

	public void init()
	{
		width = getSize().width;
		height = getSize().height;
		setBackground( Color.black );

		x = width/2;
		y = height/2;

		addKeyListener ( this );
		addMouseListener ( this );

	}
	
	public void keyPressed( KeyEvent e )
	{

	}
	public void keyReleased( KeyEvent e )
	{

	}
	public void keyTyped( KeyEvent e )
	{
		char c = e.getKeyChar();
		if ( c != KeyEvent.CHAR_UNDEFINED )
		{
			s = s +c;
			repaint();
			e.consume();
		}
	}
	public void mouseEntered( MouseEvent e )
	{

	}
	public void mouseExited( MouseEvent e )
	{
	
	}
	public void mousePressed( MouseEvent e )
	{

	}
	public void mouseReleased( MouseEvent e )
	{

	}
	public void MouseClicked( MouseEvent e )
	{
		x = e.getX();
		y = e.getY();
		s = "";
		repaint();
		e.consume();
	}

	public void paint( Graphics g )
	{
		g.setColor( Color.gray );
		g.drawLine( x, y, x, y-10 );
		g.drawLine ( x, y, x+10, y );
		g.setColor ( Color.green );
		g.drawString ( s, x, y );
	}
}
