package final_key_used;
    //public final class Final_use-----> not extend to subclass
public class Final_use {

	public static void main(String[] args)
	{
		int a=50;
	  System.out.println(a);
	   a=a+10;
	  System.out.println(a);
	  
		final int b=40; 
		System.out.println(b);
	// if the make variable as a final then can not be reassigned 	
		//  b=b-20;   not reassigned
		System.out.println(b);
		
 }

	  public void add()
	  {
		  System.out.println("hello world");
	  }
	  
	// if the method declare as final in class
	  // then we can't override in subclass
	  
	  public final void test()
	  {
		  System.out.println("hi");
	  }
	
	
	
	
	
	
}
