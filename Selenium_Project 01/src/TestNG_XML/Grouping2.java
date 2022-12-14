package TestNG_XML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping2 {
	
  @Test(groups="Regression")
  public void TC5() 
  {
	  Reporter.log("TC5 regression Running",true);
  }
  
  @Test(groups="Sanity")
  public void TC6() 
  {
	  Reporter.log("TC6 Sanity Running",true);
  }
  
  
  @Test(groups="Regression")
  public void TC7() 
  {
	  Reporter.log("TC7 regression Running",true);
  }
  
  
  @Test(groups="Sanity")
  public void TC8() 
  {
	  Reporter.log("TC8 sanity Running",true);
  }
  
  
  @Test(groups="Regression")
  public void TC9() 
  {
	  Reporter.log("TC9 regression Running",true);
  }
  
  
  
  
  
  
  
  
}
