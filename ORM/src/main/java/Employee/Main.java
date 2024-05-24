package Employee;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import PracticeORM.Student;
import PracticeORM.StudentDao;

public class Main {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		ApplicationContext context = new ClassPathXmlApplicationContext("Employee/config.xml");
		OfficeDao officeDao = context.getBean("officeDao", OfficeDao.class);
		
		System.out.println("\t**** Laxmi Cheat Fund ****");
		
		do{
			System.out.println("\n1.Add Employee\n2.View Employee\n3.View All Employees\n4.Delete Employee\n5.Edit Employee\n6.Exit");
			System.out.println("\nEnter your choice :");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter employee id : ");
					int id = Integer.parseInt(sc.nextLine());
					System.out.println("Enter employee name :");
					String name = sc.nextLine();
					System.out.println("Enter employee city: ");
					String city = sc.nextLine();
					System.out.println("Enter employee job: ");
					String job = sc.nextLine();
					Office o = context.getBean("office", Office.class);
					o.setEmpId(id);
					o.setEmpName(name);
					o.setEmpCity(city);
					o.setEmpJob(job);
					// saving student object to database by calling insert of student dao
					int r = officeDao.insert(o);
					System.out.println(r + " Employee added");
					System.out.println("***************************************");
					System.out.println();
					break;
					
				case 2:
					System.out.println("Enter employee id : ");
					id = Integer.parseInt(sc.nextLine());
					Office office = officeDao.getEmployee(id);
					System.out.println("Id : " + office.getEmpId());
					System.out.println("Name : " + office.getEmpName());
					System.out.println("City : " + office.getEmpCity());
					System.out.println("Job : " + office.getEmpJob());
					System.out.println("___________________________________");
					break;
					
				case 3:
					System.out.println("**************************************");
					List<Office> allEmp = officeDao.getAllEmp();
					for (Office of : allEmp) {
						System.out.println("Id : " + of.getEmpId());
						System.out.println("Name : " + of.getEmpName());
						System.out.println("City : " + of.getEmpCity());
						System.out.println("Job : " + of.getEmpJob());
					System.out.println("___________________________________");
					}
					System.out.println("**************************************");
					break;
					
				case 4:
					System.out.println("Enter employee id : ");
					id = Integer.parseInt(sc.nextLine());
					officeDao.deleteEmp(id);
					System.out.println("Employee deleted...");
					break;
					
				case 5:
					break;
					
				case 6:
					System.out.println("Exitting ...");
					break;
					
				default:
					System.out.println("Invalid choice !!");
			
			}
			
			
		}while(ch != 4);
		
	}
	

}
