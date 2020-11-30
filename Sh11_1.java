package prac11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Sh11_1 extends JFrame{
	JCheckBox a[] = new JCheckBox[2];
	private JButton btn = new JButton("Test Button");
	
	public Sh11_1() {
		setTitle("실습1번");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		a[0] =  new JCheckBox("버튼 비활성화");
		a[1] = new JCheckBox("버튼 감추기");
		MyItemListener listener = new MyItemListener();
		c.add(a[0]);
		c.add(a[1]);
		c.add(btn);
		a[0].addItemListener(listener);
		a[1].addItemListener(listener);
		
		setSize(200, 300);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getSource() == a[0]) {
					btn.setEnabled(false);
				}
				else if(e.getSource() == a[1]) {
					btn.setVisible(false);
				}
			}
			
			else {
				if(e.getSource() == a[0]) {
					btn.setEnabled(true);
				}
				else if(e.getSource() == a[1]) {
					btn.setVisible(true);
				}
			}
		}
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sh11_1();
	}

}
