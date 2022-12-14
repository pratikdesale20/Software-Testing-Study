package Pattern;

public class Eg12_ButterFly {

	public static void main(String[] args) {

//		*         *
//		**       ** 
//		***     *** 
//		****   ****
//		***** *****
//		****   ****
//		***     ***
//		**       **
//	    *         *
		
	// rows=9; 
		
	int  star=1;
    int  space=5;
	int  star1=1;
    int  space1=4;
		
		
	for (int i=1;i<=9;i++)
	{
		for(int j=1;j<=star;j++)
		{
			System.out.print("*");
		}
		for(int k=1;k<=space;k++)
		{
			System.out.print(" ");
		}
		for(int l=1;l<=space1;l++)
		{
			System.out.print(" ");
		}
		for(int m=1;m<=star1;m++)
		{
		    System.out.print("*");	
		}
		
		if(i<5)
		{
			star++;
			space--;
			star1++;
			space1--;
	    }
		else
		{
			star--;
			space++;
			star1--;
			space1++;
		}
		System.out.println();
	}
		
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

	}

}
