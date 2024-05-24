
class Demo{
	
	int a,b,c;
	void mul()
	{
		a = 20;
		b = 5;
		c = a*b;
		System.out.println("First mulitiplication = "+c);
	}
}

class Demo2 extends Demo{
	
	void mul()
	{
		a = 10;
		b = 4;
		c = a*b;
		System.out.println("Second multiplication = "+c);
	}
	 
}
public class Dynamic extends Demo2 {
	
	void mul()
	{
		a = 6;
		b = 7;
		c = a*b;
		System.out.println("Third multiplication = "+c);
	}
	
	public static void main(String args[]){
	
		Demo d = new Demo();
		d.mul();
		d = new Demo2();
		d.mul();
		d = new Dynamic();
		d.mul();
		
	}

}
