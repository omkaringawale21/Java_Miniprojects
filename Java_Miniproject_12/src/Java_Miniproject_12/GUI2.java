package Java_Miniproject_12;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI2 implements ActionListener {

	private static JFrame frame;
	private static JPanel panel;
	private static JLabel label;
	private static JLabel label2;
	private static JPasswordField password;
	private static JButton button;
	private static JTextField userText;
	
	public static void main(String[] args) {
		
		frame = new JFrame("Login");
		
		panel = new JPanel();
		
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(550, 300);
		frame.add(panel);
		
		panel.setLayout(null);
		
		label = new JLabel();
		label.setText("User : ");
		label.setBounds(10, 20, 80, 25);
		panel.add(label);
		
		userText = new JTextField();
		userText.setBounds(80, 20, 165, 25);
		userText.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(userText);
		
		label2 = new JLabel();
		label2.setText("Pasword : ");
		label2.setBounds(10, 70, 80, 25);
		panel.add(label2);
		
		password = new JPasswordField();
		password.setBounds(80, 70, 165, 25);
		panel.add(password);
		
		button = new JButton("Login");
		button.setBounds(100, 115, 105, 30);
		button.setFont(new Font("Tohama", Font.BOLD, 14));
		panel.add(button);
		button.addActionListener(new GUI2());
		
//		button.addActionListener(new java.awt.event.ActionListener(){
//			public void actionPerformed(java.awt.event.ActionEvent evt){
//				JOptionPane.showMessageDialog(button, "Login Successfully");
//			}
//		});
		
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String user = userText.getText();
		String pass = password.getText();
		
		/*
		 * Update to SQL
		 */
		
		try {
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login.log" , "root" , "Omkar@21");
			
			String query = "INSERT INTO log VALUES('" + user + "','" + pass + "')";
			
			Statement stamt = conn.createStatement();
			
			int rs = stamt.executeUpdate(query);
			
			if(rs == 0){
				JOptionPane.showMessageDialog(button, "Please Enter Username And Password!");
			}else{
				if( user.equals("Omkar Ingawale")  && pass.equals("Omkar@2108") ){
					JOptionPane.showMessageDialog(button, user + " " + "Login Successfully!");
				}else{
					JOptionPane.showMessageDialog(button, "Invalid UserName And Password!");
				}
			}
			
			conn.close();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	}

}
