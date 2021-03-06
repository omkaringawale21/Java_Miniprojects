package Java_Miniproject_12;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GUI3 implements ActionListener {

	private static JFrame frame;
	private static JPanel panel;
	private static JLabel label;
	private static JRadioButton btn, btn1, btn2, btn3;
	
	public GUI3(){
		
		frame = new JFrame("BackGround Color Setting");
		
		panel = new JPanel();
		
		frame.setSize(400, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(550, 350);
		panel.setLayout(null);
		frame.add(panel);
		
		label = new JLabel();
		label.setText("Choose a Color :- ");
		label.setBounds(20, 20, 200, 25);
		label.setFont(new Font("Tohams", Font.ITALIC, 16));
		panel.add(label);
		
		btn = new JRadioButton("Red");
		btn.setBounds(20, 50, 100, 25);
		btn.addActionListener(this);
		panel.add(btn);
		
		btn1 = new JRadioButton("Blue");
		btn1.setBounds(20, 80, 100, 25);
		btn1.addActionListener(this);
		panel.add(btn1);
		
		btn2 = new JRadioButton("Orange");
		btn2.setBounds(20, 110, 100, 25);
		btn2.addActionListener(this);
		panel.add(btn2);
		
		btn3 = new JRadioButton("Cyan");
		btn3.setBounds(20, 140, 100, 25);
		btn3.addActionListener(this);
		panel.add(btn3);
		
		frame.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btn){
			panel.setBackground(Color.RED);
		}
			
		if(e.getSource() == btn1){
			panel.setBackground(Color.BLUE);
		}
			
		if(e.getSource() == btn2){
			panel.setBackground(Color.ORANGE);
		}
		
		if(e.getSource() == btn3){
			panel.setBackground(Color.CYAN);
		}
		
	}
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				new GUI3();
			}			
		});
		
	}

}