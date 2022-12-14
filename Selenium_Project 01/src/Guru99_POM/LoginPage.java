package Guru99_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 

 {
// variable declaration (Globally)= o.of.elements = no.of.variable
	 
	 @FindBy(name = "uid") private WebElement userid;
	 
	 
	 @FindBy(name = "password")private WebElement password;
	 
	 
	 @FindBy(name = "btnLogin") private WebElement loginbutton;
	 
	 @FindBy(xpath = "//a[text()='Log out']")private WebElement  logOut;
	 
	 
// 2) Initilize within a constructor with access level public using PageFactory
			 
	 public LoginPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 
// 3) Utilize within a method with access level public	 
	 
	
	 
	 
   public void enterUserName()
	    {
		 
		    userid.sendKeys("mngr452491");
	    }
	 
	public void enterPassWord()
	{
		password.sendKeys("badYvyv");
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


