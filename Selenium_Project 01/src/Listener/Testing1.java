package Listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listener.listener.class)

public class Testing1 {
  @Test
  public void A() 
  {
	   Reporter.log("A method is running",true);
   }
  
  @Test
  public void B() 
  {    Assert.fail();
	   Reporter.log("B method is running",true);
   }
  
  @Test(dependsOnMethods="B")
  public void C() 
  {
	   Reporter.log("C method is running",true);
  }
  
  
  
  
  
  
  
  
  
  
}
