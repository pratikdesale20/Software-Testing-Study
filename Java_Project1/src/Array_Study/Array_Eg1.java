package Array_Study;

public class Array_Eg1 {

	public static void main(String[] args) 
	{
	    // I want to store player names
		// Array declaration
		
		String pNames[]=new String[5];
		
		// Array Initialization
		
         pNames[0]="Rohit";
         pNames[1]="virat";
         pNames[2]="Hardik";
         pNames[3]="SuryaKumar";
         pNames[4]="Bumrah";
         
         
       // Array Usages
         System.out.println(pNames[0]);
         System.out.println(pNames[1]);
         System.out.println(pNames[2]);
         System.out.println(pNames[3]);
         System.out.println(pNames[4]);
         
       //System.out.println(pNames[-1]);//ArrayIndexOutOfBoundsException
       //System.out.println(pNames[14]);//ArrayIndexOutOfBoundsException    
 System.out.println("=================================================================");
 
     System.out.println("Array travesing using static for loop");
        //use of for loop for array traversing
         
     for(int i=0;i<=4;i++)
     {
    	 System.out.println(pNames[i]);
     }
         
 System.out.println("================================================================");
     System.out.println("Array travesing using dynamic for loop");
     //use of for loop for array traversing   dynamic     
         
         for(int g=0;g<=pNames.length-1;g++)
         {
        	 System.out.println(pNames[g]);
         }
         
 System.out.println("====================================================================");
 
 System.out.println("Array travesing in reverse orderusing dynamic for loop");
//use of for loop for array traversing
         
 //(int i=pNames.length-1;i>=0;i--)  
         for(int i=pNames.length-1;i>=0;i--)
         {
        	 System.out.println(pNames[i]);
         }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
	}

}
