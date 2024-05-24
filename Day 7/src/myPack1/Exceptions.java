package myPack1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a,b,c;
		
		try{
			 
			System.out.println("Enter first digit :");
			a = s.nextInt();
			System.out.println("Enter second digit :");
			b = s.nextInt();
			c = a/b;
			System.out.println("Division is = "+c);
		}
		catch(ArithmeticException ae)
		{
			System.err.println("Cannot divide by zero ");
		}
		catch(InputMismatchException ie)
		{
			System.err.println("Please input the integer only ");
		}
		finally{
			System.out.println("It is the end of the programm !!!");
		}
	}
}
