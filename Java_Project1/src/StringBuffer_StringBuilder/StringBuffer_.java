package StringBuffer_StringBuilder;

public class StringBuffer_ {

	public static void main(String[] args) {
		
		
		StringBuffer sb=new StringBuffer("selenium ");
		
		sb.append("Automation Testing Tool ");
		
		System.out.println(sb);
		
		// reverse the String
		
//      	System.out.println(sb.reverse());      hide this 
	
		// insert() method used
		 
		System.out.println(sb.insert(5, 'z'));
		
		// delect() method used
		
		System.out.println(sb.delete(20, 26));
		
		// capacity method Used
		
		System.out.println(sb.capacity());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
