package ControlStatements;

public class Switch {

	public static void main(String[] args)
	{  //  A== 10---8
	   //  B== 6---8
	   //  C== 4---6
	   //   FAIL
		
		char grade='B';
		switch(grade)
		{
		case 'A': System.out.println("your marks range is 8---10");
		break;
		case 'B': System.out.println("your marks range is 6---8");
		break;
		case 'C': System.out.println("your marks range is 4---6");
		break;
		default:System.out.println("Fail");
   }
		System.out.println("=================================================");
		   //  1-----> welcome in first year Engineering
		   //  2-----> welcome in second year Engineering
		   //  3-----> welcome in third year Engineering
		   //  4-----> welcome in fourth year engineering
		   //  default
		
		int year=2;
		switch (year)
		{
		case 1:System.out.println("welcome in first year Engineering");
		break;
		case 2:System.out.println("welcome in second year Engineering");
		break;
		case 3:System.out.println("welcome in Third year Engineering");
	    break;
		case 4:System.out.println("welcome in fourth year Engineering");
		break;
		default:System.out.println("fault");
		}
		
		}
		

	}


