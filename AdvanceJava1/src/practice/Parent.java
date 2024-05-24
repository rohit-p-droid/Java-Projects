package practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Parent {
	
	void addUser()
	{
		try {
			
			Scanner s = new Scanner(System.in);
			Connection con = DbConnection.connect();
			int id = 0;
			System.out.println("Enter name :");
			String name = s.next();
			System.out.println("Enter city :");
			String city = s.next();
			System.out.println("Enter balance :");
			int balance = s.nextInt();
			PreparedStatement pst = con.prepareStatement("insert into users values(?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3,city);
			pst.setInt(4, balance);
			int i = pst.executeUpdate();
			if(i>0)
				System.out.println("User added");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void viewUser()
	{
		
		try {
			Connection con = DbConnection.connect();
			Statement st = con.createStatement();
			String query = "select * from users";
			ResultSet rs = st.executeQuery(query);
			System.out.println("\tId\tName\tCity\tBalance\n");
			while(rs.next())
			{
				System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String args[])
	{
		Parent p = new Parent();
		System.out.println("Add user :");
		p.addUser();
		System.out.println("\nShow users ");
		p.viewUser();
	}

}
