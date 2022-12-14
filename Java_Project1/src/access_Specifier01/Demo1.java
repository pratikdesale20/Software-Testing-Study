package access_Specifier01;

import access_Specifier.Demo;

public class Demo1 extends Demo
{

	public static void main(String[] args)
	
	{
		Demo g=new Demo();
		 // not calling private, default,protected method
		g.test4();  // public
	   
	// I want to call protected member after inheritance then create object
     Demo1 p=new Demo1();
     p.test3();  // protected member
     p.test4();  // public member
	

}
}
