import java.util.Scanner;

public class Collage extends University{

	String ccode,cname,clocation;
	Scanner sc = new Scanner(System.in);
	
	void getClgDetail()
	{
		System.out.println("Enter your collage code :");
		ccode = sc.next();
		System.out.println("Enter your collage name :");
		cname = sc.next();
		System.out.println("Enter your collage location :");
		clocation = sc.next();
	}
	
	void dispClgDetail()
	{
		System.out.println("Collage code = "+ccode);
		System.out.println("Collage name = "+cname);
		System.out.println("Collage location = "+clocation);
	}
}
