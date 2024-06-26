package connection_CrudOperation.crudoperation;
import java.sql.*;


import connection_CrudOperation.connection.MakeConnection;
public class CrudOperations {
	
	
	static Statement st;
	 static Connection cn;
	public CrudOperations (){
		
		cn = MakeConnection.getconnection();
		try {
			st= cn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void insertData(Integer id,String name,Integer age,String email) {
		String squery ="insert into  personalinfo values('" +id + "','" +name +"','" +age + "','" +email+ "')";
		try {
			int r= st.executeUpdate(squery);
			System.out.println(r);
			if(r>0) {
				System.out.println("record inserted..");
			}
		} 
		catch(SQLIntegrityConstraintViolationException sq) {
			System.out.println("Can not inserted duplicate Id");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void updatetData() {
		
	}
	public static void deleteData(Integer id) {
		String sq="delete from personalinfo where id='" +id+ "'";
		try {
			int k= st.executeUpdate(sq);
			if(k>0) {
				System.out.println("record deleted successfully..");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void getData() {
		String sq="select * from personalinfo";
		try {
			ResultSet r=st.executeQuery(sq);
			
			while(r.next()) {
				System.out.println(r.getString(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void searchData(Integer id) {
        String sq = "select * from personalinfo where id='" + id + "'";
        try {
            ResultSet r = st.executeQuery(sq);
            if (r.next()) {
            	System.out.println("--------------------------");
                System.out.println("ID: " + r.getString(1));
                System.out.println("Name: " + r.getString(2));
                System.out.println("Age: " + r.getString(3));
                System.out.println("Email: " + r.getString(4));
            } else {
                System.out.println("No record found : " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
}
