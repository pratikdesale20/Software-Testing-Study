package this_and_Super_keyWork;

public class This_Use {

	int a=100;
	static int b=65;
	
	public static void main(String[] args)
	{
		This_Use t=new This_Use();
		  t.add();
		  System.out.println(t.a);
		  
	}
       public void add()
       {
    	   int a=30;
    	   System.out.println("local Variable a is "+a);
    	   System.out.println("global variable a is "+this.a);	
    	   
    	   int sum=50+this.a;
    	   System.out.println(sum);
    	   
    	   int sum1=25+a;
    	   System.out.println(sum1);
    	   
    	   
    	   
       }
       
	
	
	
	
	
	
	
	
	
	
}
