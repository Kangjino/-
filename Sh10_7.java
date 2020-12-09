package prac10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Sh10_7 extends JFrame{
	public static String text = "Love Java";
	int a =10;
	public static JLabel jl = new JLabel(text);
	public Sh10_7() {
		setTitle("마우스 휠을 굴려 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		jl.setFont(new Font("Arial", Font.PLAIN, 10));
		c.add(jl);
		c.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				if(e.getWheelRotation() ==-1) {
					a+=5;
					jl.setFont(new Font("Arial", Font.PLAIN, a));
				}
				else if(e.getWheelRotation() == 1) {
					a-=5;
					if(a<=5) a=5;
					jl.setFont(new Font("Arial", Font.PLAIN, a));
				}
			}
		});
		setSize(200, 200);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	public static void main(String args[]) {
		new Sh10_7();
	}
}
