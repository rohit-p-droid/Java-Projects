package project_02_ReminderApp;

import java.util.Scanner;

public class MainRem {
		
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Register r = new Register();
		Logins l = new Logins();
		int ch = 0;
		do{
			System.out.println("\n1.Register new user\n2.Log in\n3.Exit\n");
			System.out.println("Enter your choice :");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					r.regUsr();
					break;
					
				case 2:
					l.login();
					break;
					
				case 3:
					System.out.println("Exiting ...");
					break;
					
				default :
					System.out.println("Invalid choice !!");
			}
		}while(ch != 3);
		
	}
	

}
