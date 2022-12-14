package TestNG_KeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOn {
 
	@Test
  public void D() 
  {
	  Reporter.log("D Method is running ", true);
	  
  }
  
	@Test(timeOut=100)
	  public void A() throws InterruptedException 
	  {
		  Thread.sleep(500);
		  Reporter.log("A Method is running ", true);
	   }
	  
	
	@Test(dependsOnMethods= {"A","D"},invocationCount=3)
	  public void C() 
	  {
		  Reporter.log("C Method is running ", true);
		  
	  }
	  
   
	@Test
	  public void B() 
	  {
		  Reporter.log("B Method is running ", true);
		  
	  }
	  
  
  
  
  
  
  
}
