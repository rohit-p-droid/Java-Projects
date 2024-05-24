import java.util.Scanner;
public class AccountDetail{
	
	int accNo,balance;
	String name;
	Scanner sca = new Scanner(System.in);
	
	void addUser()
	{
		System.out.println("Enter you account numbver :");
		accNo = sca.nextInt();
		System.out.println("Enter your name :");
		name = sca.next();
		System.out.println("Enter account balance :");
		balance = sca.nextInt();
	}
	
	void viewUser()
	{
		System.out.println("Account number = "+accNo);
		System.out.println("Name = "+name);
		System.out.println("Account balance = "+balance);
	}
	
	void checkBalance()
	{
		System.out.println("Account balance = "+balance);
	}

}
