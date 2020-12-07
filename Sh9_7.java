package prac9;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Sh9_7 extends JFrame{
	
	public Sh9_7() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 7));
		c.add(new up(), BorderLayout.NORTH);
		c.add(new down(), BorderLayout.SOUTH);
		c.add(new Center(), BorderLayout.CENTER);
		
		setSize(400, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sh9_7();
	}

}

@SuppressWarnings("serial")
class Center extends JPanel{
	public Center() {
		setLayout(new GridLayout(4, 4, 5, 5));
		for(int i=0; i<10; i++) {
			add(new JButton(Integer.toString(i)));
		}
		add(new JButton("CE"));
		add(new JButton("계산"));
		add(new JButton("+"));
		add(new JButton("-"));
		add(new JButton("*"));
		add(new JButton("/"));
	}
}

@SuppressWarnings("serial")
class up extends JPanel {
	public up() {
		setBackground(Color.GRAY);
		setLayout(new FlowLayout());
		add(new JLabel("수식 입력"));
		add(new JTextField(18));
	}
}

@SuppressWarnings("serial")
class down extends JPanel {
	public down() {
		setBackground(Color.YELLOW);
		setLayout(new FlowLayout());
		add(new JLabel("계산 결과"));
		add(new JTextField(15));
	}
}