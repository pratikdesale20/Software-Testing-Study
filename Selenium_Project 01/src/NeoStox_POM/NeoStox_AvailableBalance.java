package NeoStox_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStox_AvailableBalance 
{

	
	
	@FindBy(xpath="(//div[@class='nav-item dropdown drop-down righttopmenu2']//span)[6]") private WebElement AvailableBalance;
	
	
	
	public NeoStox_AvailableBalance(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void AvailableFunds()
	{
		AvailableBalance.getText();
	}
	
	
	
	
	
	
	
	
	
	
	
}
