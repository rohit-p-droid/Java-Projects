package UsingInterface;

import java.util.Scanner;

public class Raju implements PaisaDouble {
	
	public void CheatFund()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter money to invest :");
		int money = sc.nextInt();		
		int val = 2*money;	
		System.out.println("Your double money is :"+val);
	}
	
	

}
