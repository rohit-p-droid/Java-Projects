
public class Grand extends Child {
	
	void mult()
	{
		System.out.println("Multiplication");
	}
	
	public static void main(String args[])
	{
		Parent p = new Grand();
		Grand g = new Grand();
		p.sum();
		p.display();
		g.mult();
		
	}
}
