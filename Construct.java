class Construct
{	
	int a,b,c;
	float d;
	String e;

	Construct()
	{
		System.out.println("Default Constructor");
		a = 10;
		b = 20;	
	}
	
	Construct(int x,int y)
	{	
		System.out.println("\nParameterized Constructor");
		c = x + y;
		System.out.println("Summation = "+c);
	}
	
	Construct(float x,float y)
	{	
		d = x + y;
		System.out.println("Summation = "+d);
	}
	
	Construct(String x,String y)
	{	
		e = x + y;
		System.out.println("Summation = "+e);
	}

	void disp()
	{
		c = a + b;
		System.out.println("Summation = "+c);
	}
	
	
	public static void main(String args[])
	{
		Construct obj = new Construct();
		obj.disp();
		Construct obj2 = new Construct(10,20);
		Construct obj3 = new Construct(3.5f,6.8f);
		Construct obj4 = new Construct("Bhushan","Patil");
	}
}