package multithreading;

public class ObjTypeCasting {
	
	public static void main(String args[])
	{
		try{
			Object obj1 = "MungDal";
			Object obj2 = "34";
			String a = (String) obj1;
			System.out.println(obj1);
			System.out.println(a.length());
			
		}catch(ClassCastException ce){
			System.out.println("class not found exception");
			System.err.println();
			ce.printStackTrace();
		}
		
	}

}
