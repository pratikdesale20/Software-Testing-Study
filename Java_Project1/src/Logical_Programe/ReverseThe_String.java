package Logical_Programe;

import java.util.Scanner;

public class ReverseThe_String {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter the String");
		
		String originalString=sc.next();
		String reverseString="";
		
		for(int i=originalString.length()-1;i>=0;i--)
		{
			
			char t = originalString.charAt(i);
			
			reverseString=reverseString+t;
		}
		System.out.println("Original string is "+originalString);
		System.out.println("Reverse String is "+reverseString);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
