import java.util.Scanner;

public class Banking extends AmountWithdraw{
	
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		Banking b = new Banking();
		int ch = 0;
		
		
		do{
			System.out.println("\n1.Add user\n2.Display user\n3.Deposit amount\n4.Withdraw amount\n5.View account balance\n6.Exit");
			System.out.println("\nEnter you choice : ");
			ch = s.nextInt();
			
			switch(ch){
				
				case 1 :
				b.addUser();
				break;
				
				case 2:
				b.viewUser();
				break;
				
				case 3:
				b.Deposit();
				break;
				
				case 4:
				b.withdraw();
				break;
				
				case 5 :
				b.checkBalance();
				break;
				
				case 6:
				System.out.println("Exitting !!");
				break;
				
				default:
				System.out.println("Invalid choice !!");
				
			}
				
			}while(ch!=6);
			
			
	
		
	}

}
