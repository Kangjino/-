package prac11;
import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
public class Sh11_7 extends JFrame {

	public Sh11_7() {
		setTitle("슬라이드로 프레임 변경");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 1, 100, 50);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		c.add(slider, BorderLayout.NORTH);
		JLabel jl = new JLabel("사랑해 자바");
		c.add(jl, BorderLayout.CENTER);
		
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				jl.setFont(new Font("고딕", Font.PLAIN, slider.getValue()));
				jl.setText("사랑해 자바");
			}
		});
		
		setSize(400, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sh11_7();
	}

}
