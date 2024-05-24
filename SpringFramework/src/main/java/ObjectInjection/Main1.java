package ObjectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main1 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ObjectInjection/OBJconfig.xml");
    	
    	First obj1 = (First) context.getBean("ft");
    	System.out.println(obj1);
    	
    	Second obj2 = (Second) context.getBean("sd");
    	System.out.println(obj2);

	}

}
