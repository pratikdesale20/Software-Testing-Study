package Upstox_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_WelcomePage {

 @FindBy(xpath="//div[text()='No, I’m good']")private WebElement NoIAmGoodButton;
	 
	
	public Upstox_WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickOnIAmGoodButton()
	{
		NoIAmGoodButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
