
import java.util.Scanner;

public class Student extends Collage{
	
	int HTno;
	String sname,course;
	Scanner sc = new Scanner(System.in);
	
	void getStudDetail()
	{
		System.out.println("Enter your Hall Ticket number :");
		HTno = sc.nextInt();
		System.out.println("Enter your name :");
		sname = sc.next();
		System.out.println("Enter you course name :");
		course = sc.next();
		
	}
	
	void dispStudDetail()
	{
		System.out.println("Hall Ticket number = "+HTno);
		System.out.println("Student name = "+sname);
		System.out.println("Course name = "+course);
		
	}
}
