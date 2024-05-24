package project_01_Bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Accounts {
	
	Scanner sc = new Scanner(System.in);
	Connection con = DbConnect.connect();
	
	void addAcc()
	{
		int accNo = 0;
		System.out.println("Enter your first name :");
		String fname = sc.next();
		System.out.println("Enter your last name :");
		String lname = sc.next();
		System.out.println("Enter your city :");
		String city = sc.next();
		System.out.println("Enter account balance :");
		int balance = sc.nextInt();
		String query = "insert into accounts values(?,?,?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, accNo);
			pst.setString(2, fname);
			pst.setString(3,lname);
			pst.setString(4, city);
			pst.setInt(5, balance);
			int i = pst.executeUpdate();
			if(i>0)
				System.out.println("\nAccount added successfully !!");
			
			try {
				String query1 = "select * from accounts where fname = ? and city = ?";
				PreparedStatement pst1 = con.prepareStatement(query1);
				pst1.setString(1,fname);
				pst1.setString(2,city);
				ResultSet rs = pst1.executeQuery();
				System.out.println("\nAccout_Number\t\tFirst_name\t\tLast_name\t\tCity\t\tAccout_Balance\n");
				while(rs.next())
				{
					System.out.println("\t"+rs.getInt(1)+"\t\t\t"+rs.getString(2)+"\t\t\t"+rs.getString(3)+"\t\t\t"+rs.getString(4)+"\t\t\t"+rs.getInt(5));
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void delAcc()
	{
		System.out.println("Enter account number to delete :");
		int accNo = sc.nextInt();
		String query = "delete from accounts where accNo = ?";
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, accNo);
			pst.executeUpdate();
			System.out.println("Account succesfully deleted !!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void viewAll()
	{
		try {
			Statement st = con.createStatement();
			String query = "select * from accounts";
			ResultSet rs = st.executeQuery(query);
			System.out.println("   Accout_Number  \t\tFirst_name    \t\tLast_name    \t\tCity   \t\tAccout_Balance\n");
			while(rs.next())
			{
				System.out.println("\t"+rs.getInt(1)+"\t\t\t"+rs.getString(2)+"\t\t\t"+rs.getString(3)+"\t\t\t"+rs.getString(4)+"\t\t\t"+rs.getInt(5));
			}
			try {
				System.out.println("Enter account number : ");
				int acc = sc.nextInt();
				String query1 = "select * from accounts where accNo = ?";
				PreparedStatement pst = con.prepareStatement(query1);
				pst.setInt(1,acc);
				ResultSet rs1 = pst.executeQuery();
				System.out.println("   Accout_Number  \t\tFirst_name    \t\tLast_name    \t\tCity   \t\tAccout_Balance\n");
				while(rs1.next())
				{
					System.out.println("\t"+rs1.getInt(1)+"\t\t\t"+rs1.getString(2)+"\t\t\t"+rs1.getString(3)+"\t\t\t"+rs1.getString(4)+"\t\t\t"+rs.getInt(5));
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void viewAcc()
	{
		try {
			System.out.println("Enter account number : ");
			int acc = sc.nextInt();
			String query = "select * from accounts where accNo = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1,acc);
			ResultSet rs = pst.executeQuery();
			System.out.println("   Accout_Number  \t\tFirst_name    \t\tLast_name    \t\tCity   \t\tAccout_Balance\n");
			while(rs.next())
			{
				System.out.println("\t"+rs.getInt(1)+"\t\t\t"+rs.getString(2)+"\t\t\t"+rs.getString(3)+"\t\t\t"+rs.getString(4)+"\t\t\t"+rs.getInt(5));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
