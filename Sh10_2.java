package prac10;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Sh10_2 extends JFrame{
	Container c= getContentPane();
	public Sh10_2() {
		setTitle("µå·¡±ëµ¿¾È");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setBackground(Color.GREEN);
		c.addMouseMotionListener(new aa());
		c.addMouseListener(new bb());
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sh10_2();
	}
	
	class bb extends MouseAdapter {
		public void mouseReleased(MouseEvent e) {
			c.setBackground(Color.GREEN);
		}
	}

	
	class aa extends MouseMotionAdapter {
		public void mouseDragged(MouseEvent e) {
			c.setBackground(Color.YELLOW);
		}
	}

}
