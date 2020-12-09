package prac10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Sh10_6 extends JFrame{
	JLabel jl = new JLabel("C");
	
	public Sh10_6() {
		setTitle("클릭 연습용 응용 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(null);
		jl.setLocation(100, 100);
		jl.setSize(20, 20);
		c.add(jl);
		jl.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int x = (int)(Math.random()*300);
				int y =(int)(Math.random()*300);
				jl.setLocation(x, y);
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sh10_6();
	}

}
