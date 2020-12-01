package prac10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Sh10_3 extends JFrame {
	JLabel la = new JLabel("Love Java");
	public Sh10_3() {
		setTitle("ÀÌ¾ßÈ£");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addMouseListener(new hi());
		c.add(la);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sh10_3();
	}

	class hi extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			if(la.getText().equals("Love Java")) la.setText("avaJ evoL"); 
			else if(la.getText().equals("avaJ evoL")) la.setText("Love Java");
		}
		
	}
}
