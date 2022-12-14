package Pattern;

public class Eg_5 {

	public static void main(String[] args)
	{
		// *****
		//  ****
		//   ***
		//    **
		//     *

// rows=5  star=5  space=0
		
		int star=5;
		int space=0;
		
		// rows== outer for loop
		
	for(int i=1;i<=5;i++)
	{
		// inner for loop
		for (int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		space++;
		star--;
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
