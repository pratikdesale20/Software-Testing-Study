package Interface_Study;

public class IC2 implements interface3,interface4
{

	public static void main(String[] args) {
		IC2 ic2=new IC2();
		ic2.test1();
		ic2.test2();
		ic2.test3();
		ic2.test4();

	}

	@Override
	public void test3() {
		System.out.println("test 3 from interface 4");
		
	}

	@Override
	public void test4() {
		
		System.out.println("test 4 from interface 4");
	}

	@Override
	public void test1() {
		System.out.println("test 1 from interface 3");
		
	}

	@Override
	public void test2() {
		System.out.println("test 2 from interface 3");
		
	}

}
