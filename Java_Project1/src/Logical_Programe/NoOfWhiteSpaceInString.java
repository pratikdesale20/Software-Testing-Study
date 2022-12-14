package Logical_Programe;

public class NoOfWhiteSpaceInString {

	public static void main(String[] args)
	{
		
		String a="Mah ar  a sh tra";
		int count =0;
		
		for (int i=0;i<=a.length()-1;i++)
		{
			char t=a.charAt(i);
			char space=' ';
			if(t==space)
			{
				count++;
			}
		}
		
		System.out.println("Number of blank spaces in String are "+count);
		
	System.out.println("=====================================================================");
	

	String num="12 36 5 9 56";
	int count1 =0;
	
	for (int j=0;j<=num.length()-1;j++)
	{
		int P=num.charAt(j);
		char space1=' ';
		if(P==space1)
		{
			count1++;
		}
	}
	
	System.out.println("Number of blank spaces in String are "+count1);
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		

	}

}
