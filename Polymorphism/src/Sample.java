
class Parent{
	
	int a=10,b,c;
	
	void sum(int d)
	{
		a = 10;
		b = 20;
		c = a + b;
		System.out.println("Summation is = "+c);
	}
	
}

class Sample extends Parent{
	
	int a,c,d = 5;
	
	void sum(int d)
	{
		a = 30;
		c = super.a + a + this.d;
		System.out.println(" New Summation is = "+c);
		
	}
	public static void main(String args[]){
		
		System.out.println("Method overiding\n");
		Sample s = new Sample();
		s.sum(10);
		
	}
}

