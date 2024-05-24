class Swap
{
	void flip(int x,int y)
	{
		int temp;
		temp = x;
		x=y;
		y=temp;
		System.out.println("After swapping A = "+x+" B="+y);
	}
	

	public static void main(String args[])
	{
		int a = 10;
		int b = 20;
		System.out.println("Before swapping A = "+a+" B="+b);
		Swap s = new Swap();
		s.flip(a,b);
		
	}
}
	