package project_01_Bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Transactions {

	Scanner sc = new Scanner(System.in);
	Connection con = DbConnect.connect();
	
	void deposit()
	{
		
		try {
			System.out.println("Enter account number :");
			int acc = sc.nextInt();
			System.out.println("Enter amount to deposit :");
			int bal = sc.nextInt();
			String query = "select balance from accounts where accNo = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, acc);
			ResultSet rs = pst.executeQuery();
			int newbal = 0;
			while(rs.next()){
				newbal = rs.getInt(1);
			}
			int balance = bal + newbal;
			String query1 = "update accounts set balance = ? where accNo = ?";
			PreparedStatement pst1 = con.prepareStatement(query1);
			pst1.setInt(1, balance);
			pst1.setInt(2, acc);
			int i = pst1.executeUpdate();
			if(i>0)
				System.out.println("Amount added successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void withdraw()
	{
		try {
			System.out.println("Enter account number :");
			int acc = sc.nextInt();
			System.out.println("Enter amount to withdraw :");
			int newamt = sc.nextInt();
			String query1 = "select balance from accounts where accNo = ?";
			PreparedStatement pst1 = con.prepareStatement(query1);
			pst1.setInt(1, acc);
			ResultSet rs = pst1.executeQuery();
			int amt = 0;
			while(rs.next())
			{
				amt = rs.getInt(1);
			}
			int i,bal = 0;
			String query2 = "update accounts set balance = ? where accNo = ?";
			if(newamt > amt)
				System.out.println("Insufficient balance !!");
			else
			{
				bal = amt - newamt;
				PreparedStatement pst = con.prepareStatement(query2);
				pst.setInt(1, bal);
				pst.setInt(2, acc);
				i = pst.executeUpdate();
				if(i > 0)
					System.out.println("Ammount withdraw successfully !!");
				
				System.out.println("Total account balance = "+bal);
			}	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void AccTransfer()
	{
		try {
			System.out.println("Enter your account number :");
			int acc1 = sc.nextInt();
			System.out.println("Enter amount to Transfer :");
			int amt = sc.nextInt();
			String query1 = "select balance from accounts where accNo = ?";
			PreparedStatement pst = con.prepareStatement(query1);
			pst.setInt(1, acc1);
			ResultSet rs = pst.executeQuery();
			int amt1 = 0;
			while(rs.next())
			{
				amt1 = rs.getInt(1);
			}
			if(amt > amt1)
				System.out.println("\nInsufficient balance to transfer !!\n");
			else 
			{
				System.out.println("Enter account number to transfer amount :");
				int acc2 = sc.nextInt();
				String query2 = "select balance from accounts where accNo = ?";
				PreparedStatement pst2 = con.prepareStatement(query2);
				pst2.setInt(1, acc2);
				ResultSet rs1 = pst2.executeQuery();
				int bal = 0;
				while(rs1.next())
				{
					bal = rs1.getInt(1);
				}
				int newbal = bal + amt;
				String query3 = "update accounts set balance = ? where accNo = ?";
				PreparedStatement pst3 = con.prepareStatement(query3);
				pst3.setInt(1, newbal);
				pst3.setInt(2, acc2);
				int i = pst3.executeUpdate();
					System.out.println("\nAmount succesfully Transferred !!");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
