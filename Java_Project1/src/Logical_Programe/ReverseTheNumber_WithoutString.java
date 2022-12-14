package Logical_Programe;

public class ReverseTheNumber_WithoutString {

	public static void main(String[] args) {

		
		int orgNum=12345;
		int revNum=0;
		
		for(int i=orgNum;i>0;i=i/10)// 5,
		{
			
			int rem=i%10;
			revNum=revNum*10+rem;
			  //5=0*10+5
			  //54=5*10+4
			  //543 =54*10+3
			  //5432 =543*10+2
			  //54321   =5432*10+1
		}
		
		System.out.println(revNum);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
