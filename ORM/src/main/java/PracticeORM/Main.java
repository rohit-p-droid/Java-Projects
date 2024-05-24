package PracticeORM;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("PracticeORM/config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		Scanner sc = new Scanner(System.in);
		boolean go = true;
		while (go) {
		System.out.println("PRESS 1 for add new student");
		System.out.println("PRESS 2 for display all students");
		System.out.println("PRESS 3 for get detail of single student");
		System.out.println("PRESS 4 for delete students");
		System.out.println("PRESS 5 for update student");
		System.out.println("PRESS 6 for exit");
		try {
		int input = Integer.parseInt(sc.nextLine());
		switch (input)
		{
		case 1:
		// add a new student
		// taking inputs from users
		System.out.println("Enter user id : ");
		int uId = Integer.parseInt(sc.nextLine());
		System.out.println("Enter user name :");
		String uName = sc.nextLine();
		System.out.println("Enter user city: ");
		String uCity = sc.nextLine();
		// creating student object and setting values
		//Student s = new Student();
		Student s = context.getBean("student", Student.class);
		s.setStudentId(uId);
		s.setStudentName(uName);
		s.setStudentCity(uCity);
		// saving student object to database by calling insert of student dao
		int r = studentDao.insert(s);
		System.out.println(r + " student added");
		System.out.println("***************************************");
		System.out.println();
		break;
		case 2:
		// display all student
		System.out.println("**************************************");
		List<Student> allStudents = studentDao.getAllStudents();
		for (Student st : allStudents) {
		System.out.println("Id : " + st.getStudentId());
		System.out.println("Name : " + st.getStudentName());
		System.out.println("City : " + st.getStudentCity());
		System.out.println("___________________________________");
		}
		System.out.println("**************************************");
		break;
		case 3:
		// get single student data
		System.out.println("Enter user id : ");
		int userId = Integer.parseInt(sc.nextLine());
		Student student = studentDao.getStudent(userId);
		System.out.println("Id : " + student.getStudentId());
		System.out.println("Name : " + student.getStudentName());
		System.out.println("City : " + student.getStudentCity());
		System.out.println("___________________________________");
		break;
		case 4:
		// delete student;
		System.out.println("Enter user id : ");
		int id = Integer.parseInt(sc.nextLine());
		studentDao.deleteStudent(id);
		System.out.println("Student deleted...");
		break;
		case 5:
		// update the student
		break;
		case 6:
		// exit
		go = false;
		break;
		}
		} catch (Exception e) {
		System.out.println("Invalid Input Try with another one !!");
		System.out.println(e.getMessage());
		}
		}
		System.out.println("Thankyou for using my application");
		System.out.println("See you soon !!");
		}
		


}
