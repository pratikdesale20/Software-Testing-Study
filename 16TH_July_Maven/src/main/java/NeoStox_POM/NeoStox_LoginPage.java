package NeoStox_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Neostox_Utility.Utility;

public class NeoStox_LoginPage 
{
	
	@FindBy(id="MainContent_signinsignup_txt_mobilenumber") private WebElement  EnterMobileNumber;
	
	
	@FindBy(id="lnk_signup1")private WebElement LoginButton;
	
	
	public NeoStox_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void UsernameField(WebDriver driver,String mobNum)
	{    
		Utility.wait(driver, 1000);
		EnterMobileNumber.sendKeys(mobNum);
		Reporter.log("Entering mobile Number",true);
	}
	
	public void SignUpButton(WebDriver driver)
	{
		Utility.wait(driver, 1000);
		LoginButton.click();
		Reporter.log("Clicking on signIn button",true);
	}
	
	
	
	

}
