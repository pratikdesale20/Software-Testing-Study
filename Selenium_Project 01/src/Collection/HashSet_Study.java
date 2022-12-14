package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Study {

	public static void main(String[] args) {
		
	 HashSet<Object> hs=new HashSet<>();
	 
	 System.out.println(hs.add(201));
	 hs.add("testing");
	 hs.add(null);
	 System.out.println(hs.add(201));
	 hs.add("pune");
	 hs.add(true);
	 hs.add(145.36f);
	 hs.add('P');
	 hs.add("pune");
	 
		
	System.out.println(hs);	
	System.out.println(hs);	
		
	//set doesnot supports travsering using >>>>> for-loop
    // we used>>>>> for-each, iterator		
		
		for (Object H:hs)
		{
			System.out.println(H);
		}
		
System.out.println("===================================================================");

           Iterator<Object> H1 = hs.iterator();
		
		while (H1.hasNext())
		{
			System.out.println(H1.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
