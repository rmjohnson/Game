import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.*;
import java.util.Random;

public class KeyInput extends Applet
   implements KeyListener, MouseListener {

   int width, height;
   int x, y;
   String s = "";

   public void init() {
      width = getSize().width;
      height = getSize().height;
      setBackground( Color.black );

      //Random generator = new Random();
      //int r = generator.nextInt();
      x = 5;
      y = 5;

      addKeyListener( this );
      addMouseListener( this );
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
      g.drawString( s, x, y );
   }
}
