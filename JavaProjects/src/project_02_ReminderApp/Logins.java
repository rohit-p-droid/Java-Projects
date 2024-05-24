package project_02_ReminderApp;

import java.sql.*;
import java.util.Scanner;

public class Logins {
	
	int uid= 0;
	Scanner sc = new Scanner(System.in);
	
	void login()
	{
		Reminders r = new Reminders();
		Connection con = Connections.connect();
		int id = 0;
		String newPass = null;
		System.out.println("Enter your email :");
		String mail = sc.next();
		System.out.println("Enter your password :");
		String pass = sc.next();
		
		try {
			String query = "select * from users where email = ? and passwd = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, mail);
			pst.setString(2, pass);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				System.out.println("Login Successfull !!");
				Values.setEmail(mail);
				r.rem();
			}
			else
			{
				System.out.println("Invalid email or password !!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void viewRem()
	{
		Connection con = Connections.connect();
		try {
			String newMail = Values.getEmail();
			String query = "select * from rem where uemail = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1,newMail);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				System.out.println("\nReminder "+rs.getInt(1));
				System.out.println("Title :");
				System.out.println(rs.getString(3));
				System.out.println("Description :");
				System.out.println(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void delRem()
	{
		Connection con = Connections.connect();
		try {
			System.out.println("Enter reminder number to delete :");
			int id = sc.nextInt();
			String query = "delete from rem where id = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			int i = pst.executeUpdate();
			if(i > 0)
				System.out.println("Reminder "+id+" deleted !!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
