package NeoStox_TestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import NeoStox_POM.Base;
import NeoStox_POM.NeoStox_HomePage;
import NeoStox_POM.NeoStox_LoginPage;
import NeoStox_POM.Neostox_PasswordPage;
import NeoStox_POM.Utility;

public class ValidateNeoStox_AccountBalance extends Base{
  
	
	NeoStox_LoginPage Login;
	Neostox_PasswordPage pass;
	NeoStox_HomePage home;
	
	@BeforeClass
	public void launchNeoStox() throws InterruptedException, IOException
	{
		LaunchBrowser();   // from base class
		Login = new  NeoStox_LoginPage(driver);
		pass= new Neostox_PasswordPage(driver);
		home= new NeoStox_HomePage(driver);
		
	}
	
	@BeforeMethod
	public void loginNeoStox() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Login.UsernameField(driver, Utility.readExcelData(11, 0));
		Login.SignUpButton(driver);
		Utility.wait(driver, 2000);
		
		pass.Password(driver, Utility.readExcelData(11, 1));
		Thread.sleep(1000);
		pass.SubmitButton(driver);
		Utility.wait(driver, 4000);
		
		home.handlePopUp(driver);
	}
	

	@Test
  public void validateACCBalance() throws EncryptedDocumentException, IOException 
	  {
	
	     Assert.assertNotNull(home.getACCBalance(driver), "TC failed Unable to fetch account balance");
		 Utility.screenshot(driver, "ACCBalance");
      }
	
	
	@AfterMethod
	public void LogOutFromNeostox()
	{
		home.logOut(driver);
	}
	
	@AfterClass
	public void closBrowser()
	{
		Reporter.log("closing Browser",true);
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

