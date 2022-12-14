package Array_Study;

import java.util.Arrays;

public class Array_Eg2 {

	public static void main(String[] args)
	{
	    int rollNumber[]= {10,50,30,20,40};   // This is another method to declared arrays
	       
	  for(int a=0;a<=rollNumber.length-1;a++)
	  {
		  System.out.println(rollNumber[a]);
	  }
System.out.println("========================================================");
    ////how to sort Array

		Arrays.sort(rollNumber);
	System.out.println("Array in ascending order");
	
		for(int i=0;i<=rollNumber.length-1;i++)
		{
			System.out.println(rollNumber[i]);
		}
		
System.out.println("========================================================");

        System.out.println("Array in descending order");
		
	for(int p= rollNumber.length-1; p>=0;p--)	
		{
		 System.out.println(rollNumber[p]);
	}
		
System.out.println("===========================================================");

      String AnimalName[]= {"Zebra","Elephant","Eagle","Lion","Tiger"};
		
		Arrays.sort(AnimalName);
		
	for(int h=AnimalName.length-1;h>=0;h--)	   // array in descending order 
	{
		System.out.println(AnimalName[h]);
	}

	System.out.println("==================================================");
	
	// start f=0    condition f<=AnimalName   updation i++
	
	for (int f=0;f<=AnimalName.length-1;f++)	// array in ascending order
		
	{
		System.out.println(AnimalName[f]);
	}
System.out.println("========================================================");		
	// start x=AnimalName.lenght-1    condition X>=0    updation X--      //   descending order
		
		char alphabet[]= {'D','G','F','P','Z'};
	Arrays.sort(alphabet);	
		for (int x=alphabet.length-1;x>=0;x--)
		{
			System.out.println(alphabet[x]);
		}
System.out.println("========================================================");
       for (int y=0;y<=alphabet.length-1;y++)
       {
    	   System.out.println(alphabet[y]);
       }
System.out.println("=======================================================");

//    for(int a=0;a<=rollNumber.length-1;a++)         //   normal As it is
//	  for(int i=0;i<=rollNumber.length-1;i++)         // when we do array.sort----> Acesscendig order
//	  for(int p= rollNumber.length-1; p>=0;p--)	   	// when we do array.sort-----> descending order
		
System.out.println("==============================================================================");		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
