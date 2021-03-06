package Java_Miniproject_14;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/*
 * Problem Statement : Graphical User Interface(GUI) Calculator.
 * @Author : Omkar Ingawale.
 */

public class Calculator extends JFrame {

	private JPanel panel;
	private JTextArea ta;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn10;
	private JButton btn11;
	private JButton btn12;
	private JButton btn13;
	private JButton btn14;
	private JButton btn15;
	private JButton btn16;
	private JButton btn17;
	private JButton btn18;
	private JButton btn19;
	double frist;
	double second;
	double result;
	String operation;
	String answer;
	
	Calculator(){
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		ta = new JTextArea();
		ta.setFont(new Font("Arial", Font.BOLD, 20));
		ta.setBounds(5, 5, 375, 80);
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		ta.setBorder(border);
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		panel.add(ta);
		
		btn1 = new JButton("Clear");
		btn1.setFont(new Font("Arial", Font.ITALIC, 14));
		btn1.setBounds(20, 90, 70, 30);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				String backSpace = null;
				if(ta.getText().length() > 0){
					StringBuffer str = new StringBuffer(ta.getText());
					str.deleteCharAt(ta.getText().length() - 1);
					ta.setText(backSpace);
				}
			}
		});
		panel.add(btn1);
		
		btn2 = new JButton("( )");
		btn2.setFont(new Font("Arial", Font.BOLD, 18));
		btn2.setBounds(110, 90, 70, 30);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if(ta.getText().length() > 0){
					ta.setText(ta.getText() + ")");
				}else{
					ta.setText(ta.getText() + "(");
				}
			}
		});
		panel.add(btn2);
		
		btn3 = new JButton("%");
		btn3.setFont(new Font("Arial", Font.BOLD, 18));
		btn3.setBounds(200, 90, 70, 30);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
//				ta.setText(ta.getText() + "%");
				frist = Double.parseDouble(ta.getText());
				ta.setText("");
				operation = "%";
			}
		});
		panel.add(btn3);
		
		btn4 = new JButton("?");
		btn4.setFont(new Font("Arial", Font.BOLD, 18));
		btn4.setBounds(290, 90, 70, 30);
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
//				ta.setText(ta.getText() + "?");
				frist = Double.parseDouble(ta.getText());
				ta.setText("");
				operation = "?";
			}
		});
		panel.add(btn4);
		
		btn5 = new JButton("7");
		btn5.setFont(new Font("Arial", Font.BOLD, 18));
		btn5.setBounds(20, 140, 70, 30);
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				ta.setText(ta.getText() + "7");
			}
		});
		panel.add(btn5);
		
		btn6 = new JButton("8");
		btn6.setFont(new Font("Arial", Font.BOLD, 18));
		btn6.setBounds(110, 140, 70, 30);
		btn6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				ta.setText(ta.getText() + "8");
			}
		});
		panel.add(btn6);
		
		btn7 = new JButton("9");
		btn7.setFont(new Font("Arial", Font.BOLD, 18));
		btn7.setBounds(200, 140, 70, 30);
		btn7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				ta.setText(ta.getText() + "9");
			}
		});
		panel.add(btn7);
		
		btn8 = new JButton("?");
		btn8.setFont(new Font("Arial", Font.BOLD, 18));
		btn8.setBounds(290, 140, 70, 30);
		btn8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
//				ta.setText(ta.getText() + "?");
				frist = Double.parseDouble(ta.getText());
				ta.setText("");
				operation = "?";
			}
		});
		panel.add(btn8);
		
		btn9 = new JButton("4");
		btn9.setFont(new Font("Arial", Font.BOLD, 18));
		btn9.setBounds(20, 190, 70, 30);
		btn9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				ta.setText(ta.getText() + "4");
			}
		});
		panel.add(btn9);
		
		btn10 = new JButton("5");
		btn10.setFont(new Font("Arial", Font.BOLD, 18));
		btn10.setBounds(110, 190, 70, 30);
		btn10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				ta.setText(ta.getText() + "5");
			}
		});
		panel.add(btn10);
		
		btn11 = new JButton("6");
		btn11.setFont(new Font("Arial", Font.BOLD, 18));
		btn11.setBounds(200, 190, 70, 30);
		btn11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				ta.setText(ta.getText() + "6");
			}
		});
		panel.add(btn11);
		
		btn12 = new JButton("-");
		btn12.setFont(new Font("Arial", Font.BOLD, 18));
		btn12.setBounds(290, 190, 70, 30);
		btn12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
//				ta.setText(ta.getText() + "-");
				frist = Double.parseDouble(ta.getText());
				ta.setText("");
				operation = "-";
			}
		});
		panel.add(btn12);
		
		btn13 = new JButton("1");
		btn13.setFont(new Font("Arial", Font.BOLD, 18));
		btn13.setBounds(20, 240, 70, 30);
		btn13.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				ta.setText(ta.getText() + "1");
			}
		});
		panel.add(btn13);
		
		btn14 = new JButton("2");
		btn14.setFont(new Font("Arial", Font.BOLD, 18));
		btn14.setBounds(110, 240, 70, 30);
		btn14.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				ta.setText(ta.getText() + "2");
			}
		});
		panel.add(btn14);
		
		btn15 = new JButton("3");
		btn15.setFont(new Font("Arial", Font.BOLD, 18));
		btn15.setBounds(200, 240, 70, 30);
		btn15.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				ta.setText(ta.getText() + "3");
			}
		});
		panel.add(btn15);
		
		btn16 = new JButton("+");
		btn16.setFont(new Font("Arial", Font.BOLD, 18));
		btn16.setBounds(290, 240, 70, 30);
		btn16.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
//				ta.setText(ta.getText() + "+");
				frist = Double.parseDouble(ta.getText());
				ta.setText("");
				operation = "+";
			}
		});
		panel.add(btn16);
		
		btn17 = new JButton("0");
		btn17.setFont(new Font("Arial", Font.BOLD, 18));
		btn17.setBounds(60, 290, 70, 30);
		btn17.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				ta.setText(ta.getText() + "0");
			}
		});
		panel.add(btn17);
		
		btn18 = new JButton("=");
		btn18.setFont(new Font("Arial", Font.BOLD, 18));
		btn18.setBounds(150, 290, 70, 30);
		btn18.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
//				ta.setText(ta.getText() + "=");
//				String answer;
				second = Double.parseDouble(ta.getText());
				
				if(operation == "+"){
					result = frist + second;
					answer = String.format("%.4f", result);
					ta.setText(answer);
				}else if(operation == "-"){
					result = frist - second;
					answer = String.format("%.4f", result);
					ta.setText(answer);
				}else if(operation == "?"){
					result = frist * second;
					answer = String.format("%.4f", result);
					ta.setText(answer);
				}else if(operation == "?"){
					result = frist / second;
					answer = String.format("%.4f", result);
					ta.setText(answer);
				}else if(operation == "%"){
					result = frist % second;
					answer = String.format("%.4f", result);
					ta.setText(answer);
				}
					
			}
		});
		panel.add(btn18);
		
		btn19 = new JButton(".");
		btn19.setFont(new Font("Arial", Font.BOLD, 18));
		btn19.setBounds(240, 290, 70, 30);
		btn19.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				ta.setText(ta.getText() + ".");
			}
		});
		panel.add(btn19);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(400, 210);
		setTitle("Calculator");
		setSize(400, 390);
		setVisible(true);
		
	}
	
}
