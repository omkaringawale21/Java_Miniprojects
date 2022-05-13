package Java_Miniproject_10;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/*
 * MiniProject on User Register Form which is feching to the mySQL database
 * @author Omkar Ingawale
 */

public class UserRegistration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fristname;
	private JTextField lastname;
	private JTextField email;
	private JTextField username;
	private JTextField mob;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	
	/*
	 * Launch the form application
	 */
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try{
					UserRegistration frame = new UserRegistration();
					frame.setVisible(true);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		
	}

	UserRegistration(){
		
//		setIconImage(Toolkit.getDefaultToolkit().getImage(getName()));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewUserRegister = new JLabel("New User Register");
		lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
		lblNewUserRegister.setBounds(362, 52, 325, 50);
		contentPane.add(lblNewUserRegister);
		
		JLabel lblName = new JLabel("Frist Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName.setBounds(58, 152, 99, 43);
		contentPane.add(lblName);
		
		JLabel lblNewLabel = new JLabel("Last Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(58, 243, 110, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmailAddress.setBounds(58, 324, 124, 36);
		contentPane.add(lblEmailAddress);
		
		fristname = new JTextField();
		fristname.setFont(new Font("Tahoma", Font.PLAIN, 24));
		fristname.setBounds(214, 151, 228, 50);
		contentPane.add(fristname);
		fristname.setColumns(20);
		
		lastname = new JTextField();
		lastname.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lastname.setBounds(214, 235, 228, 50);
		contentPane.add(lastname);
		lastname.setColumns(20);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 24));
		email.setBounds(214, 320, 228, 50);
		contentPane.add(email);
		email.setColumns(20);
		
		username = new JTextField();
		username.setFont(new Font("Tahoma", Font.PLAIN, 24));
		username.setBounds(707, 151, 228, 50);
		contentPane.add(username);
		username.setColumns(20);
		
		JLabel lblUserName = new JLabel("Username");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUserName.setBounds(542, 159, 99, 29);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(542, 245, 99, 24);
		contentPane.add(lblPassword);
		
		JLabel lblMobileNumber = new JLabel("Mobile Number");
		lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMobileNumber.setBounds(542, 329, 139, 26);
		contentPane.add(lblMobileNumber);
		
		mob = new JTextField();
		mob.setFont(new Font("Tahoma", Font.PLAIN, 24));
		mob.setBounds(707, 320, 228, 50);
		contentPane.add(mob);
		mob.setColumns(20);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		passwordField.setBounds(707, 235, 228, 50);
		contentPane.add(passwordField);
		passwordField.setColumns(20);
		
		btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				
				String fristName = fristname.getText();
				String lastName = lastname.getText();
				String emailId = email.getText();
				String userName = username.getText();
				String mobileNumber = mob.getText();
				int len = mobileNumber.length();
				String password = passwordField.getText();
				
				String msg = fristName;
				msg += "\n";
				if(len != 10){
					JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number.");
				}
				
				/*
				 * Update to MySQL
				 */
				
				try{
					
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo", "root", "Omkar@21");
					
					String query = "INSERT INTO account values('" + fristName + "','" + lastName + "','" + userName + "','" +
							password + "','" + emailId + "','" + mobileNumber + "')";
					
					Statement statement = connection.createStatement();
					
					int x = statement.executeUpdate(query);
					
					if(x == 0){
						JOptionPane.showMessageDialog(btnNewButton, "This is already exist");
					}else{
						JOptionPane.showMessageDialog(btnNewButton, "Welcome, " + msg + " Your account is successfully created.");
					}
					
					connection.close();
					
				}catch(Exception e){
					e.printStackTrace();
				}
				
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(339, 447, 259, 74);
		contentPane.add(btnNewButton);
		
		// This is the Registration Form which had been connected to the MySQL Database
		
	}
	
}
