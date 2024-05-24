import java.util.Scanner;

public class Main extends Student{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		System.out.println("\nGernerate Hall Ticket for Student\n");
		
		System.out.println("\nUniversity Details\n");
		m.getUnivDetail();
		System.out.println("\nCollage Detail\n");
		m.getClgDetail();
		System.out.println("\nStudent Detail\n");
		m.getStudDetail();
		
		System.out.println("\nHall ticket for Student :\n");
		
		m.dispUnivDetail();
		m.dispClgDetail();
		m.dispStudDetail();
		

	}

}
