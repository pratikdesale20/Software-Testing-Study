package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Study {

	public static void main(String[] args) {
		
		ArrayList<Object> al=new ArrayList<>();
		
		ArrayList<Integer> a1=new ArrayList<>();
		
		al.add(15);
		al.add("Pune");
		al.add("Software");
		al.add(1562);
		al.add(null);
		al.add(null);
		al.add('P');
		al.add("True");
	
		a1.add(20198);
	System.out.println(a1);	
		

	System.out.println(al);	
		
	System.out.println(al.isEmpty());	      // in string there are elements are present or not
		
	System.out.println(al.contains("Software"));   // element are avaliable in string or not	
		
	System.out.println(al.equals(al));	// Compares the specified object with this list is equal or not
		
	System.out.println(al.get(2));     //is use to put index on method then show result as respevtive element in that string
		
	System.out.println(al.indexOf("Software"));	// is use to put string element  on method then show result as respevtive index for that element 
	
System.out.println("=======================================================================================");
	
    System.out.println(al.remove(2));   // is use to remove element from string
	
	System.out.println(al);
	
	System.out.println(al.set(3, "Pratik"));   // is use to add element in string on specific index
	
	System.out.println(al);
	
	System.out.println(al.size());   // is use to get total lenght of present element
	
 System.out.println("======================================================================================");
 
    
     //  for Retrieval operation .......we used different different FOR-LOOPS as follows
	
  System.out.println("============ (1)>>For-Loop========================================");
 
 
         for(int i=0;i<=al.size()-1;i++)
         {
        	  System.out.println(al.get(i));
         }
 
  System.out.println("=============(2)>>For each loop>======================================= ");
 
         for(Object a:al)
         {
        	 System.out.println(a);
         }
 
  System.out.println("===========(3)>>iterator>>================================================");
 
            Iterator<Object> it = al.iterator();
 
         while(it.hasNext())
         {
        	 System.out.println(it.next());
         }
 
 System.out.println("==========(4)>>List-iterator>>============================================");
 
            ListIterator<Object> li = al.listIterator();
            
         while(li.hasNext())
         {
        	 System.out.println(li.next());
         }
 
 
 
 
 
 
 
 
 
 
 
 
	
	}

}
