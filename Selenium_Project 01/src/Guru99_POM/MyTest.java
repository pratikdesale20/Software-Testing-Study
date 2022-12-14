package Guru99_POM;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class MyTest {

	public static void main(String[] args) throws InterruptedException, IOException  {
		
System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Notes\\QA\\chromedriver_win32\\chromedriver.exe");
	        
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
			     
		 driver.get("https://demo.guru99.com/v4/");	 	

	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));	 
		
		
	// create object login page 	
		
		LoginPage LP=new LoginPage(driver);
		
		LP.enterUserName();
		LP.enterPassWord();
		LP.clickOnLoginButton();
		
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

    // create object of get Account Id

      Get_AccountID id=new Get_AccountID(driver);
      id.gettext();
		
		
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

	// create object of add account	
		
		AddAccount AA=new AddAccount(driver);
		
		AA.ClickOnNewAccount();
		AA.enterCustomerID();
		AA.enterDepositeAmount();
		AA.clickOnSubmitButton();
		
id.getAccountID(driver, null);	
		
System.out.println("============================================================");
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

select_SEO_Dropbox P=new select_SEO_Dropbox(driver);

P.ClickOnSEODropbox();
P.selectPage();
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
P.getHeadline();

driver.navigate().back();

LP.logOutBotton();






		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
