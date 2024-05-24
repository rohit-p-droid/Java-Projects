package project_02_OrderingSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Admin {

	Scanner sc = new Scanner(System.in);
	Main m = new Main();
	
	void addProduct()
	{
		System.out.println("\n\t****** All products ******");
		Connection con = DbConnection.connect();
		int id = 0;
		String PName;
		System.out.print("Enter product name : ");
		PName = sc.nextLine();
		
		String desc;
		System.out.print("Enter product description : ");
		desc = sc.nextLine();
		
		int price;
		System.out.print("Enter product price : ");
		price = sc.nextInt();
		
		try {
			
			String query = "insert into product values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			pst.setString(2, PName);
			pst.setString(3, desc);
			pst.setInt(4, price);
			int i = pst.executeUpdate();
			
			if(i > 0)
				System.out.println("\nProduct added succesfully !!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void viewProd()
	{
		System.out.println("\n\t****** All products ******");
		
		Connection con = DbConnection.connect();
		try {
			String query = "select * from product";
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				System.out.println("\nProduct id : "+rs.getInt(1));
				System.out.println("Product Name : "+rs.getString(2));
				System.out.println("Product Discription :\n"+ rs.getString(3));
				System.out.print("Product price : "+rs.getInt(4));
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void delProd()
	{
		System.out.println("\n\t****** Delete product ******");
		Connection con = DbConnection.connect();
		System.out.println("Enter product id to deleter product : ");
		int pid = sc.nextInt();
		try {
			
			String query = "delete from product where pid = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, pid);
			int i = pst.executeUpdate();
			if(i > 0)
				System.out.println("Product deleted succesfully !!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void admLogin()
	{
		System.out.println("\n\t****** Admin Login ******");
		Connection con = DbConnection.connect();
		System.out.println("\n\tAdmin Login\n");
		String email;
		System.out.println("Enter your email :");
		email = sc.next();
		String pass;
		System.out.println("Enter your password :");
		pass = sc.next();
		
		try {
			String query = "select * from admins where email = ? and passwd = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, email);
			pst.setString(2, pass);
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				System.out.println("\nLogin Succesfull !!");
				m.admin();
			}
			else
			{
				System.out.println("\nInvalid email or password");
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void viewALLOrders()
	{
		Connection con = DbConnection.connect();
		try {
			String query = "select * from orders";
			PreparedStatement pst = con.prepareStatement(query);
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
