package prac9;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Sh9_6 extends JFrame{
	public Sh9_6() {
		setTitle("Random Labels");
		setVisible(true);
		Container c= getContentPane();
		c.setLayout(null);
		JLabel a[]= new JLabel[20];
		for(int i=0; i<20; i++) {
			int x = (int)(Math.random()*200) +50;
			int y = (int)(Math.random()*200) +50;
			a[i] = new JLabel();
			a[i].setSize(10, 10);
			a[i].setLocation(x, y);
			a[i].setBackground(Color.BLUE);
			a[i].setOpaque(true);
			c.add(a[i]);
		}
		setSize(300, 300);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sh9_6();
	}

}
