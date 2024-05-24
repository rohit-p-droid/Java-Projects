package multithreading;

public class Parent extends Thread{
	
	public void run()
	{ 
		for(int i = 0; i < 5; i++)
		{
			System.out.println(i);
			int a = getPriority();
			//System.out.println("priority = "+a);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String args[])
	{
		
		Parent t1 = new Parent();
		Parent t2 = new Parent();
		t1.start();
		t2.start();
		
		System.out.println("Hello this is in main");
	}

}
