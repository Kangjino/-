package prac9;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sh9_5 extends JFrame{
	public Sh9_5() {
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		
		GridLayout grid = new GridLayout(4, 4);
		//grid.setVgap(0);
		Color[] colors = new Color[] { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE,
				Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY, Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE };
		c.setLayout(grid);
		for(int i=0; i<16; i++) {
			JLabel jb = new JLabel(Integer.toString(i));
			jb.setBackground(colors[i]);
			jb.setOpaque(true);
			c.add(jb);
		}
		
		setSize(800, 400);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sh9_5();
	}

}
