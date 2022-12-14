package TestNG_KeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test(priority=2)
  public void D() 
  {
	  Reporter.log("D method is running", true);
  }
  
  @Test
  public void B() 
  {
	  Reporter.log("B method is running", true);
  }
  
  @Test(priority=1)
  public void C() 
  {
	  Reporter.log("C method is running", true);
  }
  
  @Test(priority=-1)
  public void A() 
  {
	  Reporter.log("A method is running", true);
  }
  
  @Test (priority=-2)
  public void E() 
  {
	  Reporter.log("E method is running", true);
  }
  
  
  
  
  
  
  
  
  
  
  
}
