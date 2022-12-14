package NeoStox_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import NeoStox_Base.Base1;
//import NeoStox_POM.Base;
import NeoStox_POM.NeoStox_HomePage;
import NeoStox_POM.NeoStox_LoginPage;
import NeoStox_POM.Neostox_PasswordPage;
import NeoStox_POM.Neostox_SignIn;
import Neostox_Utility.Utility;
import Neostox_Utility.UtilityNew;



@Listeners(NeoStox_Base.listener.class) 

public class MultipleTestCases extends Base1
{
	
		
	    NeoStox_LoginPage Login;
		Neostox_PasswordPage pass;
		NeoStox_HomePage home;
		Neostox_SignIn signIn;
		
		
		@BeforeClass
	    public void launchNeoStox() throws InterruptedException, IOException
		{
			LaunchBrowser();   // from base class
			
			Login = new  NeoStox_LoginPage(driver);
			pass= new Neostox_PasswordPage(driver);
			home= new NeoStox_HomePage(driver);
			signIn=new Neostox_SignIn(driver);
			
		}
		
		@BeforeMethod
		public void loginNeoStox() throws EncryptedDocumentException, IOException, InterruptedException
		{
			signIn.ClickOnSignIn(driver);
			Thread.sleep(1000);
			Login.UsernameField(driver, UtilityNew.readDataFrompropertyFile("mobNum"));
			Login.SignUpButton(driver);
			Utility.wait(driver, 2000);
			
			pass.Password(driver, UtilityNew.readDataFrompropertyFile("password"));
			Thread.sleep(1000);
			pass.SubmitButton(driver);
			Utility.wait(driver, 1000);
			Thread.sleep(3000);
			home.handlePopUp(driver);
			
		}
		
		
	  @Test(priority=-1)
	  public void validateUserID() throws EncryptedDocumentException, IOException 
			  {
			      
			     Assert.assertEquals(home.getActualUserName(driver), UtilityNew.readDataFrompropertyFile("userName"),"TC is Failed Actual Ans Expected User are not matching");
				 
			     Utility.screenshot(driver, home.getActualUserName(driver));
				
		      }
			
		
	  @Test
	  public void validateACCBalance() throws EncryptedDocumentException, IOException 
		  {
		     
		     Assert.assertNotNull(home.getACCBalance(driver), "TC failed Unable to fetch account balance");
			
			 Reporter.log("AC balance is "+home.getACCBalance(driver), true);
			 
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
