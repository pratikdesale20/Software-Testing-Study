package TestNG_KeyWords;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeOut {
 

@Test(timeOut=500)
  public void B() throws InterruptedException 
  {
	  Thread.sleep(100);
	  Reporter.log("B method is running", true);
  }
  
  @Test(priority=-2)
  public void C() 
  {
	  Reporter.log("C method is running", true);
  }
  
  @Test(invocationCount=3 )
  public void A() throws InterruptedException 
  {
	  Thread.sleep(200);
	  Reporter.log("A method is running", true);
  }
  
  @BeforeMethod
  public void E() 
  {
	  Reporter.log("E method is running", true);
  }
  
  
  
  
  
  
  
  
  
  
  
}
