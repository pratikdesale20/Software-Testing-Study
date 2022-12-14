package constructor;

public class CS3 {

	int num1;
	int num2;
	int num3;
	
	public CS3()
	{
		num1=10;
		
		
	}
	
	public CS3(int a)
	{
		num1=a;
	}
	
	public CS3(int a, int b,int c)
	{
		num1=a;
		num2=b;
		num3=c;
		
	}
	
	
	public void add()
	{
		int sum=num1+num2+num3;
		System.out.println("total addition "+sum);
	}
	
	
	
	public static void main(String[] args)
	{
	    CS3 c1=new CS3(20, 20, 20);
	    c1.add();
	    

	}

}
