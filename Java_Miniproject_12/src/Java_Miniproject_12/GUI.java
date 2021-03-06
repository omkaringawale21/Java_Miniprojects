package Java_Miniproject_12;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {

	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	
	public GUI(){
		
		frame = new JFrame();
		
		button = new JButton("Click Me");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setText("Number of Clicks : 0");
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(45, 45, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocation(550, 400);
		
	}

	public static void main(String[] args) {
		
		new GUI();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		count++;
		
		label.setText("Number of Clicks : " + count);
		
	}

}
