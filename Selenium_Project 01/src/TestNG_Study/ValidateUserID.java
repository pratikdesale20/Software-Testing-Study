package TestNG_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateUserID {
  @Test
  public void ValidateUpstoxUserID()
  {
	  Reporter.log("User ID Validate", true);
  }
  
  @BeforeMethod
  public void LoginToUpstox()
  {
	  Reporter.log("Login Success", true);
  }
  
  @AfterMethod
  public void LogOutFromUpstox()
  {
	  Reporter.log("Logging Out", true);
  }
  
  @BeforeClass
  public void LaunchBrowser()
  {
	  Reporter.log("launching Browser", true);
  }
  
  @AfterClass
  public void CloseBrowser()
  {
	  Reporter.log("ClosingBrowser", true);
  }
  
  
}
