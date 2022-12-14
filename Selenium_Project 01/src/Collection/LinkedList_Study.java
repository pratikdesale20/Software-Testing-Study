package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//import java.util.LinkedList;

public class LinkedList_Study {

	public static void main(String[] args) {
		
	   LinkedList<Object>ll= new LinkedList<>();
		
	  ll.add(2098);
	  ll.add("kasare");
	  ll.add("velocity");
	  ll.add(null);
	  ll.add(11.235f);
	  ll.add(true);
	  ll.add(19);
	  ll.add('P');
		
		System.out.println(ll);
		
	ll.add(0,1998);	
	System.out.println(ll);
	
	ll.addFirst("Pratik");
	System.out.println(ll);
		
	ll.offer("Desale");
	System.out.println(ll);
		
	ll.offerFirst("Mr");
	System.out.println(ll);
		
	System.out.println(ll.peek());
	System.out.println(ll);
		
	System.out.println(ll.peekFirst());	
		
	System.out.println(ll.peekLast());
	
	System.out.println(ll.poll());
	System.out.println(ll);
	
	System.out.println(ll.pollLast());
	System.out.println(ll);
	
	ll.push("Mr.");
	System.out.println(ll);	
		
	System.out.println(ll.size());	
	
System.out.println("===========================================================================");		

//for loop, for each, iterator, listIterator		
		
	for (int i=0;i<=ll.size()-1;i++)
	{
		System.out.println(ll.get(i));
	}
		
System.out.println("============for each loop===================================================");		
		
	for (Object l:ll)
	{
		System.out.println(l);
	}
		
System.out.println("==============iterator===============================================");		
		
		Iterator<Object> L1 = ll.iterator();
		
	while(L1.hasNext())
	{
		System.out.println(L1.next());
	}
		
System.out.println("==============List-Iterator=====================================");		
		
		ListIterator<Object> L2 = ll.listIterator();
		
	while(L2.hasNext())	
	{
		System.out.println(L2.next());
	}
		
		
	
	  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
