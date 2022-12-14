package polymorphism;

public class Compile_Time {
  // Declaring multiple methods with same method name but with different argument 
	// in a same class is called method overloading
	
	public static void main(String[] args)
	{
		Compile_Time CT=new Compile_Time();
		 CT.sub();
		 CT.add(24, 53);
				

	}
public void sub()  // method with no parameter
{
	short b=50;
	short c=25;
	int sub=b-c;
	System.out.println(sub);
}

 void add(int d,int e)  // method with different parameter
 {
	 
	 int sum=d+e;
	 System.out.println(sum);
	 
 }
	
	
	
	
	
}
