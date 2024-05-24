package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class Lists {

	public static void main(String args[])
	{
		ArrayList l = new ArrayList();
		l.add("twelve");
		l.add("Algorithm");
		l.add("True");
		l.add("pi");
		System.out.println("Array elements are");
		System.out.println(l);
		boolean b = l.contains(3.147);
		System.out.println("List contains 3.14 = "+b);
		System.out.println("Index of 'Algotithm' word "+l.indexOf("Algorithm"));
		System.out.println("Size of array = "+l.size());
		System.out.println("Getting element at 3rd position = "+l.get(3));
		System.out.println("removing 3.147 ...");
		l.remove(3.147);
		System.out.println(l);
		System.out.println("\n");
		
		Iterator it = l.iterator();
		System.out.println("Elements in string :");
		while(it.hasNext())
		{
			String s = (String)it.next();
			System.out.println(s);
		}
		
		
		
		
	}
}
