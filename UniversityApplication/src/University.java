import java.util.Scanner;

public class University {
	
	String uname,ulocation;
	Scanner sc = new Scanner(System.in);
	
	void getUnivDetail()
	{
		System.out.println("Enter university name :");
		uname = sc.nextLine();
		System.out.println("Enter university location :");
		ulocation = sc.nextLine();
		
	}
	
	void dispUnivDetail()
	{
		System.out.println("University name = "+uname);
		System.out.println("University location = "+ulocation);
		
	}

}
