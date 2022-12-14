package methods;

public class PuneUniversity {

	public static void main(String[] args) {
		
   //  student information contain-->>> Name, gender , age,Height & Department.
		studentinfo1(); //--->>> call static method
     PuneUniversity In=new PuneUniversity(); //--->> call Non-Static method
       In.studentinfo();
       
       
	}
           public void studentinfo()
           {
        	   String Name= "Pratik Desale";
        	   char gender='M';
        	   int age=	24;
        	   float height= 5.5f;
        	   String department= "B.E-Mechanical Engg";
        System.out.println("My Name:-"+Name);
        System.out.println("My Gender:-"+gender);
        System.out.println("My Age:-"+age);
        System.out.println("My department:-"+department); 
        System.out.println("My Height:-"+height);
           }
       public static void studentinfo1()
       {     String Name= "Pratik Desale";
	         char gender='M';
	         int age=	24;
	         float height=5.5f;
	         String department= "B.E-Mechanical Engg";
	         System.out.println("My Name:-"+Name);
	         System.out.println("My Gender:-"+gender);
	         System.out.println("My Age:-"+age);
	         System.out.println("My department:-"+department);
	         System.out.println("My Height:-"+height);
       }
           
	
	
	
	
	
	
}
