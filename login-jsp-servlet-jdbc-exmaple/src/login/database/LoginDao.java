package login.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import login.bean.LoginBean;

public class LoginDao {

	public boolean validate(LoginBean loginBean)throws ClassNotFoundException{
		
		boolean status = false;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		try{
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?useSSL=false", "root", "Omkar@21");
			
			PreparedStatement preparedStatement = connection.prepareStatement("select * from loginform where username = ? and password = ?");
			preparedStatement.setString(1, loginBean.getUsername());
			preparedStatement.setString(2, loginBean.getPassword());
			
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			status = rs.next();
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return status;
		
	}
	
}
