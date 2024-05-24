package multithreading;

public class Parent2 implements Runnable{
	
	public void run()
	{ 
		for(int i = 0; i < 5; i++)
		{
			System.out.println(i);
			try{
				Thread.sleep(1000);
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
		Thread t11 = new Thread(t1);
		Thread t22 = new Thread(t2);
		t11.start();
		t22.start();
		System.out.println("Hello this is in main");
		
		
	
	}

}
