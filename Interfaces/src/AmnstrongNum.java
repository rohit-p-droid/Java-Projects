import java.util.Scanner;

public class AmnstrongNum {
	
	public static void main(String args[])
	{
		int n,am = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of digit");
		n = sc.nextInt();
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int num2 = num;
		
		for(int i=0;i<n;i++)
		{
			int rem = num%10;
			num = num/10;
			am = am + (rem*rem*rem);
		}
		
		if(am == num2)
			System.out.println("Number is Amstrong ");
		else
			System.out.println("Number is not Amnstrong");
		
		
	}

}
