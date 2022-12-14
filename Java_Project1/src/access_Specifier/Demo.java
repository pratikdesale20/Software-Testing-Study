package access_Specifier;

public class Demo{
   public static void main (String[]args)
{
    Demo d=new Demo();
    d.test1();
    d.test2();
    d.test3();
    d.test4();
    
    System.out.println("calling private member"+d.a);
	
}
   private int a=50;
       int b=10;       // default data member access--> within package only
     protected int c=30; // protected data member access--> within package & outside of by use inheritance concept  
     public int d=40;    // public data member access ---> access hole project 
    
     
   private void test1()
   {     
	   System.out.println("private method test 1");
   }
   void test2()
   {
	   System.out.println("default method test2");
   }
   protected void test3()
   {
	   System.out.println("Protected method test3");
   }
   public void test4()
   {
	   System.out.println("public method test4");
   }
   
   
   
   
   
   
   
   
   
   
   
   
}