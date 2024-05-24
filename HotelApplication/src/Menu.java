import java.util.*;

public class Menu {
	
	int price1,price2,price3,bill;
	Scanner sc = new Scanner(System.in);
	
	void bill()
	{
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				bill = bill + price1;
				break;
			case 2:
				bill = bill + price2;
				break;
			case 3:
				bill = bill + price3;
				break;	
		}
		System.out.println(bill);
	}
	
	void maharashtrVeg()
	{
		System.out.println("1.Jhunka Bhakar\t\t150rs");
		price1 = 150;
		System.out.println("2.Shev Bhaji\t\t200rs");
		price2 = 200;
		System.out.println("3.Paneer Butter masala\t\t400rs");
		price3 = 400;
		bill();
		
	}
	
	void maharashtrNonVeg()
	{
		System.out.println("1.Chicken Masala\t\t250rs");
		price1 = 250;
		System.out.println("2.Mutton Curry\t\t350rs");
		price2 = 350;
		System.out.println("3.Fhish fry\t\t300");
		price3 = 300;
		bill();
	}
	
	void punjabVeg()
	{
		System.out.println("1.Sarso Sag\t\t\t200rs");
		price1 = 200;
		System.out.println("2.Aaloo Paratha\t\t\t210rs");
		price2 = 210;
		System.out.println("3.Masala Paratha\t\t220rs");
		price3 = 220;
		bill();
	}
	
	void punjabiNonVeg()
	{
		System.out.println("1.Punjabi chicken\t\t300rs");
		price1 = 300;
		System.out.println("2.Punjabi Mutton\t\t450rs");
		price2 = 450;
		System.out.println("3.Punjabi Fish curry\t\t400rs");
		price3 = 400;
		bill();
	}
	
	void south()
	{
		System.out.println("1.Idli Sambhar\t\t100rs");
		price1 = 100;
		System.out.println("2.Vada Sambhar\t\t150rs");
		price2 = 150;
		System.out.println("3.Dosa Sambhar\t\t178rs");
		price3 = 178;
		bill();
	}
	
	void chapati()
	{
		System.out.println("1.Rumali roti\t\t15rs");
		price1 = 15;
		System.out.println("2.Tanduri roti\t\t10rs");
		price2 = 10;
		System.out.println("3.Normal roti\t\t07rs");
		price3 = 7;
		bill();
	}
	
	
	
	
}