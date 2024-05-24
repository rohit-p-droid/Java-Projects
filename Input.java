class Input
{
	public static void main(String k[])
	{
		int a = Integer.parseInt(k[0]);
		int b = Integer.parseInt(k[1]);
		
		int c = a + b;
		System.out.println("Summation = "+c);

		float x = Float.parseFloat(k[2]);
		float y = Float.parseFloat(k[3]);
		
		float z = x + y;
		System.out.println("Float addition = "+z);
		
		String s = k[4];
		System.out.println("Good afternoon, Mr."+s+" have a good day.");

	}
}