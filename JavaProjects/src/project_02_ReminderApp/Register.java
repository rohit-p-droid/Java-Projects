package project_02_ReminderApp;

import java.util.*;
import java.sql.*;

public class Register {
	
	Scanner sc = new Scanner(System.in);
	
	void regUsr()
	{
		Connection con = Connections.connect();
		int id = 0;
		System.out.println("Enter your name :");
		String name = sc.next();
		Values.setName(name);
		System.out.println("Enter your mobile numbber ");
		String mob = sc.next();
		Values.setMob(mob);
		System.out.println("Enter your email id :");
		String mail = sc.next();
		Values.setEmail(mail);
		System.out.println("Create your password :");
		String pass = sc.next();
		Values.setPasswd(pass);
		
		String query = "insert into users values(?,?,?,?,?)";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(query);
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, mob);
			pst.setString(4, mail);
			pst.setString(5, pass);
			int i = pst.executeUpdate();
			if(i > 0)
				System.out.println("User added succesfully !!!");	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	void addRem()
	{
		Logins l = new Logins();
		Connection con = Connections.connect();
		try {
			int id = 0;
			int uid = l.uid;
			String mail = Values.getEmail();
			String query = "select * from users where id = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1,id);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				mail = rs.getString(3);	
			}
			
			System.out.print(" Title : ");
			String tit = sc.nextLine();
			
			System.out.print(" Description : ");
			String desc = sc.nextLine();
			
			String query1 = "insert into rem values(?,?,?,?,?)";
			PreparedStatement pst1 = con.prepareStatement(query1);
			pst1.setInt(1, id);
			pst1.setInt(2,uid);
			pst1.setString(3, tit);
			pst1.setString(4, desc);
			pst1.setString(5, mail);
			
			int i = pst1.executeUpdate();
			
			if(i > 0)
				System.out.println("Reminder added !!");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
