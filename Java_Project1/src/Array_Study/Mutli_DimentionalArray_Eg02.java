package Array_Study;



public class Mutli_DimentionalArray_Eg02 {

	public static void main(String[] args) 
	{
		  int age[][]= {{20,10,25},{40,50,35},{60,30,51}};
		  
		  for (int i=0;i<=2;i++)
		  {
			  for(int j=0;j<=2;j++)
			  {
				  System.out.print(age[i][j]+" ");
			  }
				System.out.println();	  
		  }
	System.out.println("==========================================================================");	
		
	char grade[][]= {{'a','b','c'},{'d','e','f'}};
	
	        for (int p=0;p<=1;p++)
	        {
	        	for (int q=0;q<=2;q++)
	        	{
	        		System.out.print(grade[p][q]+"    ");
	        	}
	        	System.out.println();
	        	
	       }
	System.out.println("=======================================================================");
	
	           
	  

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
