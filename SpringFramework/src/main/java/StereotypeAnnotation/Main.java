package StereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String args[]){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("StereotypeAnnotation/Pappu");
		Pappu p = context.getBean("Pappu", Pappu.class);
		
		System.out.println(p);
		
	}

}
