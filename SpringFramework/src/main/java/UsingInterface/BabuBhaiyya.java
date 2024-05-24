package UsingInterface;

import java.util.Scanner;

public class BabuBhaiyya implements PaisaDouble
{
	
	public void CheatFund()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amout to invest :");
		int money = sc.nextInt();
		int doublem = 2*money;
		System.out.println("The double amount is : "+doublem);
	}

	
	
}
