package constructor;

public class CC1 {

	int a;
	int b;
	int c;
	
	
public CC1()
	{
	     a=50;
		 b=50;
		 c=50;
		 
		 
	}
	public static void main(String[] args) 
	{ CC1 P1=new CC1();
	  P1.add();
	  P1.add1();
	  
	  CC1 P2=new CC1(50);
	  P2.add();
	  P2.add1();
	  
	  CC1 P3=new CC1(20, 25);
	  P3.add();
	  
	  CC1 P4=new CC1(35, 56, 20);
	  P4.add();
	  
	  CC1 P5=new CC1(56, 50);
	  P5.add();
	  
	 
	}
	
public void add()
{
	int sum=a+b+c;
	System.out.println("addition "+sum);
}
	public CC1(int num)
	{
		a=num;
	}
	
	
	public CC1(int n1,int n2)
	{
		a=n1;
		b=n2;
		
	}
	
	public CC1(short J ,short K)
	{
		a=J;
		b=K;
		
	}
	
	public CC1(int n3, int n4,int n5)
	{
		a=n3;
		b=n4;
		c=n5;
	}

public void add1()
{
	int sub=a-b;
	System.out.println("substraction "+sub);
	System.out.println(" I am Pratik"+sub);
}





}
