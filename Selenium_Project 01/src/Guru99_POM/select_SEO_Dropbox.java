package Guru99_POM;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class select_SEO_Dropbox {

@FindBy(xpath = "(//a[@class='dropdown-toggle'])[3]") private WebElement SEODropbox;	
	
	@FindBy(xpath = "//a[text()='Page-4']") private WebElement  SelectPage;
	
	@FindBy(xpath = "//center[text()='THIS IS A DEMO PAGE FOR TESTING']")private WebElement  Headline;
	
	
public 	select_SEO_Dropbox(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
	
	
	public void ClickOnSEODropbox()
	{
//		Select object=new Select(SEODropbox);
//	
//		//object.selectByVisibleText("Page-4");
//		object.selectByValue("Page-4");
//		
//		System.out.println(object.getFirstSelectedOption().getText());
		
		SEODropbox.click();
}
	
	public void selectPage()
	{
		SelectPage.click();
	}
	
	
	
	public void getHeadline()
	{
		System.out.println("Heading of Page= "+Headline.getText());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
