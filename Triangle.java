class Area
{	
	float z;

	float area1(int l,int h)
	{
		z = 0.5f*l*h;
		return (z);
	}

	void area2()
	{
		int l = 7;
		int h = 8;
		z = 0.5f*l*h;
		System.out.println("2. area of triangle = "+z);
	}
	
	void area3(int l,int h)
	{
		z =0.5f* l*h;
		System.out.println("3. area of triangle = "+z);
	}
	
	float area4()
	{
		int l = 11;
		int h = 12 ;
		z = 0.5f*l*h;
		return z;
	}

}

class Triangle
{
	public static void main(String args[])
	{
		Area c = new Area();

		float q = c.area1(5,6);
		System.out.println("1. area of triangle = "+q);
		c.area2();
		c.area3(9,10);
		float r = c.area4();
		System.out.println("4. area of triangle = "+r);
		
	}
}
