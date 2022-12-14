package abstract_Class_Study;

public  class Concrete_Class extends Test
{

	public static void main(String[] args) 
	{        Concrete_Class c=new Concrete_Class();
	             c.demo1();
	             c.demo2();
	             c.demo3();
	             
	             c.demo();
	}

	public void demo1()
	{
		System.out.println("demo1 method complete concrete class");
	}
	
	public void demo2()
	{
		System.out.println("demo2 method from concrete class");
	}
	
	public void demo3()
	{
		System.out.println("demo3 method complete concrete class ");
	}
	
}
