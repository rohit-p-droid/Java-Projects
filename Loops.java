
import java.util.*;

class Loops
{
	public static void main(String args[])
	{
		System.out.println("while loop");
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter 5 to exit from loop !! :");
		System.out.println("Enter any digit :");
		a = sc.nextInt();
		while(a!=5)
		{
			System.out.println("Enter any digit :");
			a = sc.nextInt();
		}
		
		System.out.println("do-while loop");
		System.out.println("Enter any digit again :");
		a = sc.nextInt();
		do
		{
			System.out.println("Enter any digit again :");
			a = sc.nextInt();
		}while(a!=5);

		System.out.println("for loop");
		int i;
		for(i = 0;i<5;i++)
		{
			System.out.println((i+1)+".Happy learning");
		}
	}
}