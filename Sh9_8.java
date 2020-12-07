package prac9;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Sh9_8 extends JFrame {

	public Sh9_8() {
		setTitle("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setLayout(new BorderLayout());
		c.add(new up1(), BorderLayout.NORTH);
		c.add(new down2(), BorderLayout.SOUTH);
		c.add(new Center2(), BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sh9_8();
	}

}

@SuppressWarnings("serial")
class up1 extends JPanel{
	public up1() {
		setLayout(new FlowLayout());
		setBackground(Color.GRAY);
		add(new JButton("열기"));
		add(new JButton("닫기"));
		add(new JButton("나가기"));
	}
}

@SuppressWarnings("serial")
class down2 extends JPanel{
	public down2() {
		setLayout(new FlowLayout(4));
		setBackground(Color.YELLOW);
		add(new JButton("Word Input"));
		add(new JTextField(15));
	}
}

@SuppressWarnings("serial")
class Center2 extends JPanel{
	public Center2() {
		setLayout(null);
		
		//setBackground(Color.ORANGE);
		setOpaque(true);
		for(int i=0; i<10; i++) {
			JLabel a = new JLabel("*");
			int x = (int)(Math.random()*200);
			int y = (int)(Math.random()*200);
			a.setForeground(Color.ORANGE);
			a.setSize(15, 15);
			a.setLocation(x, y);
			add(a);
		}
	}
}