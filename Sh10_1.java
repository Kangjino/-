package prac10;

import java.awt.Container;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sh10_1 extends JFrame {
	 private JLabel jjj = new JLabel("�����");
	public Sh10_1() {
		setTitle("�� �ѹ� �������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		//jjj.addMouseListener((MouseListener) new imple());
		c.add(jjj);
		jjj.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				jjj.setText("Love Java");
			}
			public void mouseExited(MouseEvent e) {
				jjj.setText("�����");
			}
		});
		
		setSize(300, 300);
		setVisible(true);	
	}

	
	/*
	class imple implements MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			JLabel b = (JLabel)e.getSource();
			if(b.getText().equals("Love Java")) b.setText("�����");
			else if(b.getText().equals("�����")) b.setText("Love Java");
		}

		
	}
	*/
	
	public static void main(String args[]) {
		new Sh10_1();
	}
}

