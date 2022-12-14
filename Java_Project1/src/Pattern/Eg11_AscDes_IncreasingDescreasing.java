
package Pattern;

public class Eg11_AscDes_IncreasingDescreasing {

	public static void main(String[] args)
	{
	   
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
//		
		
	// for rows= 9; star=1;space=0;
		
		int star=1;
		
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<star;j++)
			{
				System.out.print("*");
			}
			 System.out.println();
			 if(i<6)
			 {
				 star++;
			 }
			 else
			 {
				 star--;
			 
			 }
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	

}
