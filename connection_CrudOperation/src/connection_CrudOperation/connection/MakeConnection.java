package connection_CrudOperation.connection;
import java.sql.*;

public class MakeConnection {
	static Connection cn;
	public static final String username = "root";
	public static final String password = "aanshi";
	public static final String url = "jdbc:mysql://localhost:3306/student";
	public static Connection getconnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			cn = DriverManager.getConnection(url,username,password);
			//System.out.println(cn);
			return (cn);
			
		} catch (ClassNotFoundException| SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return cn; 
		
	}
}
