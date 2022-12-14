package Logical_Programe;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args)
	{
		
		// 5!=5*4*3*2*1=120
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
				
		int number=sc.nextInt();
		int mul=1;
		
		for(int i=number;i>0;i--)
		{
			mul=mul*i;
		}
	    System.out.println("Factorial of "+number+" is" +mul);
		
	    
		
		
		
		
		
		
		
		
		
		
		

	}

}
