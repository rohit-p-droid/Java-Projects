package myPack1;

public class Exception2 {

	public void division(int a,int b)throws ClassNotFoundException
	
	{
		int c = a/b;
	}
	public void division2(int a,int b)throws ArithmeticException
	
	{
		int c = a/b;
	}
	
	public static void main(String args[])
	{
		Exception2 e = new Exception2();
		
		e.division2(45,0);
		
			try {
				e.division(10, 0);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
	}
	
}
