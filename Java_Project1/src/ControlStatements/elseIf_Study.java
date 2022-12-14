package ControlStatements;

public class elseIf_Study {

	public static void main(String[] args) 
	{
		//if marks>=66.66--->dist
		//else if marks >=60-->1st Class
		//else if marks>=50-->2nd class
		//else if marks>=40-->just pass
		//else-->failed
	 
		float marks=72;
		if(marks>=65)
		{
			System.out.println("Distiction");
		}
		else if (marks>60)
		{
			System.out.println("1nd class");
		}
		else if (marks>50)
		{
			System.out.println("2nd class");
		}
		else if (marks>=40)
		{
			System.out.println("Failed");
		}
		else
		{
			System.out.println("failed");
		}
	

	     // percentile 8----10---A
       	// 6----8---B
    	// 4----6---C
    	// default D
	
	    float percentage=5.6f;
	    		
	    if (percentage>=8 & percentage<=10)
	    {
	    	System.out.println("grade A");
	    }
	    else if (percentage>=6 & percentage<8)
	    {
	    	System.out.println("Grade B");
	    }
	    else if (percentage>=4 & percentage<6)
	    {
	    	System.out.println("Grade C");
	    }
	    else
	    {
	    	System.out.println("Grade D");
	    }
	}
}
	
	
	
	
	
	
	

