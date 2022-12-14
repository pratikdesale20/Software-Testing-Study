package Logical_Programe;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("pls Enter the String");
	    String original=sc.next();
		String reverse="";  
		
		for(int i=original.length()-1;i>=0;i--)
		{
			char t = original.charAt(i);
			
			reverse=reverse+t;
		}
		System.out.println("Original String is "+original);
		System.out.println("Reverse String is "+reverse);
		
		
		if(original.equals(reverse))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
