package NeoStox_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Neostox_Utility.Utility;

public class Neostox_PasswordPage {

	
	@FindBy(id="txt_accesspin")private WebElement password;
	
	
	@FindBy(id="lnk_submitaccesspin")private WebElement submitButton;
	
	
	public Neostox_PasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void Password(WebDriver driver,String pass)
	{   Utility.wait(driver, 3000);
		password.sendKeys(pass);
		Reporter.log("Entering password",true);
	}
	
	
	public void SubmitButton(WebDriver driver)
	{   Utility.wait(driver, 1000);
		submitButton.click();
		Reporter.log("Clicking on submit button",true);
	}
	
	
	
	
}
