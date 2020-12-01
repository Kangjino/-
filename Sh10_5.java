
package prac10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sh10_5 extends JFrame {
	public int a=50, b=50;
	public int size =10;
	public String text = "Love Java";
	JLabel la = new JLabel(text);
	public Sh10_5() {
		setTitle("Left 키로 문자열 이동, Light키로 크기증가, wasd로 움직임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		la.setLocation(b, a);
		c.setLayout(new FlowLayout());
		la.setOpaque(true);
		la.setBackground(Color.YELLOW);
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		
		c.setFocusable(true);
		c.requestFocus();
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(600, 500);
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
			if(keyCode == KeyEvent.VK_RIGHT) {
				la.setFont(new Font("Arial", Font.PLAIN, size));
				size += 5;
			}
			if(keyCode == 83) {
				a += 10;
				la.setLocation(b ,a);
			}
			
			if(keyCode == 87) {
				a -= 10;
				la.setLocation(b ,a);
			}
			if(keyCode == 65) {
				b -= 10;
				la.setLocation(b ,a);
			}
			if(keyCode == 68) {
				b += 10;
				la.setLocation(b ,a);
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sh10_5();
	}

}
