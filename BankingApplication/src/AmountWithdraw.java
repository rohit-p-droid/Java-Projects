import java.util.Scanner;

public class AmountWithdraw extends AmountDeposit{
	
	int amount;
	Scanner sc = new Scanner(System.in);
	
	void withdraw()
	{
		System.out.println("Enter Amount to withdraw :");
		amount = sc.nextInt();
		if(amount < balance)
		{
			balance = balance - amount;
			System.out.println("Amount withdraw sucessfull !!");
			System.out.println("Remaining account balance = "+balance);
		}
		else
		{
			System.out.println("Insufficient balance !!");
		}
		
	}

}
