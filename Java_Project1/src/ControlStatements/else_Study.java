package ControlStatements;

public class else_Study {

	public static void main(String[] args) 
	{   // if marks greater than or equal 50 then i am Pass, else I am fail
		
		int marks=50;
		if(marks>=50)
		{
			System.out.println("I am pass");
		}
		else 
		{
			System.out.println(" I am fail");
		}
	//if City is Pune -->Visit ShanivarVada-->else you are not in Pune
		String city="Pune";
		if(city=="pune")
		{
			System.out.println("visit shanivar vada");
		}
		else
		{
			System.out.println("you are not in pune");
		}
 // /if gender is M--> I am male else --> I am female
		char gender='F';
		if(gender=='M')
		{
			System.out.println(" I am male");
		}
		else
		{
			System.out.println(" I am female");
		}
	// if my score is less than 80 then I am not clear exam -----I am clear exam	
		short score=60;
		if(score<=80)
		{
			System.out.println("I am not clear exam");
		}
		else
		{
			System.out.println("I am clear exam");
		}
		
		
	}

}
