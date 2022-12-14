package methods;

public class NonStaticMethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//to call non static method from same class--->>need to create object of a class
		// how to create object
		//  className objectName=New className();
		
		NonStaticMethodCall obj=new NonStaticMethodCall(); //create object
		     // call-->> Non static method
		   obj.myMethod();
		   
		   // calling non Static method from another class
		      Sample1 S1=new Sample1();
		      S1.myMethod1();
		    		  
		
	}

	public void myMethod()
	{
		System.out.println("hi i am non static method myMethod");
	}
	
}
