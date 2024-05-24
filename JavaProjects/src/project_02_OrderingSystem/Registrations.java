package project_02_OrderingSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Registrations {
	
	void regUsr()
	{
		System.out.println("\n\t****** User registration ******");
		Connection con = DbConnection.connect();
		Scanner sc = new Scanner(System.in);
		int id = 0;
		String name;
		System.out.print("Enter your name :");
		name = sc.nextLine();
		String mobNo;
		System.out.print("Enter mobile number :");
		mobNo = sc.next();
		String email;
		System.out.print("Enter your email :");
		email = sc.next();
		String pass;
		System.out.print("Create your password :");
		pass = sc.next();
		
		try {
			
			String query = "insert into users values(?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, email);
			pst.setString(4, mobNo);
			pst.setString(5, pass);
			int i = pst.executeUpdate();
			
			if(i > 0)
				System.out.println("\nUser added succesfully !!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	
	void AdReg()
	{
		System.out.println("\n\t****** Admin registration ******");

		Connection con = DbConnection.connect();
		Scanner sc = new Scanner(System.in);
		int id = 0;
		String name;
		System.out.print("Enter your name :");
		name = sc.nextLine();
		String email;
		System.out.print("Enter your email :");
		email = sc.next();
		String pass;
		System.out.print("Create your password :");
		pass = sc.next();
		
		try {
			
			String query = "insert into admins values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, email);
			pst.setString(4, pass);
			int i = pst.executeUpdate();
			
			if(i > 0)
				System.out.println("\nAdmin added succesfully !!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
