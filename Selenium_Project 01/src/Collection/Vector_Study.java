package Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Study {

	public static void main(String[] args) {
	
		Vector<Integer> V1=new Vector<>();
		
		V1.add(2098);
		V1.add(15);
		V1.add(20);
		V1.add(1998);
		V1.add(null);
		V1.add(null);
		V1.add(20);
		
		System.out.println(V1);

	System.out.println(V1.capacity());	  // this method are give capacity are in range 10,20,40
		
	System.out.println(V1.size());	
		
	    V1.add(212);
	    V1.add(213);
	    V1.add(214);
	    V1.add(215);	
		
	  System.out.println(V1.get(2)); 
	 System.out.println(V1.capacity());	
		
	 System.out.println(V1.size());	
	
	 System.out.println(V1.elementAt(3));	
		
System.out.println("======================================================================");		
		
          //for loop, for each, iterator, listIterator, enumeration	
		
	for (int i=0;i<=V1.size()-1;i++)
	{
		System.out.println(V1.get(i));
	}
		
System.out.println("=======================For Each loop==================================");
		
		for(Integer V:V1)
		{
			System.out.println(V);
		}
		
System.out.println("=======================iterator=================================");
		
	Iterator<Integer> V2 = V1.iterator();
		
		while(V2.hasNext())
		{
			System.out.println(V2.next());
		}
		
System.out.println("===============List-Iterator=======================================");		
		
		      ListIterator<Integer> V3 = V1.listIterator();
		
	   while(V3.hasNext())
	   {
		   System.out.println(V3.next());
	   }
		
System.out.println("===================Enumeration======================================");		
		
	      Enumeration<Integer> el = V1.elements();
		
	  while(el.hasMoreElements())
	  {
		  System.out.println(el.nextElement());
	  }
		
		    
		
		
		
		
		
		

	}

}
