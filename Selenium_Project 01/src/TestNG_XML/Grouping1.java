package TestNG_XML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping1 {
	
  @Test(groups="Regression")
  public void TC1() 
  {
	  Reporter.log("TC1 regression Running",true);
  }
  
  @Test(groups="Sanity")
  public void TC2() 
  {
	  Reporter.log("TC2 Sanity Running",true);
  }
  
  
  @Test(groups="Regression")
  public void TC3() 
  {
	  Reporter.log("TC3 regression Running",true);
  }
  
  
  @Test(groups="Sanity")
  public void TC4() 
  {
	  Reporter.log("TC4 sanity Running",true);
  }
  
  
  
  
  
  
  
  
  
  
  
}
