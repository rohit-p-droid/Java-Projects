import java.util.Scanner;

public class MenuCard extends Menu{
	
	public static void main(String args[])
	{
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		Menu m = new Menu();
		int ch1,ch;
		do{
			System.out.println("\tHotel Aaoji khaoji\n");
			System.out.println("1.Maharashtrian food\n2.Panjabi food\n3.South Indian food\n4.Rotis");
			System.out.println("Enter your choice : ");
			ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("\nMaharashtrian Veg\n");
				m.maharashtrVeg();
				System.out.println("\nMaharashtrian Non Veg\n");
				m.maharashtrNonVeg();
				break;
			
			case 2:
				System.out.println("\nPanjabi Veg\n");
				m.punjabVeg();
				System.out.println("\nPanjabi Non Veg\n");
				m.punjabiNonVeg();
				break;
				
			
			case 3:
				m.south();
				break;
				
			case 4:
				m.chapati();
				break;

			default:
				System.out.println("Invalid choice !!");
				break;
		}
		System.out.println("\n5.Wanna order more ...\n6.Exit");
		ch1 = sc.nextInt();
		if(ch1 == 5)
			flag = 1;
		else{
			flag = 0;
			System.out.println("Thanks ... Visit again !!");
		}
	}while(flag == 1);
	
	System.out.println("your bill = "+m.bill);
	}
	
	

}
