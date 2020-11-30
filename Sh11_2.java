package prac11;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Sh11_2 extends JFrame {
	private JComboBox<String> combo = new JComboBox<String>();
	private JTextField text = new JTextField(20);
	public Sh11_2() {
		setTitle("½Ç½À1¹ø");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		text.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t = text.getText();
				combo.addItem(t);
				text.setText("");
			}
		});
		c.add(text);
		c.add(combo);
		setSize(400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sh11_2();
	}

}
