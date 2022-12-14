package inherritance_study;

public class MultiLevel_inherritance {

	public static void main(String[] args) 
	
	{
		CL1 C1=new CL1();
		C1.Village();
		C1.city();
		
		CL2 C2 = new CL2();
		C2.city();
		C2.Village();
		C2.mobile();
		C2.phone();
		
		CL3 C3=new CL3();
		C3.city();
		C3.Village();
	
	
		C3.mahesh();
		C3.name();

	}

}

