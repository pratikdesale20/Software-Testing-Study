package method1;

public class Pune_University_WithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pune_University_WithParameter pu=new Pune_University_WithParameter(); //-- Create object
		
		   pu.studentinfo("Pratik Desale", 'M', "B.E Mechanical", 24f, 754855);
		   
		   
		   pu.studentinfo("Tejas Gangurde", 'M', "Agriculture", 24f, 101010);
		 
		  
		   		
		
		   
	}
       // I want to store name\gender\dept\age\PRN
	   // method with parameter \ Argument
	
	public void studentinfo(String StudentName,char StudentGender,String StudentDept,float StudentAge,int StudentPRN)
	
	{
		System.out.println("student name is "+StudentName);
		System.out.println("student gender is "+StudentGender);
		System.out.println("student department is "+StudentDept);
		System.out.println("student age is "+StudentAge);
		System.out.println("student PRN Number is "+StudentPRN);
		
		
	}
	
	
	
}
