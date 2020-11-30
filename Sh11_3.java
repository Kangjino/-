package prac11;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

@SuppressWarnings("serial")
public class Sh11_3 extends JFrame {
	String t[] = {"오만원", "만원", "천원", "오백원", "백원" , "오십원" , "십원" , "일원"};
	private JLabel la[] = new JLabel[8];
	private JTextField text[] = new JTextField[8];
	public Sh11_3() {
		setTitle("실습문제 3번");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(8, 3));
		;
		JTextField jt = new JTextField(20);
		JButton btn = new JButton("계산");
		c.add(new JLabel("금액"));
		c.add(jt);
		c.add(btn);
		c.setBackground(Color.YELLOW);
		for(int i=0; i<8; i++) {
			la[i] = new JLabel(t[i]);
			text[i] = new JTextField(10);
			c.add(la[i]);
			c.add(text[i]);
		}
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sum = jt.getText();
				int a[] = new int[8];
				a[0] = (Integer.valueOf(sum) /50000);
				sum = String.valueOf(Integer.valueOf(sum) - a[0]*50000);
				a[1] = (Integer.valueOf(sum) /10000);
				sum = String.valueOf(Integer.valueOf(sum) - a[1]*10000);
				a[2] = (Integer.valueOf(sum) /1000);
				sum = String.valueOf(Integer.valueOf(sum) - a[2]*1000);
				a[3] = (Integer.valueOf(sum) /500);
				sum = String.valueOf(Integer.valueOf(sum) - a[3]*500);
				a[4] = (Integer.valueOf(sum) /100);
				sum = String.valueOf(Integer.valueOf(sum) - a[4]*100);
				a[5] = (Integer.valueOf(sum) /50);
				sum = String.valueOf(Integer.valueOf(sum) - a[5]*50);
				a[6] = (Integer.valueOf(sum) /10);
				sum = String.valueOf(Integer.valueOf(sum) - a[6]*10);
				a[7] = (Integer.valueOf(sum) /1);
				sum = String.valueOf(Integer.valueOf(sum) - a[7]*1);
				for(int i=0; i<8; i++) text[i].setText(String.valueOf(a[i]));
			}
		});
		
		
		setSize(350, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sh11_3();
	}

}
