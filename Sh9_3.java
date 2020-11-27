package prac9;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Sh9_3 extends JFrame{
	
	public Sh9_3() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(1, 10);
		//grid.setVgap(0);
		Color[] colors = new Color[] { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE,
				Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY };
		Container c= getContentPane();
		c.setLayout(grid);
		//c.setBackground(Color.RED);
		for(int i=0; i<10; i++) {
			JButton jb = new JButton(Integer.toString(i));
			jb.setBackground(colors[i]);
			c.add(jb); 
		}
		
		setSize(1000, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sh9_3();
	}

}
