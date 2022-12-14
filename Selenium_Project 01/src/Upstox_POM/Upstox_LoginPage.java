package Upstox_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_LoginPage {

  // variable declaration (Globally)= o.of.elements = no.of.variable
	
// 1) Data member should be declared globally with access level private using
	
	@FindBy(name="userId")private WebElement userID;
	
	
	@FindBy(name = "password") private WebElement password;
	
	
	@FindBy(id="submit-btn") private WebElement signbutton;
	
	
// 2) Initilize within a constructor with access level public using PageFactory
	
	public Upstox_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
// 3) Utilize within a method with access level public
	
	public void enterUserID()
	{
		userID.sendKeys("BB3263");
	}
	
	public void enterPassword()
	{
		password.sendKeys("Rajendra@123");
	}
	
	public void ClickOnSignButton()
	{
		 signbutton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
