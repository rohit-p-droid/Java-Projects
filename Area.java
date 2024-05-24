class Circle
{	
	float z;

	float area1(float r,float pi)
	{
		float z;
		z = pi*r*r;
		return z;
	}

	void area2()
	{
		float r = 6;
		float pi = 3.14f;
		z = pi*r*r;
		System.out.println("2. area of circle = "+z);
	}
	
	void area3(float r,float pi)
	{
		z = pi*r*r;
		System.out.println("3. area of circle = "+z);
	}
	
	float area4()
	{
		float r = 8;
		float pi = 3.14f;
		z = pi*r*r;
		return z;
	}

}

class Area
{
	public static void main(String args[])
	{
		Circle c = new Circle();

		float q = c.area1(5,3.14f);
		System.out.println("1. area of circle = "+q);
		c.area2();
		c.area3(7,3.14f);
		float r = c.area4();
		System.out.println("4. area of circle = "+r);
		
	}
}
