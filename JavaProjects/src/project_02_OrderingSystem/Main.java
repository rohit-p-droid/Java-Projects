package project_02_OrderingSystem;

import java.util.Scanner;

public class Main {
	
	
	Scanner sc = new Scanner(System.in);
	void admin()
	{
		int ch = 0;
		user u = new user();
		Registrations r = new Registrations();
		Admin a = new Admin();
		do{
			System.out.println("\n1.Add product\n2.View all products\n3.Delete product\n4View all orders\n5.Exit");
			System.out.println("Enter your choice :");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					a.addProduct();
					break;
					
				case 2:
					a.viewProd();
					break;
					
				case 3:
					a.delProd();
					break;
					
				case 4:
					a.viewALLOrders();
					break;
					
				case 5:
					System.out.println("Exitting ...");
					break;
					
				default :
					System.out.println("Invalid choice !!");
					break;
				
			}
			
		}while(ch != 5);
	}
	
	void User()
	{
		user u = new user();
		Registrations r = new Registrations();
		Admin a = new Admin();
		int ch = 0;
		do
		{

			System.out.println("\n1.View Products\n2.Buy product\n3.View my orders\n4.Exit");
			System.out.println("\nEnter your choice :");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					a.viewProd();
					break;
				
				case 2:
					u.placeOrder();
					break;
					
				case 3:
					u.viewOrder();
					break;
					
				case 4:
					System.out.println("Exitting ...");
					break;
				
				default :
					System.out.println("Invalid choice !!");
					break;
				
			}
			
		}while(ch != 4);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		user u = new user();
		Registrations r = new Registrations();
		Admin a = new Admin();
		
		int ch = 0;
		do{
			System.out.println("\n\t****** Main menu ******");
			System.out.println("\n1.Register new user\n2.User Login\n3.Admin Login\n4.Register as admin\n5.Exit");
			System.out.println("\nEnter your choice : ");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					r.regUsr();
					break;
				
				case 2:
					u.login();
					break;
					
				case 3:
					a.admLogin();
					break;
					
				case 4:
					r.AdReg();
					break;
					
				case 5:
					System.out.println("\nExitting ...");
					break;
					
				default:
					System.out.println("Invalid choice !!");
				
			}
			
		}while(ch != 5);
		
	}

}
