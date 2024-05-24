package project_02_ReminderApp;

import java.util.Scanner;

public class Reminders {
	
	Scanner sc = new Scanner(System.in);
	Register r = new Register();
	Logins l = new Logins();
	
	void rem()
	{
		int ch = 0;
		do
		{
			System.out.println("\n1.Add Reminder\n2.View Reminders\n3.Delete Reminder\n4.Exit");
			System.out.println("Enter your choice :");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					r.addRem();
					break;
				
				case 2:
					l.viewRem();
					break;
					
				case 3:
					l.delRem();
					break;
					
				case 4:
					System.out.println("Exiting ...");
					break;
				
				default :
					System.out.println("Invalid choice !!");
			}
			
		}while(ch != 4);
	}

}
