package Java_Miniproject_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public Connection getConnection() {
		Connection connection = null;
		System.out.println("Connection called!");
		try{
//			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qrcode", "root", "Omkar@21");
		}catch(SQLException  e){
			e.printStackTrace();
		}
		return connection;
	}
	
}
