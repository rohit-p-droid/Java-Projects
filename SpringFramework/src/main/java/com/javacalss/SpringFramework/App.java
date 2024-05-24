package com.javacalss.SpringFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.r3sys.SpringCore.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	Student obj1 = (Student) context.getBean("stud");
    	System.out.println(obj1);
    	
    	Student obj2 = (Student) context.getBean("stud1");
    	System.out.println(obj2);
    	

    }
}
