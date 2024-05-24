
import java.util.*;

class Conditional
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("If Statement");
		System.out.println("Enter your age");
		int age = sc.nextInt();
		if(age>18)
		{
			System.out.println("You are in !!");
		}
		
		System.out.println("If-else Statement");
		System.out.println("Enter your age again");
		int a = sc.nextInt();
		if(a>18)
		{
			System.out.println("You are eligible to vote !!");
		}	
		else
		{
			System.out.println("You are not eligible to vote !!");
		}
		
		System.out.println("Switch case");
		System.out.println("Enter 1 for day and 2 for night");
		int ans = sc.nextInt();
		
		switch(ans)
		{
			case 1:
			System.out.println("Dayllight");
			break;

			case 2:
			System.out.println("Moonlight");
			break;
	
			default:
			System.out.println("Invalid choise");
		}
	}
}