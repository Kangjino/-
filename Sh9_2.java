package prac9;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;

public class Sh9_2 extends JFrame {
    public Sh9_2() {
    	setTitle("Let's study Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(5, 7));
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("North"), BorderLayout.NORTH);
		
		setSize(400, 200);
		setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sh9_2();
	}

}
