package Interface_Study;

public class IC1 implements Interface2
{

	public static void main(String[] args) 
	{
		IC1 I1=new IC1();
		  I1.demo1();
		  I1.demo2();
		  I1.demo3();
		  I1.demo4();
		  I1.demo5();

	}
	

	@Override
	public void demo1() {
		System.out.println("demo 1 method from interface 1");
		
	}

	@Override
	public void demo2() {
		System.out.println("demo 2 method from interface 1");
		
	}

	@Override
	public void demo3() {
		System.out.println("demo 3 method from interface 1");
		
	}

	@Override
	public void demo4() {
		System.out.println("demo 4 method from interface 2");
		
	}

	@Override
	public void demo5() 
	{
		System.out.println("demo 5 method from interface 2");
	}

}
