import java.util.Scanner;

public class Payroll extends Employee {
	
	int da,ta,cca,med,basicSal = 10000;
	int pf,gpa,lic,grossSal;
	Scanner sc = new Scanner(System.in);
	
	void salary()
	{
		System.out.println("\nAdditions\n");
		System.out.println("DA 20% of basic salary = 2000");
		da = 2000;
		System.out.println("TA 10% of basic salary = 1000");
		ta = 1000;
		System.out.println("CCA = 5000");
		cca = 5000;
		System.out.println("MED All 10% of basic salary = 1000");
		med = 1000;
		System.out.println("\nDeductions\n");
		System.out.println("PF 5% of basic salary = 500");
		pf = 500;
		System.out.println("GPA 5% of basic salary = 500");
		gpa = 500;
		System.out.println("LIC 2% of basic salary = 200");
		lic = 200;
		grossSal = basicSal+da+ta+cca;
		System.out.println("\n The Gross salary is = "+grossSal);
	}
	
	void tempSalary()
	{
		System.out.println("Working days = "+days);
		System.out.println("Wages per day = 700");
		grossSal = 700 *days;
		System.out.println("Total salary : Days x Wages per day = "+grossSal);
	}

}
