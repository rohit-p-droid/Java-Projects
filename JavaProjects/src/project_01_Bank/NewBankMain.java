package project_01_Bank;

import java.util.Scanner;

public class NewBankMain {
	
	Scanner sc = new Scanner(System.in);
	int ch = 0;
	Accounts a = new Accounts();
	Transactions t = new Transactions();
	
	void manager()
	{
		do{
			System.out.println("\n1.Add Account\n2.Delete Account\n3.View All Accounts\n4.Exit\n");
			System.out.println("Enter your choice :");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					a.addAcc();
					break;
					
				case 2:
					a.delAcc();
					break;
					
				case 3:
					a.viewAll();
					break;
					
				case 4:
					System.out.println("Exitting ...");
					break;
					
				default:
					System.out.println("Invalid choice !!");
			}
		}while(ch!=4);
		
	}
	
	void accHolder()
	{
		do{
			System.out.println("\n1.View Account\n2.Deposit Amount\n3.Withdraw Amount\n4.Transfer Amount to Account\n5.Exit\n");
			System.out.println("Enter you choice :");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					a.viewAcc();
					break;
					
				case 2:
					t.deposit();
					break;
					
				case 3:
					t.withdraw();
					break;
					
				case 4:
					t.AccTransfer();
					break;
				
				case 5:
					System.out.println("Exitting ...");
					break;
					
				default:
					System.out.println("Invalid choice !!");
			}
		}while(ch != 5);
		
	}
	
	public static void main(String args[])
	{
		NewBankMain n = new NewBankMain();
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do{
			System.out.println("\n1.Manager\n2.Account Holder\n3.Exit\n");
			System.out.println("Enter your choice :");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					n.manager();
					break;
					
				case 2:
					n.accHolder();
					break;
					
				case 3:
					System.out.println("Exitting ...");
					break;
				
				default:
					System.out.println("Invalid choice !!");
				
			}
		}while(ch != 3);
		
		
	}

}
