package Java_Miniproject_18;

import java.awt.Font;
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

class RegistrationInput extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane1;
	private JTextField nameTextField;
	private JTextField snameTextField;
	private JTextField usernameTextField;
	private JTextField emailTextField;
	private JPasswordField password;
	private JTextField phone;
	
	RegistrationInput(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 60, 800, 500);
		setResizable(false);
		contentPane1 = new JPanel();
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane1);
		contentPane1.setLayout(null);
		
		JLabel title = new JLabel();
		title.setFont(new Font("Tohama", Font.BOLD, 25));
		title.setText("Registation Form");
		title.setBounds(300, 15, 230, 50);
		contentPane1.add(title);
		
		JLabel name = new JLabel();
		name.setFont(new Font("Arial", Font.ITALIC, 22));
		name.setText("Name : ");
		name.setBounds(30, 120, 100, 40);
		contentPane1.add(name);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Arial", Font.PLAIN, 22));
		nameTextField.setBounds(150, 120, 200, 40);
		contentPane1.add(nameTextField);
		
		JLabel sname = new JLabel();
		sname.setFont(new Font("Arial", Font.ITALIC, 22));
		sname.setText("SurName : ");
		sname.setBounds(30, 200, 120, 40);
		contentPane1.add(sname);
		
		snameTextField = new JTextField();
		snameTextField.setFont(new Font("Arial", Font.PLAIN, 22));
		snameTextField.setBounds(150, 200, 200, 40);
		contentPane1.add(snameTextField);
		
		JLabel username = new JLabel();
		username.setFont(new Font("Arial", Font.ITALIC, 22));
		username.setText("UserName : ");
		username.setBounds(30, 280, 130, 40);
		contentPane1.add(username);
		
		usernameTextField = new JTextField();
		usernameTextField.setFont(new Font("Arial", Font.PLAIN, 22));
		usernameTextField.setBounds(150, 280, 200, 40);
		contentPane1.add(usernameTextField);
		
		JLabel email = new JLabel();
		email.setFont(new Font("Arial", Font.ITALIC, 22));
		email.setText("Email ID : ");
		email.setBounds(380, 120, 120, 40);
		contentPane1.add(email);
		
		emailTextField = new JTextField();
		emailTextField.setFont(new Font("Arial", Font.PLAIN, 22));
		emailTextField.setBounds(530, 120, 200, 40);
		contentPane1.add(emailTextField);
		
		JLabel pass = new JLabel();
		pass.setFont(new Font("Arial", Font.ITALIC, 22));
		pass.setText("Password : ");
		pass.setBounds(380, 200, 120, 40);
		contentPane1.add(pass);
		
		password = new JPasswordField();
		password.setBounds(530, 200, 200, 40);
		contentPane1.add(password);
		
		JLabel phno = new JLabel();
		phno.setFont(new Font("Arial", Font.ITALIC, 22));
		phno.setText("Phone No : ");
		phno.setBounds(380, 280, 120, 40);
		contentPane1.add(phno);
		
		phone = new JTextField();
		phone.setFont(new Font("Arial", Font.PLAIN, 22));
		phone.setBounds(530, 280, 200, 40);
		contentPane1.add(phone);
		
		JButton jButton2 = new JButton();
		jButton2.setFont(new Font("Arial", Font.PLAIN, 22));
		jButton2.setText("Register");
		jButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String name1 = nameTextField.getText();
				String surname1 = snameTextField.getText();
				String username1 = usernameTextField.getText();
				String email1 = emailTextField.getText();
				String pass1 = password.getText();
				String phono1 = phone.getText();
				int phonenumber = phono1.length();
				
				String msg = name1;
				
				if(phonenumber != 10){
					JOptionPane.showMessageDialog(jButton2, "Enter Valid Mobile Number");
				}
				
				try{
					
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "Omkar@21");
					
					String query = "Insert into account values('" + name1 + "', '" + surname1 + "', '" + username1 + "', '" + pass1 + "', '" 
							+ email1 + "', '" + phono1 + "')";
					
					Statement stmp = connection.createStatement();
					int res = stmp.executeUpdate(query);
					
					if(res == 0){
						JOptionPane.showMessageDialog(jButton2, msg + "  " + "Your Registration is not Successfully!");
					}else{
						JOptionPane.showMessageDialog(jButton2, msg + "  " + "Your Registration is Successfully!");
					}
					
				}catch(Exception e1){
					e1.printStackTrace();
				}
				
			}
		});
		jButton2.setBounds(270, 370, 200, 40);
		contentPane1.add(jButton2);
		
	}
	
}

public class LoginInput extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JPasswordField passwordField;
	
	LoginInput(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 190, 400, 300);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setFont(new Font("Tahoma", Font.BOLD, 20));
		jLabel1.setBounds(130, 8, 200, 100);
		jLabel1.setText("Login Form");
		contentPane.add(jLabel1);
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setFont(new Font("Arial", Font.ITALIC, 15));
		jLabel2.setBounds(25, 30, 200, 150);
		jLabel2.setText("User Name / Email : ");
		contentPane.add(jLabel2);
		
		username = new JTextField();
		username.setFont(new Font("Arial", Font.PLAIN, 15));
		username.setBounds(170, 93, 180, 25);
		contentPane.add(username);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.setFont(new Font("Arial", Font.ITALIC, 15));
		jLabel3.setBounds(25, 80, 200, 150);
		jLabel3.setText("Password : ");
		contentPane.add(jLabel3);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 15));
		passwordField.setBounds(170, 143, 180, 25);
		contentPane.add(passwordField);
		
		JButton jButton = new JButton();
		jButton.setBounds(140, 190, 100, 30);
		jButton.setText("Login");
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(username == null){
					JOptionPane.showMessageDialog(jButton, "Plz Enter UserName");
				}else if(passwordField == null){
					JOptionPane.showMessageDialog(jButton, "Plz Enter Password");
				}else{
					
					JOptionPane.showMessageDialog(jButton, "Your Login successfully!");
					
//					LoginInput frame = new LoginInput();
					dispose();
					
					RegistrationInput reframe = new RegistrationInput();
					reframe.show();
					
				}
				
			}
			
		});
		jButton.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(jButton);
		
	}
	
	public static void main(String[] args){
		
		java.awt.EventQueue.invokeLater(new Runnable(){
			
			public void run(){
				try{
					
					LoginInput frame = new LoginInput();
					frame.setVisible(true);
					
					RegistrationInput riframe = new RegistrationInput();
					riframe.setVisible(false);
					
					
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			
		});
		
	}
	
}
