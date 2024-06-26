package connectivity1;
import java.sql.*;

public class Connection1 {
	static Connection cn;
	public static final String username = "root";
	public static final String password = "aanshi";
	public static final String url = "jdbc:mysql://localhost:3306/student";
	public static void getconnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			cn = DriverManager.getConnection(url,username,password);
			System.out.println(cn);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
