package Guru99_POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonMethod_Used.CommonlyUsed_Methods;

public class Get_AccountID {

	
	@FindBy(xpath="//table//tr[@class='heading3']")private WebElement refId;

	@FindBy(xpath = "(//table[@name='account'])//tr[4]//td[2]") private WebElement AccountNo;
	
	public Get_AccountID(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void gettext()
	{
		System.out.println(refId.getText());
	}
	
	
	public void getAccountID(WebDriver driver,String AccountNo) throws IOException
	{
		System.out.println("Account Id= "+AccountNo);
		
		// take Screenshot
		
		CommonlyUsed_Methods.takeScreenShot(driver, AccountNo);
		
	}
	
	
	
	
	
}
