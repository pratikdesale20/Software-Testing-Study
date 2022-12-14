package upstoxUsing_Excel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonMethod_Used.CommonlyUsed_Methods;

public class HomePage {

	
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement username;
	
	
	public 	HomePage(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);	
	}
		
		
	public void ValidateUsername(String expUN,WebDriver driver) throws IOException
	{
		String ActualUserName=username.getText();
		
		
		
		// scroll to userId
		
		CommonlyUsed_Methods.scrollIntoView(driver, username);
		
		// take screenshot 
		
		CommonlyUsed_Methods.takeScreenShot(driver, ActualUserName);
		
	
		if(ActualUserName.equals(expUN))
		   {
		     	System.out.println("Username Matching TestCase Is Pass");
		   }
		       else
		   {
		     	System.out.println("Username not matcing Testcase is Fail");
		   }	
				
		
		
		
	}
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
