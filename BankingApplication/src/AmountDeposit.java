import java.util.Scanner;

public class AmountDeposit extends AccountDetail{
	
	int amount;
	Scanner c = new Scanner(System.in);

	
	void Deposit()
	{
		System.out.println("Enter amount to deposit :");
		amount = c.nextInt();
		balance = balance + amount;
		System.out.println("Amount added successfully !!");
		System.out.println("Total accout balance = "+balance);
	}

}

