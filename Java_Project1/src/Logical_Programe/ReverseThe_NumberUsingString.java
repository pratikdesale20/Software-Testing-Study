package Logical_Programe;

import java.util.Scanner;

public class ReverseThe_NumberUsingString {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter any Number");
		
		int originalNum=sc.nextInt();
		String oriString=Integer.toString(originalNum);
		String revString="";
		
		for(int i=oriString.length()-1;i>=0;i--)
		{
			char P = oriString.charAt(i);
			
			revString=revString+P; 
		}
		System.out.println(revString);
		
		
		int revNumber = Integer.parseInt(revString);
		
		System.out.println("Given number is "+oriString);
		
		System.out.println("Reverse number is "+revNumber);
		
		
		
		
		
		
		

	}

}
