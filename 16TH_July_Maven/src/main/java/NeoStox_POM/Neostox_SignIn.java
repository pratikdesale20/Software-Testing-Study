package NeoStox_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Neostox_Utility.Utility;

public class Neostox_SignIn {

	

	@FindBy(xpath="(//a[text()='Sign In'])[1]") private WebElement SignInButton;
	
	public Neostox_SignIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickOnSignIn(WebDriver driver)
	{
		Utility.wait(driver, 1000);
		Reporter.log("Clicking on sign in button",true);
		SignInButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
