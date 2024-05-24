package com.project01;

import java.sql.*;

public class Db {

	
	public static Connection connect()
	{
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project01","root","");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return (con);
		
	}
}
