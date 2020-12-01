package prac10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sh10_4 extends JFrame {
	public String text = "Love Java";
	JLabel la = new JLabel(text);
	public Sh10_4() {
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		la.setOpaque(true);
		la.setBackground(Color.YELLOW);
		c.setFocusable(true);
		c.requestFocus();
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			if(keyCode == KeyEvent.VK_LEFT) {
				String a = text.substring(0, 1);
				String b = text.substring(1);
				text = b + a;
				la.setText(text);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sh10_4();
	}

}
