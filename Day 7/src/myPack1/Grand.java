package myPack1;

public class Grand {
	
	Parent p = new Parent();
	void print2()
	{
		System.out.println("\nSame Package independant class");
		System.out.println(p.n1);
		System.out.println(p.n2);
		//System.out.println(p.n3);
		System.out.println(p.n4);
	}
	
	public static void main(String args[])
	{
		Child c = new Child();
		Grand g = new Grand();
		g.print2();
		c.print();
	}

}
