import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
	
	public Connection getConnection() {
		try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinevotingdb","root","123456");
		   return conn;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
