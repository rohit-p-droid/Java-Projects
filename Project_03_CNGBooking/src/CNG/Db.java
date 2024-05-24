package CNG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
	
	static int pumpId;
	
	public static int getPumpId() {
		return pumpId;
	}

	public static void setPumpId(int pumpId) {
		Db.pumpId = pumpId;
	}

	public static Connection connect()
	{
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project03cng","root","");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return (con);
		
	}

}
