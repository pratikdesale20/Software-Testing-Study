package Upstox_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_PasscodePage {

// variable declared
	
	@FindBy(name="yob")private WebElement yearOfBirth;
	
// variable Initialization 	
	
	public Upstox_PasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
// Utilize methods 
	public void enterpasscode()
	{
		yearOfBirth.sendKeys("1991");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
