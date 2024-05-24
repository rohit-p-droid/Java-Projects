import java.util.Scanner;

public class Main extends Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		System.out.println("Enter 1 for permenent employee 2 for temporary employee");
		int a = sc.nextInt();
		
		if(a == 1)
		{
			m.EmployeeDtail();
			System.out.println("\n Salary Slip \n");
			m.dispEmpDetail();
			m.salary();
			
		}
		else if(a == 2)
		{
			m.tempEmployee();
			System.out.println("\n Salary Slip \n");
			m.dispTempEmpDetail();
			m.tempSalary();
		}
		else 
		{
			System.out.println("invalid choise !!");
		}

	}

}
