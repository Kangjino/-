package prac11;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.*;

public class Sh11_5 extends JFrame{

	public Sh11_5() {
		setTitle("슬라이더 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 100, 200, 130);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		c.add(slider);
		JLabel jl = new JLabel("130");
		jl.setBackground(Color.GREEN);
		jl.setOpaque(true);
		c.add(jl);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int a =slider.getValue();
				jl.setText(Integer.toString(a));
			}
		});
		setSize(300, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sh11_5();
	}

}
