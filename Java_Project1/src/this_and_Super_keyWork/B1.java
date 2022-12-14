package this_and_Super_keyWork;

public class B1 extends A
{
	   int x=999;
	   
	public static void main(String[] args)
	{      B1 b=new B1();
	        b.test();

	}

	public void test()
	{
		int x=500;
		 
		System.out.println("Local variable of X " +x);
		
		System.out.println("Global Variable of X " +this.x);
		
		System.out.println("Gloabl variable from Super Class " + super.x);
		
		System.out.println("Local variable of Y"+y);
	}
	
	
	
	
	
}
