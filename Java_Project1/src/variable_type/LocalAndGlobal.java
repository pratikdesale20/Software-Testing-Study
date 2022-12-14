package variable_type;

public class LocalAndGlobal {

	int a=100;
	static int b=50;
	
	public static void main(String[] args) 
	{   test1();  // static calling
		LocalAndGlobal p1=new LocalAndGlobal();
	     p1.test();  // non static calling
	     
	     System.out.println("Globle value of a is "+p1.a); //-->>non static global variable same class
		int sum=10+p1.a;
		System.out.println("global value of new "+sum); //--> non static global variable same class
		
       System.out.println(" Global Value of b "+b);     // --->> static global variable class
         int mul=10*b;
         System.out.println("Global value of B is "+mul);
   //=======================================================================
         
         Demo_class p2=new Demo_class();  // calling non static from diff.class
        System.out.println(" Calling difference class in same class "+p2.c);
        
        int div=200/p2.c;
        System.out.println("division is "+div);
             
        System.out.println("calling static from different class "+Demo_class.d); 
        		 int sub=100-Demo_class.d;
        		 System.out.println("subtraction "+sub);
 }

	public void test()
	{
		int a=188;
	
		System.out.println("non static test "+a);
	}
	public static void test1()
	{
		System.out.println("static method test ");
	}
	
	
	
}
