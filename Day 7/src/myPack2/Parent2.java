package myPack2;
import myPack1.Parent;

public class Parent2 {
	
	Parent p = new Parent();
	
	void print2()
	{
		System.out.println("\nOther Packege Independent class");
		//System.out.println(p.n1);
		System.out.println(p.n2);
		//System.out.println(p.n3);
		//System.out.println(p.n4);
	}
	
	public static void main(String args[])
	{
		Parent2 p2 = new Parent2();
		Child2 c2 = new Child2();
		p2.print2();
		c2.print();
	}
	
	

}
