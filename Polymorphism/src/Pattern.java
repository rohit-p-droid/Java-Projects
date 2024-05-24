
public class Pattern {
	
	public static void main(String args[]){
		
		int i,j,k,l;
		
		System.out.println("Pattern 1\n");
		for(i = 0; i < 5; i++)
		{
			for(j = 0; j < (i + 1); j++)
			{
				System.out.print(i+1);
			}
			System.out.println();
		}
		
		
		System.out.println("\nPattern 2\n");
		for(i = 5; i > 0; i--)
		{
			for(j = 5; j > (5-i); j--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println("\n Pattern 3\n");
		for(i=0;i<5;i++)
		{
			for(j=5;i>5;i--)
			{
				for(k=0;k<5;k++)
				{
					System.out.print("*");
				}
				System.out.print("");
			}
			System.out.println("");
		}
		
	}

}
