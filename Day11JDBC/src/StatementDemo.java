import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
public static void main(String[] args) {
	Connection connection = null;

	//1.Load the driver
	//Class is in java.lang forname loads the classname at runtime
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection with database
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainingdb","root","mysql");
		System.out.println("Connected");
		
		Statement statement = connection.createStatement();
		String sql = "INSERT INTO EMPDATA VALUES(12,'BILL',89000,'MANAGER');";
		int result = statement.executeUpdate(sql);
		if(result > 0) {
			System.out.println("Record Inserted");
		}
		else {
			System.out.println("Record not inserted");
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if(connection != null) {
			try {
				connection.close();//connection extends closeable and also autocloseable
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
}
