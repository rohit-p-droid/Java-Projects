package Construct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ObjectInjection.First;

public class Main2 {
	
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Construct/ConstructConfig.xml");
		
		Student obj = (Student) context.getBean("stud");
		
		System.out.println(obj);
	}

}
