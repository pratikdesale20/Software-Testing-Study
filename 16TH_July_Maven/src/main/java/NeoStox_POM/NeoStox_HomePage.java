package NeoStox_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Neostox_Utility.Utility;

public class NeoStox_HomePage {

	
	@FindBy(xpath="(//a[text()='OK'])[2]") private WebElement OkButton;
	
	@FindBy(xpath="(//a[text()='Close'])[5]") private WebElement closeButton;
	
	 @FindBy(id="lbl_username") private WebElement userName;
	 
	 @FindBy(id="lbl_curbalancetop") private WebElement ACCBalance;
	 
	 @FindBy(xpath="//span[text()='Logout']") private WebElement LogOutButton;
	
	
	public NeoStox_HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void handlePopUp(WebDriver driver) throws InterruptedException
	{   
		   if(OkButton.isDisplayed())
   {   
		   Utility.wait(driver, 1000);
		   OkButton.click();
		   Reporter.log("handling PopUp",true);
		   Reporter.log("Clicking on OK Button of PopUp",true);
		   Utility.wait(driver, 1000);
		   closeButton.click();
		   Reporter.log("Clicking on Close button of PopUp",true);
	}
	     
          else
		   {
			     Reporter.log("there is no PopUp",true);
			     Thread.sleep(1000);
		   }		   
     }  
	
	
	public String getActualUserName(WebDriver driver)
	{
		Utility.wait(driver, 1000);
		String actualUserName = userName.getText();
		
		Reporter.log("getting actual user name",true);
		String realUserName = actualUserName.substring(3);
		Reporter.log("Actual UserName is "+realUserName,true);
		return actualUserName;
		
	}
	
  public String getACCBalance(WebDriver driver)
  
    {
	     Utility.wait(driver, 1000);
	     String accBalance = ACCBalance.getText();
	     Reporter.log("getting accBalance",true);
	     Reporter.log("Account Balance is "+accBalance,true);
	     return accBalance;
	 }
	
	
  public void logOut(WebDriver driver)
  {
	  Utility.wait(driver, 1000);
	  userName.click();
	  Utility.wait(driver, 1000);
	  LogOutButton.click();
	  Reporter.log("Logging out",true);
	  
	  
  }
	
	
	
	
	
	
	
	
	
}
