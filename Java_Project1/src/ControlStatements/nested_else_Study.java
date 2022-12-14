package ControlStatements;

public class nested_else_Study {

	public static void main(String[] args) 
	{
		// if User ID is correct-->correct user ID -->Please enter Password
		// if password is correct-->correct password-->login successful
		// else password is incorrect-->please check you password,unable to login
		// else-->incorrect user ID
		
	 String USD="Pratik";
	 String Password="Pratik@123";
	 
	 if (USD=="Pratik")
	 {
	     System.out.println("Please enter Password");
	     if (Password=="Pratik@123")
	     {
	    	 System.out.println("correct password--login successful");
	     }
	     else
	     {
	    	 System.out.println("please check you password,unable to login");
	     }
	 }
	 
	 else
	 {
		 System.out.println("login fail");
	 }
	 
	 
	}

}
