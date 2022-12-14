package Guru99_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAccount {

	
	
	@FindBy(xpath = "//a[text()='New Account']") private WebElement clickOnNewAccount;
	
	@FindBy(name="cusid")private WebElement customerId;
	
	
	@FindBy(name = "inideposit")private WebElement initialDeposite;
	
	
	@FindBy(name = "button2") private WebElement submitButton;
	
	
public AddAccount(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	

public void ClickOnNewAccount()
{
	clickOnNewAccount.click();
}




public void enterCustomerID()
{
	customerId.sendKeys("93786");
}

public void enterDepositeAmount()
{
	initialDeposite.sendKeys("10000");
}

public void clickOnSubmitButton()
{
	submitButton.click();
}



















	
	
	
	
	
	
	
	
	
	
}
