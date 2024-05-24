import java.util.Scanner;

public class Employee {

	String cname,ename,company;
	int enumber,days;
	Scanner sc = new Scanner(System.in);
	
	void EmployeeDtail()
	{
		System.out.println("Enter company name :");
		company = sc.next();
		System.out.println("Enter you number :");
		enumber = sc.nextInt();
		System.out.println("Enter your name :");
		ename = sc.next();
	}
	
	void dispEmpDetail()
	{
		System.out.println("Company name = "+company);
		System.out.println("Employee Number = "+enumber);
		System.out.println("Employee Name = "+ename);
	}
	
	void tempEmployee()
	{
		System.out.println("Enter company name :");
		company = sc.next();
		System.out.println("Enter you number :");
		enumber = sc.nextInt();
		System.out.println("Enter your name :");
		ename = sc.next();
		System.out.println("Enter working days:");
		days = sc.nextInt();
	}
	
	void dispTempEmpDetail()
	{
		System.out.println("Company name = "+company);
		System.out.println("Employee Number = "+enumber);
		System.out.println("Employee Name = "+ename);
	}
	
}
