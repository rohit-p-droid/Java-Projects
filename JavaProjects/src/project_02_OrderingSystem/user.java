package project_02_OrderingSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class user {

	Scanner sc = new Scanner(System.in);
	static String mail;
	static int uid;
	
	public static int getUid() {
		return uid;
	}

	public static void setUid(int uid) {
		user.uid = uid;
	}

	public static String getMail() {
		return mail;
	}

	public static void setMail(String mail) {
		user.mail = mail;
	}

	void login()
	{
		System.out.println("\n\t****** User Login ******");
		Connection con = DbConnection.connect();
		Main m = new Main();
		
		int uid = 0;
		String email;
		System.out.println("Enter email :");
		email = sc.next();
		
		String pass;
		System.out.println("Enter password :");
		pass = sc.next();
		
		PreparedStatement pst;
		try {
			String query = "select * from users where email = ? and passwd = ?";
			pst = con.prepareStatement(query);
			pst.setString(1, email);
			pst.setString(2, pass);
			ResultSet rs = pst.executeQuery();
			
			
			if(rs.next())
			{
				System.out.println("Login Succesfull !!");
				user.setMail(email);
				uid = rs.getInt(1);
				user.setUid(uid);
				m.User();
				
			}
			else
			{
				System.out.println("Invalid email or password");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	void placeOrder()
	{
		System.out.println("\n\t****** Buy product ******");
		Connection con =DbConnection.connect();
		String email = user.getMail();
		
		int oid = 0, uid = user.getUid();
		int pid, price = 0, bill = 0;
		String pname = null, desc = null;
		System.out.println("Enter product id : ");
		pid = sc.nextInt();
		
		int quantity;
		System.out.println("Enter quantity of product ");
		quantity = sc.nextInt();
		
		String addr;
		System.out.print("Enter your address :");
		addr = sc.next();
		
		try {
			String query = "select * from product where pid = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, pid);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				pname = rs.getString(2);
				desc = rs.getString(3);
				price = rs.getInt(4);
			}
			
			bill = price*quantity;
			String query1 = "insert into orders values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst1 = con.prepareStatement(query1);
			pst1.setInt(1, oid);
			pst1.setInt(2, pid);
			pst1.setString(3, pname);
			pst1.setString(4, desc);
			pst1.setInt(5, price);
			pst1.setInt(6, quantity);
			pst1.setString(7, email);
			pst1.setInt(8, bill);
			pst1.setInt(9, uid);
			pst1.setString(10, addr);
			int i = pst1.executeUpdate();
			
			if(i > 0)
				System.out.println("\nOrder Placed succesfully !!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void viewOrder()
	{
		System.out.println("\n\t****** View my orders ******");
		Connection con = DbConnection.connect();
		int uid = user.getUid();
		try {
			String query = "select * from orders where uid = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, uid);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				System.out.println("\nOrder Id : "+rs.getInt(1));
				System.out.println("Product Id : "+rs.getInt(2));
				System.out.println("Product name : "+rs.getString(3));
				System.out.println("Product description : "+rs.getString(4));
				System.out.println("Product price : "+rs.getInt(5));
				System.out.println("Quatity : "+rs.getInt(6));
				System.out.println("Total bill : "+rs.getInt(8));
				System.out.println("Email : "+rs.getString(7));
				System.out.println("Address : "+rs.getString(10));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
