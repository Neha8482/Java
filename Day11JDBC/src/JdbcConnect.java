import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnect {
public static void main(String[] args) {
	Connection connection = null;

	//1.Load the driver
	//Class is in java.lang forname loads the classname at runtime
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection with database
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainingdb","root","mysql");
		System.out.println("Connected");
		//handle the exceptions
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if(connection != null) {
			try {
				//Close the resources
				connection.close();//connection extends closeable and also autocloseable
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
}
