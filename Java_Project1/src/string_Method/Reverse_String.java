package string_Method;

public class Reverse_String {

	
	public static void main(String[] args) {
		
		
		
		
		
		
		
		String S="Pratik Desale";
		String temp="";
		for(int i=S.length()-1;i>=0;i--)
		{
			temp=temp+S.charAt(i);
			
		}
		System.out.println(temp);
		
		
		
		
	  if(temp.equals(S))
	  {
		  System.out.println("String is palindrome");
	  }
	  else
	  {
		  System.out.println("String is Not palindrome");
	 }
	  
	  
	  
	}

}
