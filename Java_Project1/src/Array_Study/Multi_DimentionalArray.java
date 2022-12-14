package Array_Study;

public class Multi_DimentionalArray {

	public static void main(String[] args) 
	{   // //1. array declaration 
		
		 int rollNum[][]= new int[2][2];
	
		 ////3.Array  initialization
		 
		rollNum[0][0]=20;
		rollNum[0][1]=30;
		rollNum[1][0]=40;
		rollNum[1][1]=50;
		
		// 4. array usages
		
		System.out.println("===================================");
		System.out.println("Printing normally,without for loop");
		System.out.print(rollNum[0][0]+" ");
		System.out.println(rollNum[0][1]);
		System.out.print(rollNum[1][0]+" ");
		System.out.println(rollNum[1][1]);
		
		
    //   for loop--> two
		
		System.out.println("===================================");
		System.out.println("Printed using for loop");

		for ( int i=0; i<=1; i++)        // //outer for loop-->  for rows
		{
	     //i=0,1,2
              for (int j=0; j<=1; j++)   //  inner for loop-->  columns
			   {
            	//j=0,1,2
				   System.out.print(rollNum[i][j]+" ");
				 //0 0-->10
				 //0 1-->20
				 //1 0-->30
				 //1 1-->40
		      }
			   System.out.println();
		}
System.out.println("=================================================================");

                        char grade[][]=new char[3][2];
		
                        grade[0][0]='a';
                        grade[0][1]='b';
                        grade[1][0]='c';
                        grade[1][1]='d';
                        grade[2][0]='e';
                        grade[2][1]='f';
                        
		
		for ( int i=0;i<=2;i++)
		{
			for ( int j=0;j<=1;j++)
			{
				System.out.print(grade[i][j]+" ");
			}
			System.out.println();
		}
System.out.println("=====================================================================");

           String name[][]=new String [2][3];
		
		name[0][0]="Pratik";
		name[0][1]="viki";
		name[0][2]="mahesh";
		name[1][0]="vivek";
		name[1][1]="ashu";
		name[1][2]="pratisha";
		
		        for ( int i=0;i<=1;i++)
		        {
		        	for (int j=0;j<=2;j++)
		        	{
		        		System.out.print(name[i][j]+" ");
		        	}
		        	System.out.println();
		        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
