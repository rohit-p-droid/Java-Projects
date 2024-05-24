package AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main4 {
	
	public static void main(String args)
	{
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("AutoWiring/AutowireConfig.xml");
		
		AA obj = (AA) context.getBean("aa");
		
		System.out.println(obj.getOne());
		
		
	}
	
	
	
}
