package method1;

public class MathOperation {

	public static void main(String[] args) {
		
    MathOperation M=new MathOperation();
       M.addition();
       M.subtraction();
       addition1();
       subtraction1();
       //  method with parameter
         M.add(25, 25);
         M.sub(100, 50);
       
       
  }
	 public void addition()
	   {
		   int a=100;
		   int b=150;
		   int Sum= a+b;
		   System.out.println("addition is:-"+Sum);	   
	   }
	  public void subtraction()
	  {
		  int a=100;
		  int b=150;
		  int Subtraction= b-a;
		  System.out.println("Sunstraction:-"+Subtraction);
      }
	   public static void addition1()
	   {
		   int a=120;
		   int b=80;
		   int Sum= a+b;
		   System.out.println("addition1 is:-"+Sum);}	
		   
		public static void subtraction1()
		{
		      int a=120;
			  int b=80;
			  int Subtraction= b-a;
		  System.out.println("Substraction1 is:-"+Subtraction);
	    }
	       /// Method with Parameters\Arguments\Signature
	        	public void add(int a,int b)
	  	{
			   int sum=a+b;
			   System.out.println("add is: "+sum);
		}
		       public void sub(int a,int b)
        {
		    	int sub=a-b;
		    	System.out.println("Sub is: "+sub);    	   
		 }
		
		
		
		
		
		
		
		
		
		
		

}
