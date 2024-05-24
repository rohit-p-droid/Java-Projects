package UsingInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
	
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("UsingInterface/InterfaceConfig.xml");
		
		System.out.println("\tLaxmi Cheat Fund\n");
		
		System.out.println("Raju ");
		Raju rj = (Raju) context.getBean("raj");
		rj.CheatFund();
		
		System.out.println("\nBabu Bhaiyya ");
		BabuBhaiyya b = (BabuBhaiyya) context.getBean("bb");
		b.CheatFund();
	}

}
