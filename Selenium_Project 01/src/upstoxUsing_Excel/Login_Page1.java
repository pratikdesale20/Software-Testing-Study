package upstoxUsing_Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page1 {

	
    @FindBy(name = "userId") private WebElement userID;
	 
	 
	 @FindBy(name = "password")private WebElement password;
	 
	 
	 @FindBy(xpath = "//div[text()='Sign into Upstox']") private WebElement loginbutton;
	 
	 @FindBy(xpath = "//a[text()='Log out']")private WebElement  logOut;
	 
	
	 
 public Login_Page1(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }	
	
	
	
 public void enterUserName(String UI)
 {
	 
	    userID.sendKeys(UI);
 }

public void enterPassWord(String pass)
{
	password.sendKeys(pass);
}


public void clickOnLoginButton() 
{
	loginbutton.click();
}



public void logOutBotton()
{
	logOut.click();
}

	
	
	
	
	
	
	
	
	
	
}
